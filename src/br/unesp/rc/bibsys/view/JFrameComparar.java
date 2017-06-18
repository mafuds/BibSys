/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.bibsys.view;

import br.unesp.rc.bibsys.utils.OperacaoUtils;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author tuifm
 */
public class JFrameComparar extends javax.swing.JFrame
{

    /**
     * Creates new form SplashForm
     */
    public JFrameComparar()
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
        btnComparar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtEnderecoArq1 = new javax.swing.JTextField();
        btnPesquisarArq1 = new javax.swing.JButton();
        txtEnderecoArq2 = new javax.swing.JTextField();
        btnPesquisarArq2 = new javax.swing.JButton();
        lbDescricao = new javax.swing.JLabel();
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
        lbTitulo.setText("Comparar Arquivos");

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
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(lbTitulo)
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
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnComparar.setText("Comparar");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnPesquisarArq1.setText("Pesquisar");
        btnPesquisarArq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarArq1ActionPerformed(evt);
            }
        });

        btnPesquisarArq2.setText("Pesquisar");
        btnPesquisarArq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarArq2ActionPerformed(evt);
            }
        });

        lbDescricao.setText("Por favor, selecione dois arquivos para serem comparados.");

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(btnComparar)
                .addGap(35, 35, 35))
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEnderecoArq1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarArq1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEnderecoArq2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarArq2)
                .addContainerGap())
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescricao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescricao)
                .addGap(28, 28, 28)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoArq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarArq1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoArq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarArq2))
                .addGap(94, 94, 94)
                .addGroup(pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComparar)
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
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed

        String nomeArq;
        File arq1 = new File(txtEnderecoArq1.getText());
        File arq2 = new File(txtEnderecoArq2.getText());
        
//        nomeArq = OperacaoUtils.comparar(arq1, arq2);

        // passar uma string pro jframe comparado

        // abrir o JFrame de arquivo convertido
        JFrame jfComparado = new JFrameComparado();
        jfComparado.pack();
        jfComparado.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnCompararActionPerformed

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

    private void btnPesquisarArq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarArq1ActionPerformed
        JFileChooser chooser = new JFileChooser("src\\Arquivos");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            txtEnderecoArq1.setText(file.getPath());
        }
    }//GEN-LAST:event_btnPesquisarArq1ActionPerformed

    private void btnPesquisarArq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarArq2ActionPerformed
        JFileChooser chooser = new JFileChooser("src\\Arquivos");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();            
            txtEnderecoArq2.setText(file.getPath());
        }
    }//GEN-LAST:event_btnPesquisarArq2ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        JFrame jfMenu = new SplashForm();
        jfMenu.pack();
        jfMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameComparar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(JFrameComparar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JFrameComparar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPesquisarArq1;
    private javax.swing.JButton btnPesquisarArq2;
    private javax.swing.JLabel lbDescricao;
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
    private javax.swing.JTextField txtEnderecoArq1;
    private javax.swing.JTextField txtEnderecoArq2;
    // End of variables declaration//GEN-END:variables
}
