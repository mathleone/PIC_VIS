package br.iesb.VIS2048.panel;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ExternalPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final JPanel externalPane = new JPanel(new CardLayout());
	private Container component;
	private CalibPanel calibPanel;
	private DegreePanel degreePanel;
	private CoefPanel coefPanel;
	private EspectroPanel espectroPanel;
	

	public ExternalPanel() {
	}
	
	public ExternalPanel(Container container) {
		init();
		setComponent(container);
	}
	
	private void init() {
		externalPane.add("Calib Panel", calibPanel = new CalibPanel());
		externalPane.add("Degree Panel", degreePanel = new DegreePanel());
		externalPane.add("Coef Panel", coefPanel = new CoefPanel());
		externalPane.add("Espectro Panel", espectroPanel = new EspectroPanel());
	}
	
	private void setComponent(Container container) {
		component = container;
		component.setLayout(new SpringLayout());
		component.add(SpringLayout.HORIZONTAL_CENTER, externalPane);
	}
	
	public Container getComponent() {
		return component;
	}
	
	public JPanel getExternalPane() {
		return externalPane;
	}

	public CalibPanel getCalibPanel() {
		return calibPanel;
	}
	
	public void setCalibPanel(CalibPanel calibPanel) {
		this.calibPanel = calibPanel;
	}
	
	public DegreePanel getDegreePanel() {
		return degreePanel;
	}
	
	public void setDegreePanel(DegreePanel degreePanel) {
		this.degreePanel = degreePanel;
	}
	
	public CoefPanel getCoefPanel() {
		return coefPanel;
	}
	
	public void setCoefPanel(CoefPanel coefPanel) {
		this.coefPanel = coefPanel;
	}
	
	public EspectroPanel getEspectroPanel() {
		return espectroPanel;
	}
	
	public void setEspectroPanel(EspectroPanel espectroPanel) {
		this.espectroPanel = espectroPanel;
	}

}
