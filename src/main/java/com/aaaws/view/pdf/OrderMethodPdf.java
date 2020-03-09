package com.aaaws.view.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.aaaws.model.OrderMethod;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class OrderMethodPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		response.addHeader("Content-Disposition", "attachement;Filename=order.pdf");
		Paragraph p=new Paragraph("Welcome to OrderMethod Data in Pdf View");
		document.add(p);
		
		document.add(new Paragraph("\n"));
		document.add(new Paragraph("\n"));
		document.add(new Paragraph("\n"));
		
		PdfPTable t=new PdfPTable(6);
		
		t.addCell("ID");
		t.addCell("Mode");
		t.addCell("Code");
		t.addCell("Method");
		t.addCell("Accept");
		t.addCell("Note");
		
		@SuppressWarnings("unchecked")
		List<OrderMethod> oms=(List<OrderMethod>) model.get("list");
		
		for (OrderMethod om : oms) {
			t.addCell(om.getOrdId().toString());
			t.addCell(om.getOrdMode());
			t.addCell(om.getOrdCode());
			t.addCell(om.getOrdMethod());
			t.addCell(om.getOrdAccept().toString());
			t.addCell(om.getOrdDesc());
		}
		
		document.add(t);
		/*
		 * document.add(Image.getInstance("D:\\hydrabad\\ani\\a.jpg"));
		 * document.addCreationDate(); document.addAuthor("Raghu");
		 * document.addHeader("p1", "Aa");
		 */
	}

}
