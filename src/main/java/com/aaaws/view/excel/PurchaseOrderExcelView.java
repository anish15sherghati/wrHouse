package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.PurchaseOrder;

public class PurchaseOrderExcelView extends AbstractXlsxView {

	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=Purchase.xlsx");
		Sheet s=workbook.createSheet("purchaseSheet1");
		@SuppressWarnings("unchecked")
		List<PurchaseOrder> list=(List<PurchaseOrder>) model.get("purchaseList");
		setHead(s);
		setBody(s,list);
	}

	private void setBody(Sheet s, List<PurchaseOrder> list) {
		int count=1;
		for (PurchaseOrder purchaseOrder : list) {
			Row r=s.createRow(count++);
			r.createCell(0).setCellValue(purchaseOrder.getPurId());
			r.createCell(1).setCellValue(purchaseOrder.getPurCode());
			r.createCell(2).setCellValue(purchaseOrder.getShpObjCode().getShipCode());
			//r.createCell(3).setCellValue(purchaseOrder.getWhUserObjV().getWhuserCode());
			//r.createCell(4).setCellValue(purchaseOrder.getWhUserObjC().getWhuserCode());
			r.createCell(5).setCellValue(purchaseOrder.getPurRefNo());
			r.createCell(6).setCellValue(purchaseOrder.getPurQua());
			r.createCell(7).setCellValue(purchaseOrder.getPurSts());
			r.createCell(8).setCellValue(purchaseOrder.getPurDesc());
		}
	}
	private void setHead(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("PurId");
		r.createCell(1).setCellValue("PurCode");
		r.createCell(2).setCellValue("PurShipCode");
		r.createCell(3).setCellValue("WhUserVendor");
		r.createCell(4).setCellValue("WhUserCustomer");
		r.createCell(5).setCellValue("PurRefernceNo");
		r.createCell(6).setCellValue("PurQuantity");
		r.createCell(7).setCellValue("PurStatus");
		r.createCell(8).setCellValue("PurDesc");
		
	}
}
