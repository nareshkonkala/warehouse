package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.app.model.Order;

public class OrderExcelDocument extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook workbook, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		res.addHeader("Content-Disposition", "attachment;filename=OrderExcel.xlsx");
		@SuppressWarnings("unchecked")
		List<Order> list=(List<Order>) map.get("list");
		Sheet sheet=workbook.createSheet("Ordrs");
		setHead(sheet);
		setBody(sheet,list);
	}

	private void setHead(Sheet sheet) {

		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MODE");
		row.createCell(2).setCellValue("CODE");
		row.createCell(1).setCellValue("TYPE");
		row.createCell(1).setCellValue("ACCEPT");
		row.createCell(1).setCellValue("NOTE");
	}
	private void setBody(Sheet sheet, List<Order> list) {
		
		int index=1;
		for(Order od:list){
			
			Row row =sheet.createRow(index++);
			row.createCell(0).setCellValue(od.getOrderId());
			row.createCell(1).setCellValue(od.getOrderMode());
			row.createCell(2).setCellValue(od.getOrderCode());
			row.createCell(3).setCellValue(od.getOrderType());
			row.createCell(4).setCellValue(od.getOrderAccept().get(0));
			row.createCell(5).setCellValue(od.getNote());
			
	}
}

	
	

}
