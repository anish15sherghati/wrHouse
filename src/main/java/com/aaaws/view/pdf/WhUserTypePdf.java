package com.aaaws.view.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.aaaws.model.WhUserType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class WhUserTypePdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachement;filename=WhUser.Pdf");
		
		document.add(new Paragraph("Welcome To WhUser Data"+"\n"+"\n"));
		
		PdfPTable t=new PdfPTable(9);
		t.addCell("Id");
		t.addCell("Type");
		t.addCell("Code");
		t.addCell("For");
		t.addCell("Email");
		t.addCell("Contact");
		t.addCell("IdType");
		t.addCell("IfOther");
		t.addCell("IdNum");
		
		
		
		
		
		@SuppressWarnings("unchecked")
		List<WhUserType> list=(List<WhUserType>) model.get("lists");
		
		for (WhUserType whuser : list) {
			t.addCell(whuser.getWhuserId().toString());
			t.addCell(whuser.getWhuserType());
			t.addCell(whuser.getWhuserCode().toString());
			t.addCell(whuser.getWhuserFor());
			t.addCell(whuser.getWhuserEmail());
			t.addCell(whuser.getWhuserCont().toString());
			t.addCell(whuser.getWhuserIdType());
			t.addCell(whuser.getWhuserIfOther());
			t.addCell(whuser.getWhuserIdNum().toString());
			
		}
		document.add(t);
		
	}
}
