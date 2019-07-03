package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		res.addHeader("Content-Disposition", "attachment;filename=Shipments.xlsx");
		@SuppressWarnings("unchecked")
		List<ShipmentType> list=(List<ShipmentType>) model.get("list");

		Sheet sheet=workbook.createSheet("Shipments");
		setHead(sheet);
		setBody(sheet,list);
	}

	private void setHead(Sheet sheet) {

		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MODE");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("ENABLE");
		row.createCell(4).setCellValue("GRADE");
		row.createCell(5).setCellValue("NOTE");
	}
	private void setBody(Sheet sheet, List<ShipmentType> list) {

		int rowNum=1;
		for(ShipmentType s:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(s.getStId());
			row.createCell(1).setCellValue(s.getStMode());
			row.createCell(2).setCellValue(s.getStCode());
			row.createCell(3).setCellValue(s.getEnableShipment());
			row.createCell(4).setCellValue(s.getStGrade());
			row.createCell(5).setCellValue(s.getStNote());

		}

	}



}
