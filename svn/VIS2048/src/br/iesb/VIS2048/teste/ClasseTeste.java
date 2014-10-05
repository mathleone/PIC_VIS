package br.iesb.VIS2048.teste;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.iesb.VIS2048.frame.FramePrincipal;


public class ClasseTeste {
	
	public static void main(String[] args) {
	
		try {
			FramePrincipal framePrincipal = new FramePrincipal();
			framePrincipal.setResizable(true);
			framePrincipal.setVisible(true);
			framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			framePrincipal.setSize(720, 600);
			framePrincipal.setLocationRelativeTo(null);
			framePrincipal.setBackground(Color.BLUE);
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
		} catch(Throwable t) {
			t.printStackTrace();
		}
			
	}

}
