package com.aaaws.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaaws.model.SaleOrder;
import com.aaaws.service.ISaleOrderService;
import com.aaaws.service.IShipmentTypeService;
import com.aaaws.service.IWhUserTypeService;
import com.aaaws.util.CommonUi;

@Controller
@RequestMapping("/sale")
public class SaleOrderController {

	@Autowired
	private ISaleOrderService service;
	@Autowired
	private IShipmentTypeService shipService;
	@Autowired
	private IWhUserTypeService whuserService;

	private void commonUi(Model model) {
		List<Object[]> list = shipService.getShipmentIdAndCode();
		Map<Integer, String> shipCodeMap = CommonUi.convert(list);
		model.addAttribute("shipCodeMap", shipCodeMap);
		
		List<Object[]> custCodeList=whuserService.getWhUserTypeIdAndCode("Customer");
		Map<Integer, String> custCodeMap=CommonUi.convert(custCodeList);
		model.addAttribute("custCodeMap", custCodeMap);
		
	}

	@RequestMapping("/register")
	public String registerSale(Model model) {
		model.addAttribute("saleOrder", new SaleOrder());
		commonUi(model);
		return "SaleOrderRegister";
	}

	@RequestMapping("/save")
	private String saveSaleOrder(@ModelAttribute SaleOrder saleOrder, Model model) {
		Integer id = service.saveSaleOrder(saleOrder);
		System.out.println(id);
		return "SaleOrderRegister";
	}

	@RequestMapping("/all")
	public String allSaleOrder(Model model) {
		List<SaleOrder> list = service.getAllSaleOrder();
		model.addAttribute("list", list);
		return "SalDataPage";
	}

	@RequestMapping("/view")
	public String viewSelectedId(@RequestParam("sid") Integer id, Model model) {
		SaleOrder saleOrder = service.getOneSaleOrder(id);
		model.addAttribute("saleOrder", saleOrder);
		return "SalViewPage";
	}

	@RequestMapping("/delete")
	public String deleteSelectedId(@RequestParam("sid") Integer id) {
		service.deleteSaleOrderById(id);
		return "redirect:all";
	}

	@RequestMapping("/edit")
	public String editSelectedId(@RequestParam("sid") Integer id, Model model) {
		SaleOrder saleOrder = service.getOneSaleOrder(id);
		model.addAttribute("saleOrder", saleOrder);
		commonUi(model);
		return "SaleUpdatePage";
	}

	@RequestMapping("/update")
	public String updateSaleOrderId(@ModelAttribute SaleOrder ob, Model model) {
		service.updateSaleOrder(ob);
		return "redirect:all";
	}
	
	
	
	
	
	
	
}
