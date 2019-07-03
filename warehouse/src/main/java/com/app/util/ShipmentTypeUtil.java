package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ShipmentTypeUtil {
	
	@SuppressWarnings("deprecation")
	public void generatePie(String path,List<Object[]> list) {
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:list) {
			dataset.setValue(ob[0].toString(),new Double( ob[1].toString()));
		}
		JFreeChart chart=ChartFactory.createPieChart3D("Shipment Type Modes", dataset, false, false, false);
		
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/resouces/images/ShipmentPie.jpg"),chart,500,600);
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	@SuppressWarnings("deprecation")
	public void generateBar(String path,List<Object[]> list) {
		
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		for(Object[] ob:list) {
			dataset.setValue(new Double(ob[1].toString()), ob[0].toString(),"");
		}
		JFreeChart chart=ChartFactory.createBarChart3D("Shipment Type Mod", "Modes", "count", dataset,null, false, false, false);
		try {
			ChartUtilities.saveChartAsJPEG(new File(path+"/resouces/images/ShipmentBarf.jpg"),chart,300,300);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
