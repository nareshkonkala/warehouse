package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Order;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class OrderPdfDocument extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter write, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		
		res.addHeader("Content-Disposition", "attachment;filename=Orders.pdf");
		@SuppressWarnings("unchecked")
		List<Order> list=(List<Order>) map.get("list");
		Paragraph p=new Paragraph("Welcome to Order page .These are Orders ");
		document.add(p);
		PdfPTable table=new  PdfPTable(6);
		table.addCell("ID");
		table.addCell("MODE");
		table.addCell("CODE");
		table.addCell("TYPE");
		table.addCell("ODER ACCEPT");
		table.addCell("NOTE");
		
		for(Order od:list){
			table.addCell(od.getOrderId().toString());
			table.addCell(od.getOrderMode());
			table.addCell(od.getOrderCode());
			table.addCell(od.getOrderType());
			table.addCell(od.getOrderAccept().get(0));
		/*	table.addCell(od.getOrderAccept().get(1));
			table.addCell(od.getOrderAccept().get(2));*/
			table.addCell(od.getNote());
		
		}
		document.add(table);
	}

}
