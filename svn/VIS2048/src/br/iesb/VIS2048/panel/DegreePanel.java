package br.iesb.VIS2048.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

/**
 * 
 * Second Panel
 *
 */
public class DegreePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private SpringLayout currentLayout;
	
	public DegreePanel() {
		init();
	}
	
	public void init() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 153));
		currentLayout = new SpringLayout();
		setupPanel();
	}
	
	private void setupPanel() {
		this.setLayout(currentLayout);
		
		JTextPane txtpnVisEspectrmetro = new JTextPane();
		currentLayout.putConstraint(SpringLayout.WEST, txtpnVisEspectrmetro, 183, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, txtpnVisEspectrmetro, -269, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, txtpnVisEspectrmetro, -168, SpringLayout.EAST, this);
		txtpnVisEspectrmetro.setBounds(5, 5, 5, 5);
		txtpnVisEspectrmetro.setForeground(Color.WHITE);
		txtpnVisEspectrmetro.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnVisEspectrmetro.setBackground(Color.BLACK);
		txtpnVisEspectrmetro.setText("Insira o grau do polinômio:");
		add(txtpnVisEspectrmetro);
		
		Label label = new Label("VIS2048 - espectrômetro de emissão");
		currentLayout.putConstraint(SpringLayout.NORTH, txtpnVisEspectrmetro, 99, SpringLayout.SOUTH, label);
		currentLayout.putConstraint(SpringLayout.NORTH, label, 49, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, label, -64, SpringLayout.EAST, this);
		label.setFont(new Font("SansSerif", Font.PLAIN, 26));
		add(label);
		
		TextField textField = new TextField();
		currentLayout.putConstraint(SpringLayout.NORTH, textField, 42, SpringLayout.SOUTH, txtpnVisEspectrmetro);
		currentLayout.putConstraint(SpringLayout.WEST, textField, 298, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, textField, -208, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, textField, -276, SpringLayout.EAST, this);
		add(textField);
	}
}
