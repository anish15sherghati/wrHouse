package com.aaaws.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.aaaws.model.WhUserType;

public class WhUserTypeExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//1.FileName
		response.addHeader("Content-Disposition", "attachement;filename=WhUSerType.xlsx");
		Sheet s=workbook.createSheet("WhUserType1");
		setHead(s);
		@SuppressWarnings("unchecked")
		List<WhUserType> wh=(List<WhUserType>)model.get("whObj");
		setBody(s,wh);
	
	}

	private void setBody(Sheet s, List<WhUserType> wh) {
		int count=1;
		for (WhUserType whUserType : wh) {
			Row r=s.createRow(count++);
			r.createCell(0).setCellValue(whUserType.getWhuserId());
			r.createCell(1).setCellValue(whUserType.getWhuserType());
			r.createCell(2).setCellValue(whUserType.getWhuserCode());
			r.createCell(3).setCellValue(whUserType.getWhuserFor());
			r.createCell(4).setCellValue(whUserType.getWhuserEmail());
			r.createCell(5).setCellValue(whUserType.getWhuserCont());
			r.createCell(6).setCellValue(whUserType.getWhuserIdType());
			r.createCell(7).setCellValue(whUserType.getWhuserIfOther());
			r.createCell(8).setCellValue(whUserType.getWhuserIdNum());
		}
	}

	private void setHead(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("TYPE");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("FOR");
		r.createCell(4).setCellValue("Email");
		r.createCell(5).setCellValue("Cont");
		r.createCell(6).setCellValue("IdType");
		r.createCell(7).setCellValue("IfOther");
		r.createCell(8).setCellValue("IdNum");
	}
	
}