package myAddressBook;

import java.util.ArrayList;

import javax.swing.JPanel;

import org.knowm.xchart.PieChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.demo.charts.ExampleChart;

public class MyPanel extends JPanel {
	
	public MyPanel(ArrayList<Integer> values) {
		super();
		ExampleChart<PieChart> exampleChart = new MyPieChart(values);
		PieChart chart = exampleChart.getChart();
		JPanel pnlChart = new XChartPanel(chart);      
		add(pnlChart);
	}

	// PAINT: GRÁFICO DE BARRAS CONSTRUIDO A MANO
	/*@Override
	public void paint (Graphics g) {
		// Dimensiones X:
		int anchoGraf = 410;
		int margenIzqGraf = 45;
		int margenDerGraf = margenIzqGraf+anchoGraf;
		int[] xCentrado = new int[6]; // número de valores en X
		for (int i=0;i<xCentrado.length;i++) {
			xCentrado[i] = 20 + margenIzqGraf + i*anchoGraf/xCentrado.length; //20 para no empezar en el (0,0) del gráfico
		}
		
		// Dimensiones Y:
		int altoGraf = 200;
		int margenSupGraf = 120;
		int margenInfGraf = margenSupGraf+altoGraf;
		int[] yLinea = new int[7]; // número de valores en y
		int increm = altoGraf/(yLinea.length-1); //px entre líneas de y 
		for (int i=0;i<yLinea.length;i++) {
			yLinea[yLinea.length-i-1] = margenSupGraf + i*increm; //pos. líneas de y
		}

		// Eje Y:
		for (int i=0;i<yLinea.length;i++) {
			g.setColor(Color.GRAY);
			g.drawString(String.valueOf(i*100), margenIzqGraf-30, yLinea[i]+2); // incrementos de 100
			g.drawLine(margenIzqGraf,yLinea[i],margenDerGraf,yLinea[i]);
		}

		// Eje X:
		Font fuenteX = new Font("Arial", 1, 8);
		g.setFont(fuenteX);
		String[] xTexto = {"tfno","email","ig","fb","tw","sp"};
		//double[] yAltura = {iTl,iMl,iIg,iFb,iTw,iSp};
		for (int i=0;i<yAltura.size();i++) {
			g.setColor(Color.GRAY);
			g.drawString(xTexto[i], xCentrado[i], yLinea[0]+20);
			g.setColor(Color.BLUE);
			g.fillRect(xCentrado[i]+12, (int)( yLinea[0]-(double)yAltura.get(i)/100*increm ), 12, (int)( (double)yAltura.get(i)/100*increm) );
		}

		// Título:
		Font fuenteTit = new Font("Arial", 1, 14);
		g.setFont(fuenteTit);
		g.setColor(Color.GRAY);
		g.drawString("My Address-book", 180, margenSupGraf-20);

	}*/
}
