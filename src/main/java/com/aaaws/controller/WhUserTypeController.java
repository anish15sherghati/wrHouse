package com.aaaws.controller;

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

import com.aaaws.model.WhUserType;
import com.aaaws.service.IWhUserTypeService;
import com.aaaws.view.excel.WhUserTypeExcelView;
import com.aaaws.view.util.WhUserTypeUtil;

@Controller
@RequestMapping("/whuser")
public class WhUserTypeController {
	@Autowired
	private IWhUserTypeService service;

	@Autowired
	private WhUserTypeUtil util;
	@Autowired
	private ServletContext context;
	
	
	
	@RequestMapping("/register")
	public String registerWhUser(Model model) {
		model.addAttribute("whUserType", new WhUserType());
		return "WhUserRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveWhUser(@ModelAttribute WhUserType whUserType, Model model) {
		Integer id = service.saveWhUserType(whUserType);
		String msg = "Register done by' " + id + " 'Done";
		model.addAttribute("msgs", msg);
		model.addAttribute("whUserType", new WhUserType());
		return "WhUserRegister";
	}

	@RequestMapping("/all")
	public String showWhUser(Model model) {
		List<WhUserType> ls = service.getAllWhUserType();
		model.addAttribute("lists", ls);
		return "WhUserData";
	}

	@RequestMapping("/delete")
	public String deleteSelectByIdData(@RequestParam("wid") Integer id, Model model) {
		service.deleteWhUserTypeById(id);
		return "redirect:all";
	}

	@RequestMapping("/view")
	public String viewSelectedId(@RequestParam("wid") Integer id, Model model) {
		WhUserType wh = service.getWhUserTypeById(id);
		model.addAttribute("whObj", wh);
		return "WhUserView";
	}

	@RequestMapping("/edit")
	public String editSelectedId(@RequestParam("wid") Integer id, Model model) {
		WhUserType whObj = service.getWhUserTypeById(id);
		model.addAttribute("whUserView", whObj);
		System.out.println("Edit");
		return "WhUserEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateSelectedId(@ModelAttribute WhUserType whUserType, Model model) {
		service.updateSelectedId(whUserType);
		return "redirect:all";
	}

	@RequestMapping("/excel")
	public ModelAndView excelWhUSerData(@RequestParam(value = "wid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new WhUserTypeExcelView());
		if (id == null) {
			List<WhUserType> list = service.getAllWhUserType();
			m.addObject("whObj", list);
		} else {
			m.addObject("whObj", Arrays.asList(service.getWhUserTypeById(id)));
		}
		return m;
	}

	@RequestMapping("/pdf")
	public ModelAndView pdfWhUSerData(@RequestParam(value = "wid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new WhUserTypeExcelView());
		if (id == null) {
			m.addObject("whObj", service.getAllWhUserType());
		} else {
			m.addObject("whObj", service.getAllWhUserType());
		}
		return m;
	}
	@RequestMapping("/chart")
	public String showChart() {
		List<Object[]> list=service.getWhUserTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		
		return "WhUserChart";
	}



}
