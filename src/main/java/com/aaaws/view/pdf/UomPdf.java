package com.aaaws.view.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.aaaws.model.Uom;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UomPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachement;filename=Uom.Pdf");
		
		document.add(new Paragraph("Welcome To Uom Data"+"\n"+"\n"));
		
		PdfPTable t=new PdfPTable(4);
		t.addCell("Id");
		t.addCell("Type");
		t.addCell("Model");
		t.addCell("Desc");
		
		@SuppressWarnings("unchecked")
		List<Uom> list=(List<Uom>) model.get("lists");
		
		for (Uom uom : list) {
			t.addCell(uom.getUomId().toString());
			t.addCell(uom.getUomType());
			t.addCell(uom.getUomModel());
			t.addCell(uom.getUomDesc());
			
		}
		document.add(t);
		
	}

}
