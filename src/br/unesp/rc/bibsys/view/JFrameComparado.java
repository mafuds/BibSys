/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.view;

import br.unesp.rc.bibsys.utils.ArquivoUtils;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tuifm
 */
public class JFrameComparado extends javax.swing.JFrame
{
    String nomeArqAmbos, nomeArq1, nomeArq2;
    
    /**
     * Creates new form JFrameConvertido
     */
    public JFrameComparado()
    {
        initComponents();
    }
    
    /**
     * Creates new form JFrameConvertido
     * @param arqAmbos
     * @param arq1
     * @param arq2
     */
    public JFrameComparado(String arqAmbos, String arq1, String arq2)
    {
        initComponents();
//        System.out.println(arqAmbos + " - " + arq1 + " - " + arq2);
        nomeArq1 = new File(arq1).getName();
        nomeArq2 = new File(arq2).getName();
        File arq = new File(arqAmbos);
        nomeArqAmbos = arq.getName();
        loadTxtEndereco(arq);
    }
    
    private void loadTxtEndereco(File arq) {
        String conteudo = ArquivoUtils.lerArquivo(arq);
        txtArquivo.setText(conteudo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpcoes = new javax.swing.ButtonGroup();
        pnJanela = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        pnConteudo = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtArquivo = new java.awt.TextArea();
        rbAmbos = new javax.swing.JRadioButton();
        rbApenasDois = new javax.swing.JRadioButton();
        rbApenasUm = new javax.swing.JRadioButton();
        barraMenu = new javax.swing.JMenuBar();
        menuAcoes = new javax.swing.JMenu();
        menuItemConverter = new javax.swing.JMenuItem();
        menuItemConcatenar = new javax.swing.JMenuItem();
        menuItemComparar = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemVersao = new javax.swing.JMenuItem();
        menuItemAutores = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemInstrucoes = new javax.swing.JMenuItem();
        menuItemFaleConosco = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BibSys");

        lbTitulo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lbTitulo.setText("Arquivo comparado");

        lbImagem.setBounds(10, 11, 414, 86);
        URL path = getClass().getResource("/Imagem/tartaruga.png");
        pnTitulo.add(lbImagem);
        ImageIcon logo = new ImageIcon(path);
        Image img = logo.getImage();
        //Image newImg = img.getScaledInstance(lbImagem.getWidth(), lbImagem.getHeight(), Image.SCALE_SMOOTH);
        Image newImg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lbImagem.setIcon(image);
        lbImagem.setName(""); // NOI18N

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(102, 102, 102)
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtArquivo.setEditable(false);

        bgOpcoes.add(rbAmbos);
        rbAmbos.setSelected(true);
        rbAmbos.setText("Referencias de Ambos");
        rbAmbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAmbosActionPerformed(evt);
            }
        });

        bgOpcoes.add(rbApenasDois);
        rbApenasDois.setText("Apenas do arquivo 2");
        rbApenasDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApenasDoisActionPerformed(evt);
            }
        });

        bgOpcoes.add(rbApenasUm);
        rbApenasUm.setText("Apenas do arquivo 1");
        rbApenasUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApenasUmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(35, 35, 35))
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAmbos)
                .addGap(18, 18, 18)
                .addComponent(rbApenasUm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbApenasDois)
                .addContainerGap())
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAmbos)
                    .addComponent(rbApenasDois)
                    .addComponent(rbApenasUm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnMenu))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout pnJanelaLayout = new javax.swing.GroupLayout(pnJanela);
        pnJanela.setLayout(pnJanelaLayout);
        pnJanelaLayout.setHorizontalGroup(
            pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnJanelaLayout.setVerticalGroup(
            pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuAcoes.setText("Ações");

        menuItemConverter.setText("Converter");
        menuItemConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConverterActionPerformed(evt);
            }
        });
        menuAcoes.add(menuItemConverter);

        menuItemConcatenar.setText("Concatenar");
        menuItemConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConcatenarActionPerformed(evt);
            }
        });
        menuAcoes.add(menuItemConcatenar);

        menuItemComparar.setText("Comparar");
        menuItemComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCompararActionPerformed(evt);
            }
        });
        menuAcoes.add(menuItemComparar);

        barraMenu.add(menuAcoes);

        menuSobre.setText("Sobre");

        menuItemVersao.setText("Versão do sistema");
        menuItemVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVersaoActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemVersao);

        menuItemAutores.setText("Autores");
        menuItemAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAutoresActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemAutores);

        barraMenu.add(menuSobre);

        menuAjuda.setText("Ajuda");

        menuItemInstrucoes.setText("Instruções");
        menuItemInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInstrucoesActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemInstrucoes);

        menuItemFaleConosco.setText("Fale conosco");
        menuItemFaleConosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFaleConoscoActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemFaleConosco);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnJanela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void mudaTexto() {
        String nomeArq = "";

        if (rbAmbos.isSelected()) {
            nomeArq = "src\\tmp\\" + nomeArqAmbos;
        } else if (rbApenasUm.isSelected()) {
            nomeArq = "src\\tmp\\" + nomeArq1;
        } else if (rbApenasDois.isSelected()) {
            nomeArq = "src\\tmp\\" + nomeArq2;
        }
        loadTxtEndereco(new File (nomeArq));
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // garante que o diretorio do arquivo resultante existe
        String caminho = "src\\Arquivos\\Comparacao";
        ArquivoUtils.criaDiretorio(caminho);
        boolean sucesso = false;
        
        String nomeSalvarArqAmbos = "src\\Arquivos\\Comparacao\\" + nomeArqAmbos;
        String nomeSalvarArqArq1 = "src\\Arquivos\\Comparacao\\" + nomeArq1;
        String nomeSalvarArqArq2 = "src\\Arquivos\\Comparacao\\" + nomeArq2;
        
        String nomeTmpArqAmbos = "src\\tmp\\" + nomeArqAmbos;
        String nomeTmpArqArq1 = "src\\tmp\\" + nomeArq1;
        String nomeTmpArqArq2 = "src\\tmp\\" + nomeArq2;
        
        PrintWriter novoArq;
        String conteudo;
        
        String mensagem = "Ocorreu um erro ao salvar o arquivo. ";
        try {
            novoArq = new PrintWriter(nomeSalvarArqAmbos, "UTF-8");
            conteudo = ArquivoUtils.lerArquivo(new File(nomeTmpArqAmbos));
            novoArq.print(conteudo);
            novoArq.close();
            
            novoArq = new PrintWriter(nomeSalvarArqArq1, "UTF-8");
            conteudo = ArquivoUtils.lerArquivo(new File(nomeTmpArqArq1));
            novoArq.print(conteudo);
            novoArq.close();
            
            novoArq = new PrintWriter(nomeSalvarArqArq2, "UTF-8");
            conteudo = ArquivoUtils.lerArquivo(new File(nomeTmpArqArq2));
            novoArq.print(conteudo);
            novoArq.close();
            
            mensagem = "Arquivo salvo com sucesso! Voce podera acha-lo em src/Arquivos/Comparacao. \nDeseja abrir esta pasta agora?";
            sucesso = true;
        } catch (IOException ex) {
            System.out.println("Erro ao criar o arquivo. Mensagem: " + ex.getMessage());
            mensagem = mensagem + ex.getMessage();
        }
        
        int input = JOptionPane.showOptionDialog(this,
                mensagem, 
                "Salvar arquivo", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                null, 
                null);
        
        if (input == JOptionPane.YES_OPTION && sucesso) {
            try {
                Runtime.getRuntime().exec("explorer.exe /select," + caminho + "\\");
            } catch (IOException ex) {
                System.out.println("Erro ao abrir o file explorer: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void menuItemConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConverterActionPerformed
        JFrame jfConverter = new JFrameConverter();
        jfConverter.pack();
        jfConverter.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemConverterActionPerformed

    private void menuItemVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVersaoActionPerformed
        JFrame jfVersao = new JFrameVersao();
        jfVersao.pack();
        jfVersao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemVersaoActionPerformed

    private void menuItemAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAutoresActionPerformed
        JFrame jfAutores = new JFrameAutores();
        jfAutores.pack();
        jfAutores.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemAutoresActionPerformed

    private void menuItemInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInstrucoesActionPerformed
        JFrame jfInstrucoes = new JFrameInstrucoes();
        jfInstrucoes.pack();
        jfInstrucoes.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemInstrucoesActionPerformed

    private void menuItemFaleConoscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFaleConoscoActionPerformed
        JFrame jfFaleConosco = new JFrameFaleConosco();
        jfFaleConosco.pack();
        jfFaleConosco.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemFaleConoscoActionPerformed

    private void menuItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConcatenarActionPerformed
        JFrame jfConcatenar = new JFrameConcatenar();
        jfConcatenar.pack();
        jfConcatenar.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemConcatenarActionPerformed

    private void menuItemCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCompararActionPerformed
        JFrame jfComparar = new JFrameComparar();
        jfComparar.pack();
        jfComparar.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCompararActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        JFrame jfMenu = new SplashForm();
        jfMenu.pack();
        jfMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void rbAmbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAmbosActionPerformed
        // TODO add your handling code here:
        mudaTexto();
    }//GEN-LAST:event_rbAmbosActionPerformed

    private void rbApenasUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApenasUmActionPerformed
        // TODO add your handling code here:
        mudaTexto();
    }//GEN-LAST:event_rbApenasUmActionPerformed

    private void rbApenasDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApenasDoisActionPerformed
        // TODO add your handling code here:
        mudaTexto();
    }//GEN-LAST:event_rbApenasDoisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JFrameComparado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.ButtonGroup bgOpcoes;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenu menuAcoes;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuItemAutores;
    private javax.swing.JMenuItem menuItemComparar;
    private javax.swing.JMenuItem menuItemConcatenar;
    private javax.swing.JMenuItem menuItemConverter;
    private javax.swing.JMenuItem menuItemFaleConosco;
    private javax.swing.JMenuItem menuItemInstrucoes;
    private javax.swing.JMenuItem menuItemVersao;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnJanela;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbAmbos;
    private javax.swing.JRadioButton rbApenasDois;
    private javax.swing.JRadioButton rbApenasUm;
    private java.awt.TextArea txtArquivo;
    // End of variables declaration//GEN-END:variables
}
