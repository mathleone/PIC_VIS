//teste do git
package br.iesb.VIS2048.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import br.iesb.VIS2048.action.AbrirAction;
import br.iesb.VIS2048.action.SalvarAction;
import br.iesb.VIS2048.panel.EspectroPanel;
import br.iesb.VIS2048.panel.ExternalPanel;

public class FramePrincipal extends JFrame {

	/**
	 * JFrame implementation of VIS2048
	 */
	private static final long serialVersionUID = -3663635989431564914L;

	public Container container = getContentPane();
	private final JPanel externalPane = new ExternalPanel(container);

	private JMenu arquivoMenu;
	private JMenu preferenciasMenu;
	private JMenu graficoMenu;
	private JMenu idiomaMenu;
	private JMenu ajudaMenu;
	private JMenuBar menuBar;

	public FramePrincipal() {
		super("VIS2048 - espectrômetro de emissão");
		setConfiguration();
	}

	private void setConfiguration() {
		setMenu();
		setPanel();
	}

	private void setPanel() {
		container.setLayout(new SpringLayout());
//		externalPane.add("Calib Panel", new CalibPanel());
//		externalPane.add("Degree Panel", new DegreePanel());
//		externalPane.add("Coef Panel", new CoefPanel());
//		externalPane.add("Espectro Panel", new EspectroPanel());
		externalPane.add("Espectro Panel", new EspectroPanel());
		container.add(BorderLayout.NORTH, menuBar);
		container.add(externalPane);
	}

	private void setMenu() {
		menuBar = new JMenuBar();
		menuBar.add(getArquivoMenu());
		menuBar.add(getPreferenciasMenu());
		menuBar.add(getAjudaMenu());
	}

	private JMenu getArquivoMenu() {
		arquivoMenu = new JMenu("Arquivo");
		arquivoMenu.setMnemonic(KeyEvent.VK_A); // set mnemonic to A
		arquivoMenu.add(abrirItem());
		arquivoMenu.add(salvarItem());
		arquivoMenu.add(exportarItem());
		arquivoMenu.add(exportarImagemItem());
		arquivoMenu.add(sairItem());
		return arquivoMenu;
	}

	private JMenuItem abrirItem() {
		JMenuItem abrirItem = new JMenuItem("Abrir... (Alt+a)");
		abrirItem.setMnemonic('a');
		abrirItem.addActionListener(new AbrirAction());
		return abrirItem;
	}

	private JMenuItem salvarItem() {
		JMenuItem salvarItem = new JMenuItem("Salvar... (Alt+s)");
		salvarItem.setMnemonic('s');
		salvarItem.addActionListener(new SalvarAction(this));
		return salvarItem;
	}

	private JMenuItem exportarItem() {
		JMenuItem exportarItem = new JMenuItem("Exportar (csv)... (Alt+s)");
		exportarItem.setMnemonic('e');
		exportarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane
						.showMessageDialog(
								FramePrincipal.this,
								"Este é o submenu 'Exportar...'. Em breve você poderá exportar arquivos csv.",
								"Exportar...	(Alt+e)",
								JOptionPane.PLAIN_MESSAGE);
			}
		});
		return exportarItem;
	}

	private JMenuItem exportarImagemItem() {
		JMenuItem exportarImagemItem = new JMenuItem(
				"Exportar imagem (jpeg, PNG)... (Alt+i)");
		exportarImagemItem.setMnemonic('i');
		exportarImagemItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane
						.showMessageDialog(
								FramePrincipal.this,
								"Este é o submenu 'Exportar imagem...'. Em breve você poderá exportar arquivos jpeg, PNG.",
								"Exportar...	(Alt+e)",
								JOptionPane.PLAIN_MESSAGE);
			}
		});
		return exportarImagemItem;
	}

	private JMenuItem sairItem() {
		JMenuItem sairItem = new JMenuItem("Sair");
		sairItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		return sairItem;
	}

	private JMenu getPreferenciasMenu() {
		preferenciasMenu = new JMenu("Preferências");
		preferenciasMenu.setMnemonic('p');
		preferenciasMenu.add(graficoMenu());
		preferenciasMenu.add(idiomaMenu());
		return preferenciasMenu;
	}

	private JMenu graficoMenu() {
		graficoMenu = new JMenu("Gráficos (Alt+g)");
		graficoMenu.setMnemonic('g');
		graficoMenu.add(fundoItem());
		graficoMenu.add(curvaItem());
		graficoMenu.add(gridItem());
		graficoMenu.add(autoEscalarItem());
		return graficoMenu;
	}

	private JMenuItem fundoItem() {
		JMenuItem fundoItem = new JMenuItem("- Fundo (cor)");
		fundoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'fundo'", "- Fundo (cor)",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return fundoItem;
	}

	private JMenuItem curvaItem() {
		JMenuItem curvaItem = new JMenuItem("- Curva (cor)");
		curvaItem.setMnemonic('c');

		curvaItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'Curva'.", "- Curva (cor)",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return curvaItem;
	}

	private JMenuItem gridItem() {
		JMenuItem gridItem = new JMenuItem("- Grid");
		gridItem.setMnemonic('g');
		gridItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'Grid'.", "- Grid",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return gridItem;
	}

	private JMenuItem autoEscalarItem() {
		JMenuItem autoEscalarItem = new JMenuItem("- Autoescalar");
		autoEscalarItem.setMnemonic('a');

		autoEscalarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'Autoescalar'.", "- Autoescalar",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return autoEscalarItem;
	}

	private JMenu idiomaMenu() {
		idiomaMenu = new JMenu("Idioma (Alt+i)");
		idiomaMenu.setMnemonic('i');
		idiomaMenu.add(portuguesItem());
		idiomaMenu.add(englishItem());
		return idiomaMenu;
	}

	private JMenuItem portuguesItem() {
		JMenuItem portuguesItem = new JMenuItem("- Português");
		portuguesItem.setMnemonic('p');
		portuguesItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'portugues'", "- Português",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return portuguesItem;
	}

	private JMenuItem englishItem() {
		JMenuItem englishItem = new JMenuItem("- English");
		englishItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'english'.", "- English",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return englishItem;
	}

	private JMenu getAjudaMenu() {
		ajudaMenu = new JMenu("Ajuda");
		ajudaMenu.setMnemonic('h');
		ajudaMenu.add(instrucoesItem());
		ajudaMenu.add(versaoItem());
		return ajudaMenu;
	}

	private JMenuItem instrucoesItem() {
		JMenuItem instrucoesItem = new JMenuItem("Instruções de uso");
		instrucoesItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'instruções de uso'",
						"Instruções de uso", JOptionPane.PLAIN_MESSAGE);
			}
		});
		return instrucoesItem;
	}

	private JMenuItem versaoItem() {
		JMenuItem versaoItem = new JMenuItem("Versão");
		versaoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(FramePrincipal.this,
						"Este é o submenu 'versão'.", "Versão",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		return versaoItem;
	}

}
