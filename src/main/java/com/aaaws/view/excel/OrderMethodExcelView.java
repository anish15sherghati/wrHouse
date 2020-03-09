package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.OrderMethod;

public class OrderMethodExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.addHeader("Content-Disposition", "attachment;filename=OrderMethod.xlsx");
		
		// 1. creating sheet
		Sheet s = workbook.createSheet("ordersheet");
		// 2. creating Header Of Excel sheet in 1st Row
		setHead(s);
		// 3.transfer data from model to excel
		@SuppressWarnings("unchecked")
		List<OrderMethod> orders = (List<OrderMethod>) model.get("orders");
		// 4 inserting value in excel
		setBody(s, orders);
	}

	private void setBody(Sheet s, List<OrderMethod> orders) {
		int count = 1;
		for (OrderMethod orderMethod : orders) {
			Row r = s.createRow(count++);
			r.createCell(0).setCellValue(orderMethod.getOrdId());
			r.createCell(1).setCellValue(orderMethod.getOrdMode());
			r.createCell(2).setCellValue(orderMethod.getOrdCode());
			r.createCell(3).setCellValue(orderMethod.getOrdMethod());
			r.createCell(5).setCellValue(orderMethod.getOrdDesc());

		}

	}

	private void setHead(Sheet s) {
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("Mode");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("Method");
		r.createCell(4).setCellValue("Accept");
		r.createCell(5).setCellValue("NOTE");
	}

}
