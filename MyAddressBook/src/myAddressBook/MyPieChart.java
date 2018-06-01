package myAddressBook;

import java.util.ArrayList;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.PieSeries.PieSeriesRenderStyle;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.colors.BaseSeriesColors;

public class MyPieChart implements ExampleChart<PieChart> {

	private ArrayList<ArrayList> values = new ArrayList<ArrayList>();
 
	public MyPieChart(ArrayList<ArrayList> values) {
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
		chart.addSeries("phone", values.get(0).size());
		chart.addSeries("email", values.get(1).size());
		chart.addSeries("ig", values.get(2).size());
		chart.addSeries("fb", values.get(3).size());
		chart.addSeries("tw", values.get(4).size());
		chart.addSeries("sp", values.get(5).size());

		return chart;
	}

}
