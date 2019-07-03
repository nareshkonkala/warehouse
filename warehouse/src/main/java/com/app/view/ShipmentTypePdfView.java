package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShipmentTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=Shipments.pdf");
		@SuppressWarnings("unchecked")
		List<ShipmentType> list = (List<ShipmentType>) model.get("list");
		Paragraph p = new Paragraph("Welcome to ShipmentType.This is not sample .");
		document.add(p);
		PdfPTable table = new PdfPTable(6);
		table.addCell("ID");
		table.addCell("MODE");
		table.addCell("CODE");
		table.addCell("ENABLE");
		table.addCell("GRADE");
		table.addCell("NOTE");

		for (ShipmentType s : list) {
			table.addCell(s.getStId().toString());
			table.addCell(s.getStMode());
			table.addCell(s.getStCode());
			table.addCell(s.getEnableShipment());
			table.addCell(s.getStGrade());
			table.addCell(s.getStNote());

		}

		document.add(table);
	}

}
