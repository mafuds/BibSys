/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.view;

import java.awt.Image;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author tuifm
 */
public class SplashForm extends javax.swing.JFrame
{

    /**
     * Creates new form SplashForm
     */
    public SplashForm()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnJanela = new javax.swing.JPanel();
        pnTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        pnConteudo = new javax.swing.JPanel();
        txtTextoBib = new javax.swing.JTextField();
        btnConverter = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCaminhoArq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        ButtonGroup buttonGroup = new ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
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

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Converter Arquivo");

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
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114)
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
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTextoBib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoBibActionPerformed(evt);
            }
        });

        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");

        btnPesquisar.setText("Pesquisar");

        jRadioButton1.setText("Caminho do arquivo:");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        buttonGroup.add(jRadioButton1);

        jRadioButton2.setText("Texto a ser convertido:");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        buttonGroup.add(jRadioButton2);

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConverter)
                .addGap(35, 35, 35))
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTextoBib, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                        .addComponent(txtCaminhoArq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminhoArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTextoBib, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConverter)
                    .addComponent(btnSair))
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
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConverterActionPerformed

    private void txtTextoBibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoBibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoBibActionPerformed

    private void menuItemConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConverterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemConverterActionPerformed

    private void menuItemVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVersaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemVersaoActionPerformed

    private void menuItemAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAutoresActionPerformed

    private void menuItemInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInstrucoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemInstrucoesActionPerformed

    private void menuItemFaleConoscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFaleConoscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemFaleConoscoActionPerformed

    private void menuItemConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConcatenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemConcatenarActionPerformed

    private void menuItemCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCompararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCompararActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    // trocar pra 5000 depois  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    
                }
                new SplashForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnConverter;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lbImagem;
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
    private javax.swing.JTextField txtCaminhoArq;
    private javax.swing.JTextField txtTextoBib;
    // End of variables declaration//GEN-END:variables
}
