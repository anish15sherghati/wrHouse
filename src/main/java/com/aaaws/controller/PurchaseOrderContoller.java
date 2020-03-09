package com.aaaws.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaaws.model.PurchaseOrder;
import com.aaaws.service.IPurchaseOrderService;
import com.aaaws.service.IShipmentTypeService;
import com.aaaws.util.CommonUi;

@Controller
@RequestMapping("/porder")
public class PurchaseOrderContoller {

	@Autowired
	private IPurchaseOrderService service;
	@Autowired
	private IShipmentTypeService shipservice;

	private void commonui(Model model) {
		List<Object[]> list=shipservice.getShipmentIdAndCode();
		Map<Integer,String> listCode=CommonUi.convert(list);
		model.addAttribute("listCode", listCode);
	}
	
	@RequestMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("purchaseOrder", new PurchaseOrder());
		commonui(model);
		return "PurOrderRegister";
	}

	@RequestMapping(value = "/save", method = POST)
	public String savePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder, Model model) {
		Integer id = service.savePurchaseOrder(purchaseOrder);
		String msg = "saved by" + id;
		model.addAttribute("msg", msg);
		model.addAttribute("purchaseOrder", new PurchaseOrder());
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
	public String viewPurchaseById(@RequestParam("pid")Integer id,Model model) {
		model.addAttribute("purchaseOrder", service.getOnePurchaseOrder(id));
		return "PurOrderView";
	}
	
	@RequestMapping("/edit")
	public String editPurchaseOrder(@RequestParam("pid")Integer id,Model model) {
		model.addAttribute("purchaseOrder", service.getOnePurchaseOrder(id));
		return "PurOrderEdit";
	}
	@RequestMapping(value="/update",method=POST)
	public String updatePurchaseOrder(@ModelAttribute PurchaseOrder purchaseOrder,Model model) {
		service.updatePurchaseOrder(purchaseOrder);
		return "redirect:all";
	}
	
	
	
	
}
