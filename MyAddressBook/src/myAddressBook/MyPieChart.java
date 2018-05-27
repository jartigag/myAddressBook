package myAddressBook;

import java.util.ArrayList;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.colors.BaseSeriesColors;

public class MyPieChart implements ExampleChart<PieChart> {

	private ArrayList<Integer> values = new ArrayList<Integer>();
 
	public MyPieChart(ArrayList<Integer> values) {
		super();
		this.values = values;
	}

	@Override
	public PieChart getChart() {

		// Create Chart
		PieChart chart =
		    new PieChartBuilder()
				.width(500)
				.height(500)
				.title("My Address-book")
				.build();
		
		// Customize Chart
		chart.getStyler().setLegendVisible(false);
		chart.getStyler().setAnnotationType(AnnotationType.Label);
		chart.getStyler().setAnnotationDistance(.82);
		chart.getStyler().setPlotContentSize(.9);
		chart.getStyler().setDefaultSeriesRenderStyle(PieSeriesRenderStyle.Donut);
		chart.getStyler().setDecimalPattern("#");
		
		chart.getStyler().setSeriesColors(new BaseSeriesColors().getSeriesColors());
		
		chart.getStyler().setSumVisible(true);
		chart.getStyler().setSumFontSize(20f);
		
		// Series
		chart.addSeries("tfno", values.get(0));
		chart.addSeries("email", values.get(1));
		chart.addSeries("ig", values.get(2));
		chart.addSeries("fb", values.get(3));
		chart.addSeries("tw", values.get(4));
		chart.addSeries("sp", values.get(5));

		return chart;
	}

	public ArrayList<Integer> getValues() {
		return values;
	}

	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}

}
