package com.aaaws.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aaaws.model.ShipmentType;
import com.aaaws.service.IShipmentTypeService;
import com.aaaws.view.excel.ShipmentTypeExcelView;
import com.aaaws.view.pdf.ShipmentTypePdf;
import com.aaaws.view.util.ShipmentTypeUtil;

@Controller
@RequestMapping(value = "shipment")
public class ShipmentTypeController {

	@Autowired
	private IShipmentTypeService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private ShipmentTypeUtil util;

	/*
	 * @RequestMapping("/") public String welcomeShipmentType() { return
	 * "WelcomeShips"; }
	 */

	@RequestMapping(value = "/register")
	public String showRegister(Model model) {
		model.addAttribute("shipmentType", new ShipmentType());
	
		return "ShipmentTypeRegister";
	}

	@RequestMapping(value = "/save", method = POST)
	public String saveRegisterData(@ModelAttribute ShipmentType shipmentType, Model model) {
		System.out.println("Hello");
		Integer id = service.saveShipmentType(shipmentType);
		model.addAttribute("msg", "ShipmentType'" + id + "'Done");
		model.addAttribute("shipmentType", new ShipmentType());
		return "redirect:register";
	}

	@RequestMapping("/all")
	public String getAllShipmentType(Model model) {
		List<ShipmentType> slist = service.getAllShipmentTypes();
		model.addAttribute("lists", slist);
		return "ShipmentTypeData";
	}

	@RequestMapping("/delete")
	public String deleteByIdShipmentType(@RequestParam("sid") Integer id, Model model) {
		service.deleteShipmentTypeById(id);
		String smsg = "Deleted Record by Id '" + id + "' Done SuccessFully";
		model.addAttribute("msg", smsg);

		return "redirect:all";
	}

	@RequestMapping("/edit")
	public String editShipmentTypePage(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("stObj", st);
		return "ShipmentTypeEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateShipmentTypePage(@ModelAttribute ShipmentType shipmentType, Model model) {
		service.updateShipmentType(shipmentType);
		model.addAttribute("msg", "Updated with '" + shipmentType.getShipId());
		List<ShipmentType> std = service.getAllShipmentTypes();
		model.addAttribute("lists", std);

		return "ShipmentTypeData";
	}

	@RequestMapping(value = "/view")
	public String viewOneShipmentTypeData(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("stObj", st);
		return "ShipmentTypeView";
	}

	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value = "sid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		if (id == null) {
			List<ShipmentType> ships = service.getAllShipmentTypes();
			m.addObject("ship", ships);
		} else {
			ShipmentType st = service.getOneShipmentType(id);
			m.addObject("ship", Arrays.asList(st));
		}
		return m;
	}

	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "sid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypePdf());
		if (id == null) {
			List<ShipmentType> slist = service.getAllShipmentTypes();
			m.addObject("list", slist);
		} else {
			ShipmentType st = service.getOneShipmentType(id);
			m.addObject("list", Arrays.asList(st));
		}

		return m;

	}

	@RequestMapping("/chart")
	public String showCharts() {
		List<Object[]> list = service.getShipmentModeCount();
		String path = context.getRealPath("/");
		util.generatePie(path, list);
		util.generateBar(path, list);
		return "ShipmentTypeCharts";
	}

}
