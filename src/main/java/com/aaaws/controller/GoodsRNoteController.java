package com.aaaws.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaaws.model.GoodsRNote;
import com.aaaws.service.IGoodsRNoteService;
import com.aaaws.service.IPurchaseOrderService;
import com.aaaws.util.CommonUi;

@Controller
@RequestMapping("/grn")
public class GoodsRNoteController {

	@Autowired
	private IGoodsRNoteService service;
	@Autowired
	private IPurchaseOrderService purchaseService;
	
	private void commonUi(Model model) {
		List<Object[]> purCodeList=purchaseService.getPurchaseOrderIdAndCode();
		Map<Integer,String> purCodeMap=CommonUi.convert(purCodeList);
		model.addAttribute("purCodeMap", purCodeMap);
	}

	@RequestMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("goodsRNote", new GoodsRNote());
		commonUi(model);
		return "GrnRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGrN(@ModelAttribute GoodsRNote goodsRNote, Model model) {
		List<GoodsRNote> list = service.getAllGoodsRNotes();
		model.addAttribute("goodsRNote", new GoodsRNote());
		System.out.println(list);
		return "GrnRegister";
	}

	@RequestMapping("/all")
	public String allGrNs(Model model) {
		List<GoodsRNote> list = service.getAllGoodsRNotes();
		model.addAttribute("list", list);
		return "GrnData";
	}

	@RequestMapping("/one")
	public String getOneGrN(@RequestParam("gid") Integer id, Model model) {
		GoodsRNote obj = service.getOneGoodsRNote(id);
		model.addAttribute("grn", obj);
		return "GrnView";
	}

	@RequestMapping("/delete")
	public String deleteGrn(@RequestParam("gid") Integer id, Model model) {
		return "redirect:all";
	}

	@RequestMapping("/edit")
	public String editGrn(@RequestParam("gid") Integer id, Model model) {
		GoodsRNote grn = service.getOneGoodsRNote(id);
		model.addAttribute("grn", grn);
		return "GrnUpdate";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateGrn(@ModelAttribute GoodsRNote goodsRNote, Model model) {
		service.updateGoodsRNote(goodsRNote);
		return "redirect:all";
	}

}
