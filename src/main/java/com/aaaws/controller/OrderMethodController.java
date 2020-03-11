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

import com.aaaws.model.OrderMethod;
import com.aaaws.service.IOrderMethodService;
import com.aaaws.view.excel.OrderMethodExcelView;
import com.aaaws.view.pdf.OrderMethodPdf;
import com.aaaws.view.util.OrderMethodUtil;

@Controller
@RequestMapping("/order")
public class OrderMethodController {

	@Autowired
	private IOrderMethodService service;
	@Autowired
	private OrderMethodUtil util;
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/register")
	public String showRegisterPage(@ModelAttribute OrderMethod orderMethod, Model model) {

		return "OrderMethodRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOrderedPage(@ModelAttribute OrderMethod orderMethod, Model model) {
		Integer id = service.saveOrderMethod(orderMethod);
		String msg = "Data is saved by Id'" + id;
		model.addAttribute("orderObj", new OrderMethod());
		model.addAttribute("msg", msg);
		return "redirect:register";
	}

	@RequestMapping("/all")
	public String allOrderMethodData(Model model) {
		List<OrderMethod> lists = service.getAllOrderMethod();
		model.addAttribute("ordlists", lists);
		return "OrderMethodData";
	}

	@RequestMapping("/delete")
	public String deleteBySelectedById(@RequestParam("oid") Integer id, Model model) {
		service.deleteById(id);
		return "redirect:all";
	}

	@RequestMapping("/view")
	public String viewOneOrderMethod(@RequestParam("oid") Integer id, Model model) {
		OrderMethod om = service.getOneOrderMethod(id);
		model.addAttribute("obj", om);

		return "OrderMethodView";
	}

	@RequestMapping("/edit")
	public String editBySelectedById(@RequestParam("oid") Integer id, Model model) {
		OrderMethod orderMethod = service.getOneOrderMethod(id);
		model.addAttribute("ob", orderMethod);
		return "OrderMethodEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateOrderMethodData(@ModelAttribute OrderMethod orderMethod, Model model) {
		service.saveOrderMethod(orderMethod);
		model.addAttribute("obj", orderMethod);
		return "redirect:all";
	}

	@RequestMapping("/excel")
	public ModelAndView excelOrderData(@RequestParam(value = "oid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new OrderMethodExcelView());
		if (id == null) {
			List<OrderMethod> lists = service.getAllOrderMethod();
			m.addObject("orders", lists);
		} else {
			OrderMethod om = service.getOneOrderMethod(id);
			m.addObject("orders", Arrays.asList(om));

		}
		return m;
	}

	@RequestMapping("/pdf")
	public ModelAndView pdfData(@RequestParam(value = "oid", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new OrderMethodPdf());
		if (id == null) {
			List<OrderMethod> olist = service.getAllOrderMethod();
			m.addObject("list", olist);
		} else {
			OrderMethod om = service.getOneOrderMethod(id);
			m.addObject("list", Arrays.asList(om));
		}
		return m;
	}

	@RequestMapping("/chart")
	public String showChart() {
		List<Object[]> list=service.getOrderModeCount();
		String path=context.getRealPath("/");
		util.generateBarChart(path, list);
		util.generatePie(path, list);
		return "OrderChart";
	}
	
	
}
