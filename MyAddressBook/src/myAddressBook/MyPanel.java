package myAddressBook;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.demo.charts.ExampleChart;

public class MyPanel extends JPanel {
	
	public MyPanel(ArrayList<ArrayList> values) {
		super();
		ExampleChart<PieChart> exampleChart = new MyPieChart(values);
		PieChart chart = exampleChart.getChart();
		JPanel pnlChart = new XChartPanel(chart);
		add(pnlChart);
	}
}
