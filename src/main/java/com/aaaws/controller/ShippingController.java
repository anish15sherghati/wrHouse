package com.aaaws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaaws.model.Shipping;
import com.aaaws.service.IShippingService;

@Controller
@RequestMapping("/shipping")
public class ShippingController {
	@Autowired
	private IShippingService service;

	@RequestMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("shipping", new Shipping());
		return "ShippingRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveShipping(@ModelAttribute Shipping shipping, Model model) {
		service.saveShipping(shipping);
		model.addAttribute("shipping", new Shipping());
		return "ShippingRegister";
	}

	@RequestMapping("/all")
	public String allShipping(Model model) {
		List<Shipping> list = service.getAllShipping();
		model.addAttribute("list", list);
		return "ShippingData";
	}

	@RequestMapping("/one")
	public String getOneShipping(@RequestParam("sid") Integer id, Model model) {
		Shipping obj = service.getOneShippingById(id);
		model.addAttribute("ship", obj);
		return "ShippingView";
	}

	@RequestMapping("/delete")
	public String deleteShipping(@RequestParam("sid") Integer id, Model model) {
		return "redirect:all";
	}

	@RequestMapping("/edit")
	public String editShipping(@RequestParam("sid") Integer id, Model model) {
		Shipping ship = service.getOneShippingById(id);
		model.addAttribute("ship", ship);
		return "ShippingUpdate";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateGrn(@ModelAttribute Shipping shipping, Model model) {
		service.updateSelectedShipping(shipping);
		return "redirect:all";
	}

}
