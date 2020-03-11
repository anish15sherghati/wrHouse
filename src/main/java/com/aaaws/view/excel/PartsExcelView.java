package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.Parts;

public class PartsExcelView extends AbstractXlsxView {
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=Parts.xlsx");
		
		Sheet sheet=workbook.createSheet("partsheet1");
		
		@SuppressWarnings("unchecked")
		List<Parts> parts=(List<Parts>) model.get("parts");
		
		setHead(sheet);
		setBody(sheet,parts);
	}
	
	private void setBody(Sheet sheet, List<Parts> parts) {
		int count=1;
		for (Parts parts2 : parts) {
			Row r=sheet.createRow(count++);	
			r.createCell(0).setCellValue(parts2.getPartId());
			r.createCell(1).setCellValue(parts2.getPartCode());
			r.createCell(2).setCellValue(parts2.getPartWidth());
			r.createCell(3).setCellValue(parts2.getPartLength());
			r.createCell(4).setCellValue(parts2.getPartHeight());
			r.createCell(5).setCellValue(parts2.getUomObj().getUomModel());
			r.createCell(6).setCellValue(parts2.getOrdSaleOb().getOrdCode());
			r.createCell(7).setCellValue(parts2.getOrdPurOb().getOrdCode());
			r.createCell(8).setCellValue(parts2.getPartBcost());
			r.createCell(9).setCellValue(parts2.getPartDesc());
		}
	}
	private void setHead(Sheet sheet) {
		Row r=sheet.createRow(0);
		r.createCell(0).setCellValue("Id");
		r.createCell(1).setCellValue("Code");
		r.createCell(2).setCellValue("Width");
		r.createCell(3).setCellValue("Length");
		r.createCell(4).setCellValue("Height");
		r.createCell(5).setCellValue("UomCode");
		r.createCell(6).setCellValue("OrderSale");
		r.createCell(7).setCellValue("OrderPurchase");
		r.createCell(8).setCellValue("BaseCost");
		r.createCell(9).setCellValue("Desc");
	}
}
