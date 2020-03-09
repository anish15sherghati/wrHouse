package com.aaaws.view.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class UomUtil {
	
	public void generatePie(String path,List<Object[]> list)
	{
		DefaultPieDataset dataSet=new DefaultPieDataset();
		for (Object[] objects : list) {
			dataSet.setValue(objects[0].toString(), Double.valueOf(objects[1].toString()));
		}
		JFreeChart charts=ChartFactory.createPieChart3D("UomType", dataSet);
		
		try {
			ChartUtils.saveChartAsJPEG(new File(path + "/resources/images/UomA.jpg"), charts, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void generateBarChart(String path,List<Object[]> list) {
		DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
		for (Object[] objects : list) {
			dataSet.addValue( Double.valueOf(objects[1].toString()),objects[0].toString(), "");
		}
		JFreeChart charts=ChartFactory.createBarChart("UomTypeBar", "Type", "Count", dataSet);
		try {
			ChartUtils.saveChartAsJPEG(new File(path + "/resources/images/UomB.jpg"), charts, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
