package br.iesb.VIS2048.teste;

import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.swing.JFileChooser;  
import javax.swing.JOptionPane;  

public class TesteFileChooser extends javax.swing.JFrame {  
  
    private static final long serialVersionUID = 1L;  
    public TesteFileChooser() {  
        initComponents();  
    }  
  
     private void initComponents() {  
        jScrollPane1 = new javax.swing.JScrollPane();  
        jTextArea1 = new javax.swing.JTextArea();  
        jScrollPane2 = new javax.swing.JScrollPane();  
        jTextArea2 = new javax.swing.JTextArea();  
        jLabel1 = new javax.swing.JLabel();  
        jButtonLex = new javax.swing.JButton();  
        jButtonSint = new javax.swing.JButton();  
        jButtonSair = new javax.swing.JButton();  
        jMenuBar1 = new javax.swing.JMenuBar();  
        jMenu1 = new javax.swing.JMenu();  
        jMenuItemAbrir = new javax.swing.JMenuItem();  
        jMenuSalvar = new javax.swing.JMenuItem();  
        jMenuLimpar = new javax.swing.JMenuItem();  
        fileChooser = new javax.swing.JFileChooser(".");  
  
        getContentPane().setLayout(null);  
  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
        setTitle("Compilador");  
        setResizable(false);  
        jTextArea1.setColumns(20);  
        jTextArea1.setRows(5);  
        jTextArea1.setLineWrap(true);  
        jScrollPane1.setViewportView(jTextArea1);  
  
        getContentPane().add(jScrollPane1);  
        jScrollPane1.setBounds(20, 20, 520, 430);  
  
        jTextArea2.setColumns(20);  
        jTextArea2.setRows(5);  
        jScrollPane2.setViewportView(jTextArea2);  
  
        getContentPane().add(jScrollPane2);  
        jScrollPane2.setBounds(20, 470, 520, 110);  
  
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10));  
        jLabel1.setText("Console");  
        getContentPane().add(jLabel1);  
        jLabel1.setBounds(30, 450, 45, 20);  
  
        jButtonLex.setText("L\u00e9xico");  
        jButtonLex.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jButtonLexActionPerformed(evt);  
            }  
        });  
  
        getContentPane().add(jButtonLex);  
        jButtonLex.setBounds(20, 590, 110, 25);  
  
        jButtonSint.setText("Sint\u00e1tico");  
        jButtonSint.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jButtonSintActionPerformed(evt);  
            }  
        });  
  
        getContentPane().add(jButtonSint);  
        jButtonSint.setBounds(240, 590, 88, 25);  
  
        jButtonSair.setText("Sair");  
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jButtonSairActionPerformed(evt);  
            }  
        });  
  
        getContentPane().add(jButtonSair);  
        jButtonSair.setBounds(450, 590, 90, 25);  
  
        jMenu1.setText("Menu");  
  
        jMenuItemAbrir.setText("Abrir");  
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jMenuItemAbrirActionPerformed(evt);  
            }  
        });  
  
        jMenu1.add(jMenuItemAbrir);  
  
        jMenuSalvar.setText("Salvar");  
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jMenuSalvarActionPerformed(evt);  
            }  
        });  
  
        jMenu1.add(jMenuSalvar);  
        jMenuLimpar.setText("Limpar");  
        jMenuLimpar.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                jMenuLimparActionPerformed(evt);  
            }  
        });  
  
        jMenu1.add(jMenuLimpar);  
  
        jMenuBar1.add(jMenu1);  
  
        setJMenuBar(jMenuBar1);  
  
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();  
        setBounds((screenSize.width-566)/2, (screenSize.height-680)/2, 566, 680);  
    }   
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {   
           System.exit(0);  
    }   
  
    private void jButtonSintActionPerformed(java.awt.event.ActionEvent evt) {   
         String[] args = new String[1];  
         args[0] = fileChooser.getSelectedFile().getAbsolutePath();  
          
    }   
  
    private void jButtonLexActionPerformed(java.awt.event.ActionEvent evt) {   
         String[] args = new String[1];  
         args[0] = fileChooser.getSelectedFile().getAbsolutePath();  
          
    }   
  
    private void jMenuLimparActionPerformed(java.awt.event.ActionEvent evt) {   
        jTextArea1.setText("");  
        jTextArea2.setText("");  
    }    
  
    private void jMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {   
        int res = fileChooser.showSaveDialog(this);  
        if(res == JFileChooser.APPROVE_OPTION){  
            File arq = fileChooser.getSelectedFile();  
            try{  
                   
                fileChooser.showOpenDialog(this);  
     
                String s = fileChooser.getSelectedFile().getAbsolutePath();  
                System.out.println("fileChooser.getSelectedFile().getAbsolutePath(): " + s);  
  
                escreveArquivo(jTextArea1.getText(), arq.getPath());  
  
                System.out.println("Nome do arquivo escolhido: " + arq.getPath());  
  
            } catch(IOException ioe){  
                JOptionPane.showMessageDialog(null, "Não foi possível salvar arquivo!");  
            }  
        }  
    }   
  
    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {   
        int res = fileChooser.showOpenDialog(this);  
  
         if(res == JFileChooser.APPROVE_OPTION){  
             File arq = fileChooser.getSelectedFile();  
             try{  
                 jTextArea1.setText(retornaString(arq.getPath()));  
             } catch(Exception ex){  
                 JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo" +  arq.getPath() + "!",                 "Leitura de arquivo", JOptionPane.ERROR_MESSAGE);  
             }  
         }  
    }  
  
    public void escreveArquivo(String conteudo, String fileName) throws IOException {  
  
        PrintWriter out = new PrintWriter(new FileWriter(fileName));  
        out.print(conteudo);  
        out.close();  
        JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");  
  
    }  
  
    public String retornaString(String fileName) throws IOException {  
  
        BufferedReader in = new BufferedReader(new FileReader(fileName));  
        String line;  
        StringBuffer buffer = new StringBuffer();  
  
        while( (line = in.readLine()) != null ){  
            buffer.append(line + "\n");  
        }  
  
        in.close();  
        return buffer.toString();  
  
    }  
  
    public String retornaStringTok(String fileName) throws IOException {  
  
        BufferedReader in = new BufferedReader(new FileReader(fileName));  
        String line;  
        StringBuffer buffer = new StringBuffer();  
  
        while( (line = in.readLine()) != null ){  
            buffer.append(line + "\n");  
        }  
  
        jTextArea2.setText(buffer.toString());  
  
        in.close();  
            return buffer.toString();  
  
    }  
  
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {  
            public void run() {  
                new TesteFileChooser().setVisible(true);  
            }  
        });  
    }  
  
    private javax.swing.JButton jButtonLex;  
    private javax.swing.JButton jButtonSair;  
    private javax.swing.JButton jButtonSint;  
    private javax.swing.JLabel jLabel1;  
    private javax.swing.JMenu jMenu1;  
    private javax.swing.JMenuBar jMenuBar1;  
    private javax.swing.JMenuItem jMenuItemAbrir;  
    private javax.swing.JMenuItem jMenuLimpar;  
    private javax.swing.JMenuItem jMenuSalvar;  
    private javax.swing.JScrollPane jScrollPane1;  
    private javax.swing.JScrollPane jScrollPane2;  
    private javax.swing.JTextArea jTextArea1;  
    public static javax.swing.JTextArea jTextArea2;  
    private javax.swing.JFileChooser fileChooser;  
  
}  