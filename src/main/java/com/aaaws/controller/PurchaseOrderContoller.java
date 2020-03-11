package com.aaaws.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aaaws.model.PurchaseOrder;
import com.aaaws.service.IPurchaseOrderService;
import com.aaaws.service.IShipmentTypeService;
import com.aaaws.service.IWhUserTypeService;
import com.aaaws.util.CommonUi;
import com.aaaws.view.excel.PurchaseOrderExcelView;

@Controller
@RequestMapping("/porder")
public class PurchaseOrderContoller {
	@Autowired
	private IPurchaseOrderService service;
	@Autowired
	private IShipmentTypeService shipservice;
	@Autowired
	private IWhUserTypeService whUserService;

	private void commonUi(Model model) {
		List<Object[]> list = shipservice.getShipmentIdAndCode();
		Map<Integer, String> listShipCode = CommonUi.convert(list);
		model.addAttribute("listShipCode", listShipCode);
		
		List<Object[]> venCodeList = whUserService.getWhUserTypeIdAndCode("Vendor");
		Map<Integer, String> venCodeMap = CommonUi.convert(venCodeList);
		model.addAttribute("venCodeMap", venCodeMap);
	}

	private void setDefaultStatus(Model model) {
		PurchaseOrder po=new PurchaseOrder();
		po.setPurSts("Open");
		model.addAttribute("purchaseOrder", po);
	} 
	
	@RequestMapping("/register")
	public String showRegister(Model model) {
		setDefaultStatus(model);
		commonUi(model);
		return "PurOrderRegister";
	}
	
	@RequestMapping(value = "/save", method = POST)
	public String savePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder, Model model) {
		service.savePurchaseOrder(purchaseOrder);
		setDefaultStatus(model);
		commonUi(model);
		return "PurOrderRegister";
	}
	
	@RequestMapping(value = "/all")
	public String dataPurchaseOrder(Model model) {
		model.addAttribute("list", service.getAllPurchaseOrders());
		return "PurOrderData";
	}

	@RequestMapping("/delete")
	public String deletePurchaseById(@RequestParam("pid") Integer id) {
		service.deletePurchaseOrderById(id);
		return "redirect:all";
	}

	@RequestMapping("/view")
	public String viewPurchaseById(@RequestParam("pid") Integer id, Model model) {
		model.addAttribute("purchaseOrder", service.getOnePurchaseOrder(id));
		return "PurOrderView";
	}

	@RequestMapping("/edit")
	public String editPurchaseOrder(@RequestParam("pid") Integer id, Model model) {
		model.addAttribute("purchaseOrder", service.getOnePurchaseOrder(id));
		return "PurOrderEdit";
	}

	@RequestMapping(value = "/update", method = POST)
	public String updatePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder, Model model) {
		service.updatePurchaseOrder(purchaseOrder);
		return "redirect:all";
	}

	@RequestMapping("/excel")
	public ModelAndView excelData(@RequestParam(value = "pid", required=false) Integer id, Model model) {
		ModelAndView m =new ModelAndView();
		m.setView(new PurchaseOrderExcelView());
		if(id==null) {
			List<PurchaseOrder> purchaseList=service.getAllPurchaseOrders();
			m.addObject("purchaseList", purchaseList);
		}else {
			PurchaseOrder purchaseList=service.getOnePurchaseOrder(id);
			m.addObject("purchaseList", Arrays.asList(purchaseList));
		}
		return m;
	}
	
	
}
