package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.Uom;

public class UomExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//1 create Sheet
		Sheet s = workbook.createSheet("uom1");
		//2 create Header Sheet
		setHeader(s);
		@SuppressWarnings("unchecked")
		//fetching all data from model to transfer it on Excel document
		List<Uom> uoms = (List<Uom>) model.get("lists");
		//Filling data's on excel sheet
		setBody(s, uoms);

	}
	private void setBody(Sheet s, List<Uom> uoms) {
		int count = 1;
		for (Uom uom : uoms) {
			Row r = s.createRow(count++);
			r.createCell(0).setCellValue(uom.getUomId());
			r.createCell(1).setCellValue(uom.getUomType());
			r.createCell(2).setCellValue(uom.getUomModel());
			r.createCell(3).setCellValue(uom.getUomDesc());
		}
	}
	private void setHeader(Sheet s) {
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("Id");
		r.createCell(1).setCellValue("Type");
		r.createCell(2).setCellValue("Model");
		r.createCell(3).setCellValue("Desc");
	}
}
