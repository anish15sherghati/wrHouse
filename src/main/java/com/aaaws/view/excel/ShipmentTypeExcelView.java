package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//1.FileName
		response.addHeader("Content-Disposition", "attachment;filename=Shipments.xlsx");
		Sheet s=workbook.createSheet("ShipmentTypes");
		
		//2.Construct-Row 0
		setHeaders(s);
		//3.ReadingModel Data
		@SuppressWarnings("unchecked")
		List<ShipmentType> ships=(List<ShipmentType>)model.get("ship");
		setBody(s,ships);
	}

	private void setBody(Sheet s, List<ShipmentType> ships) {
		int count=1;
		for (ShipmentType shipmentType : ships) {
			Row r=s.createRow(count++);
			r.createCell(0).setCellValue(shipmentType.getShipId());
			r.createCell(1).setCellValue(shipmentType.getShipMode());
			r.createCell(2).setCellValue(shipmentType.getShipCode());
			r.createCell(3).setCellValue(shipmentType.getEnabShip());
			r.createCell(4).setCellValue(shipmentType.getShipGrade());
			r.createCell(5).setCellValue(shipmentType.getShipDesc());
		}
	}

	private void setHeaders(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("MODE");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("ENABLE");
		r.createCell(4).setCellValue("GRADE");
		r.createCell(5).setCellValue("NOTE");
	}
	
	


	
}
