package br.iesb.VIS2048.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.*;

import javax.swing.JPanel;

public class EspectroPanel extends JPanel {

	/**
	 * Graphic panel
	 */
	private static final long serialVersionUID = 1L;
	//private final JPanel espectroPane = new JPanel(new CardLayout());
	
	public EspectroPanel() {
		init();
	}
	
	public void init() {
		
		System.out.println("Olá");
		XYSeries series = new XYSeries("XYGraph");
		int x = 0;
		while(x<100){
			series.add(x, (int)(Math.random()*100));
			System.out.println(x);
			x++;
		}
		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series);
		JFreeChart chart = ChartFactory.createXYLineChart("XY Chart", "x-axis", "y-axis", dataset, 
				PlotOrientation.VERTICAL,true,true,false);
		chart.getXYPlot().setRenderer(new XYSplineRenderer());
		ChartPanel panel = new ChartPanel(chart);
		panel.setPreferredSize(new Dimension(600, 300));
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		
		
	}

}
