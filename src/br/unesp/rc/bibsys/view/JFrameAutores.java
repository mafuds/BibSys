/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.view;

import br.unesp.rc.bibsys.utils.OperacaoUtils;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author tuifm
 */
public class JFrameAutores extends javax.swing.JFrame
{
//    File arqConvertido;
    
    /**
     * Creates new form JFrameConvertido
     */
    public JFrameAutores()
    {
        initComponents();
    }
    
    /**
     * Creates new form JFrameConvertido
     * @param arqConvertido
     */
    public JFrameAutores(File arqConvertido)
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
        lbTitulo = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        pnConteudo = new javax.swing.JPanel();
        lbArtur = new javax.swing.JLabel();
        lbGabriel = new javax.swing.JLabel();
        lbMariana = new javax.swing.JLabel();
        lbTurma = new javax.swing.JLabel();
        lbUnesp = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuAcoes = new javax.swing.JMenu();
        menuItemConverter = new javax.swing.JMenuItem();
        menuItemConcatenar = new javax.swing.JMenuItem();
        menuItemComparar = new javax.swing.JMenuItem();
        menuItemOrdenar = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuItemVersao = new javax.swing.JMenuItem();
        menuItemAutores = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemInstrucoes = new javax.swing.JMenuItem();
        menuItemFaleConosco = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BibSys");

        lbTitulo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Autores");

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
                .addGap(80, 80, 80)
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbArtur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbArtur.setText("Artur Mafud");

        lbGabriel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbGabriel.setText("Mariana Fantini");

        lbMariana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMariana.setText("Gabriel Bonato");

        lbTurma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTurma.setText("Sistemas Orientados a Objetos - Integral");

        lbUnesp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUnesp.setText("UNESP - Rio Claro");

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbGabriel)
                    .addComponent(lbMariana))
                .addGap(170, 170, 170))
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnConteudoLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbArtur))
                    .addGroup(pnConteudoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbTurma))
                    .addGroup(pnConteudoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lbUnesp)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addComponent(lbArtur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMariana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbGabriel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUnesp)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnJanelaLayout = new javax.swing.GroupLayout(pnJanela);
        pnJanela.setLayout(pnJanelaLayout);
        pnJanelaLayout.setHorizontalGroup(
            pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnJanelaLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnJanelaLayout.setVerticalGroup(
            pnJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnMenu)
                .addContainerGap(34, Short.MAX_VALUE))
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

        menuItemOrdenar.setText("Ordenar");
        menuItemOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOrdenarActionPerformed(evt);
            }
        });
        menuAcoes.add(menuItemOrdenar);

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
            .addComponent(pnJanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void menuItemOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOrdenarActionPerformed
        // TODO add your handling code here:
        JFrame jfOrdenar = new JFrameOrdenar();
        jfOrdenar.pack();
        jfOrdenar.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrameAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrameAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrameAutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                System.out.println("oioi");
                new JFrameAutores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lbArtur;
    private javax.swing.JLabel lbGabriel;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbMariana;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTurma;
    private javax.swing.JLabel lbUnesp;
    private javax.swing.JMenu menuAcoes;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuItemAutores;
    private javax.swing.JMenuItem menuItemComparar;
    private javax.swing.JMenuItem menuItemConcatenar;
    private javax.swing.JMenuItem menuItemConverter;
    private javax.swing.JMenuItem menuItemFaleConosco;
    private javax.swing.JMenuItem menuItemInstrucoes;
    private javax.swing.JMenuItem menuItemOrdenar;
    private javax.swing.JMenuItem menuItemVersao;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnJanela;
    private javax.swing.JPanel pnTitulo;
    // End of variables declaration//GEN-END:variables
}
