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
 * Third panel
 *
 */
public class CoefPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private SpringLayout currentLayout;
	
	public CoefPanel() {
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
		currentLayout.putConstraint(SpringLayout.WEST, txtpnVisEspectrmetro, 161, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, txtpnVisEspectrmetro, -271, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, txtpnVisEspectrmetro, -118, SpringLayout.EAST, this);
		txtpnVisEspectrmetro.setBounds(5, 5, 5, 5);
		txtpnVisEspectrmetro.setForeground(Color.WHITE);
		txtpnVisEspectrmetro.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtpnVisEspectrmetro.setBackground(Color.BLACK);
		txtpnVisEspectrmetro.setText("Insira os coeficientes de regressão");
		add(txtpnVisEspectrmetro);
		
		Label label = new Label("VIS2048 - espectrômetro de emissão");
		currentLayout.putConstraint(SpringLayout.NORTH, txtpnVisEspectrmetro, 99, SpringLayout.SOUTH, label);
		currentLayout.putConstraint(SpringLayout.NORTH, label, 49, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, label, -64, SpringLayout.EAST, this);
		label.setFont(new Font("SansSerif", Font.PLAIN, 26));
		add(label);
		
		TextField textField = new TextField();
		currentLayout.putConstraint(SpringLayout.NORTH, textField, 45, SpringLayout.SOUTH, txtpnVisEspectrmetro);
		currentLayout.putConstraint(SpringLayout.WEST, textField, 185, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, textField, -196, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, textField, -416, SpringLayout.EAST, this);
		add(textField);
		
		Label label_1 = new Label("x³ +");
		currentLayout.putConstraint(SpringLayout.NORTH, label_1, 45, SpringLayout.SOUTH, txtpnVisEspectrmetro);
		currentLayout.putConstraint(SpringLayout.WEST, label_1, 6, SpringLayout.EAST, textField);
		currentLayout.putConstraint(SpringLayout.SOUTH, label_1, -188, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, label_1, -363, SpringLayout.EAST, this);
		label_1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(label_1);
		
		TextField textField_1 = new TextField();
		currentLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, textField);
		currentLayout.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, label_1);
		currentLayout.putConstraint(SpringLayout.SOUTH, textField_1, 0, SpringLayout.SOUTH, textField);
		currentLayout.putConstraint(SpringLayout.EAST, textField_1, 40, SpringLayout.EAST, label_1);
		add(textField_1);
		
		Label label_2 = new Label("x² +");
		currentLayout.putConstraint(SpringLayout.WEST, label_2, 19, SpringLayout.EAST, textField_1);
		currentLayout.putConstraint(SpringLayout.SOUTH, label_2, 0, SpringLayout.SOUTH, textField);
		label_2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(label_2);
		
		TextField textField_2 = new TextField();
		currentLayout.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, textField);
		currentLayout.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, label_2);
		currentLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, textField);
		currentLayout.putConstraint(SpringLayout.EAST, textField_2, 40, SpringLayout.EAST, label_2);
		add(textField_2);
		
		Label label_3 = new Label("x +");
		currentLayout.putConstraint(SpringLayout.WEST, label_3, 23, SpringLayout.EAST, textField_2);
		currentLayout.putConstraint(SpringLayout.SOUTH, label_3, 0, SpringLayout.SOUTH, textField);
		label_3.setFont(new Font("Arial", Font.PLAIN, 20));
		add(label_3);
		
		TextField textField_3 = new TextField();
		currentLayout.putConstraint(SpringLayout.NORTH, textField_3, -30, SpringLayout.SOUTH, textField);
		currentLayout.putConstraint(SpringLayout.WEST, textField_3, 6, SpringLayout.EAST, label_3);
		currentLayout.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, textField);
		currentLayout.putConstraint(SpringLayout.EAST, textField_3, -6, SpringLayout.EAST, txtpnVisEspectrmetro);
		add(textField_3);
	}
	
}
