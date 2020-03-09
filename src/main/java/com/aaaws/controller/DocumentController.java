package com.aaaws.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.aaaws.model.Document;
import com.aaaws.service.IDocumentService;

@Controller
@RequestMapping("/docu")
public class DocumentController {

	@Autowired
	private IDocumentService service;

	@RequestMapping("/registry")
	public String showDocument() {
		return "Documents";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String saveDocument(@RequestParam Integer filId, @RequestParam CommonsMultipartFile filOb, Model model) {
		System.out.println("Open");
		if (filOb != null) {
			Document doc = new Document();
			doc.setFileId(filId);
			doc.setFileName(filOb.getOriginalFilename());
			doc.setFileData(filOb.getBytes());
			service.saveDocument(doc);
			String msg = filId + "'  uploaded";
			model.addAttribute("message", msg);
			System.out.println("Dead");
		}
		return "Documents";
	}
	
	@RequestMapping("/show")
	public String showUploadPage(Model model){
		List<Object[]> list=service.getFileIdAndNames();
		model.addAttribute("list", list);
		
		return "Documents";
	}
	
	@RequestMapping("/download")
	public void downloadPage(@RequestParam Integer fid,HttpServletResponse resp)
	{
		Document doc=service.getOneDocument(fid);
		resp.addHeader("Content-Disposition", "attachment;filename="+doc.getFileName());
		try {
			FileCopyUtils.copy(doc.getFileData(), resp.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
