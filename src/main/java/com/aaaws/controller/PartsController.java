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

import com.aaaws.model.Parts;
import com.aaaws.service.IOrderMethodService;
import com.aaaws.service.IPartsService;
import com.aaaws.service.IUomService;
import com.aaaws.util.CommonUi;

@Controller
@RequestMapping("/part")
public class PartsController {
	@Autowired
	private IPartsService service;
	@Autowired
	private IUomService uomService;
	@Autowired
	private IOrderMethodService ordService;

	private void commonUi(Model model) {
		List<Object[]> listUom = uomService.getUomIdAndModel();
		Map<Integer, String> uomModel = CommonUi.convert(listUom);
		model.addAttribute("uomModel", uomModel);

		List<Object[]> salelist = ordService.getOrderIdAndCode("Sale");
		Map<Integer, String> ordCodeS = CommonUi.convert(salelist);
		model.addAttribute("ordCodeS", ordCodeS);
		
		List<Object[]> purlist = ordService.getOrderIdAndCode("Purchase");
		Map<Integer, String> ordCodeP = CommonUi.convert(purlist);
		
		model.addAttribute("ordCodeP", ordCodeP);
	}

	@RequestMapping("/register")
	public String showParts(Model model) {
		model.addAttribute("parts", new Parts());
		commonUi(model);
		return "PartsRegister";
	}

	@RequestMapping(value = "/save", method = POST)
	public String saveParts(@ModelAttribute Parts part, Model model) {
		model.addAttribute("msg", service.savePart(part));
		model.addAttribute("parts", new Parts());
		return "PartsRegister";
	}

	@RequestMapping("/all")
	public String dataParts(Model model) {
		model.addAttribute("list", service.getAllParts());
		return "PartsData";
	}

	@RequestMapping("/view")
	public String getOnePartsById(@RequestParam("pid") Integer id, Model model) {
		model.addAttribute("parts", service.getOnePart(id));
		return "PartsView";
	}

	@RequestMapping("/edit")
	public String editPartsById(@RequestParam("pid") Integer id, Model model) {
		model.addAttribute("part", service.getOnePart(id));
		commonUi(model);
		return "PartsEdit";
	}

	@RequestMapping("/update")
	public String updateParts(@ModelAttribute Parts parts, Model model) {
		service.updatePart(parts);
		return "redirect:all";
	}

	@RequestMapping("/delete")
	public String deleteById(@RequestParam("pid") Integer id) {
		service.deletePart(id);
		return "redirect:all";
	}

}
