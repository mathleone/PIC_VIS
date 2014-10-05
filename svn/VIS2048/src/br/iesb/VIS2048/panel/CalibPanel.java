package br.iesb.VIS2048.panel;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.SpringLayout;

public class CalibPanel extends ExternalPanel {

	private static final long serialVersionUID = 1L;
	private final SpringLayout currentLayout = new SpringLayout();
	
	public CalibPanel() {
		init();
	}
	
	public void init() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 153));
		setupPanel();
		setVisible(true);
		setSize(720, 600);
	}
	
	private void setupPanel() {
		this.setLayout(currentLayout);
		
		Label label = new Label("VIS");
		currentLayout.putConstraint(BorderLayout.NORTH, label, 53, SpringLayout.NORTH, this);
		currentLayout.putConstraint(BorderLayout.WEST, label, 126, SpringLayout.WEST, this);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Bright", Font.PLAIN, 26));
		add(label);
		
		Checkbox checkbox = new Checkbox("Sim");
		currentLayout.putConstraint(SpringLayout.NORTH, checkbox, 196, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, checkbox, 274, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, checkbox, -185, SpringLayout.SOUTH, this);
		currentLayout.putConstraint(SpringLayout.EAST, checkbox, -375, SpringLayout.EAST, this);
		checkbox.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		add(checkbox);
//		checkbox.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//				if(((Integer)e.getKeyCode()).equals(KeyEvent.VK_ENTER))
//					
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		Checkbox checkbox_1 = new Checkbox("Não");
		currentLayout.putConstraint(SpringLayout.NORTH, checkbox_1, 196, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, checkbox_1, 370, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.EAST, checkbox_1, 441, SpringLayout.WEST, this);
		checkbox_1.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		add(checkbox_1);
		
		Label label_1 = new Label("Possui equação de calibração?");
		currentLayout.putConstraint(SpringLayout.WEST, label_1, 223, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, label_1, -32, SpringLayout.NORTH, checkbox);
		label_1.setBackground(Color.BLACK);
		label_1.setFont(new Font("Lucida Bright", Font.PLAIN, 18));
		add(label_1);
		
		Label label_2 = new Label("2048 - espectrômetro de emissão");
		currentLayout.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, label_2);
		currentLayout.putConstraint(SpringLayout.EAST, label, -6, SpringLayout.WEST, label_2);
		currentLayout.putConstraint(SpringLayout.NORTH, label_2, 53, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, label_2, 180, SpringLayout.WEST, this);
		currentLayout.putConstraint(SpringLayout.SOUTH, label_2, -45, SpringLayout.NORTH, label_1);
		currentLayout.putConstraint(SpringLayout.EAST, label_2, -103, SpringLayout.EAST, this);
		label_2.setFont(new Font("Lucida Bright", Font.PLAIN, 26));
		add(label_2);
	}
}
