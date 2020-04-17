package com.aaaws.view.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.aaaws.model.Shipping;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShippingPdf extends AbstractPdfView {

	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.addHeader("Content-Disposition", "attachement;filename=Shipping.pdf");
		document.add(new Paragraph("Welcome to Shipping Data+\"n+\"n "));
		PdfPTable t=new PdfPTable(9); 
		
		t.addCell("shipId");
		t.addCell("shipCode");
		t.addCell("shipRefNum");
		t.addCell("courRefNum");
		t.addCell("contDetails");
		t.addCell("salOrder");
		t.addCell("shipDesc");
		t.addCell("billAddr");
		t.addCell("shipAddr");
		
		@SuppressWarnings("unchecked")
		List<Shipping> list=(List<Shipping>) model.get("lists");
		
		for (Shipping shipping : list) {
			t.addCell(shipping.getShipId().toString());
			t.addCell(shipping.getShipCode());
			t.addCell(shipping.getShipRefNum());
			t.addCell(shipping.getCourRefNum());
			t.addCell(shipping.getContDetails().toString());
			t.addCell(shipping.getSalOrder());
			t.addCell(shipping.getShipDesc());
			t.addCell(shipping.getBillAddr());
			t.addCell(shipping.getShipAddr());
			
		}
		
		document.add(t);
		
	}
}
