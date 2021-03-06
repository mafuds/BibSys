/*
 * DisplayTrayIcon é responsável por fazer com o que o software fique na System Tray
 * corretamente e possua suas funções
 */
package br.unesp.rc.bibsys.view;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DisplayTrayIcon {
    
    static TrayIcon trayIcon;
    
    public DisplayTrayIcon() {
        ShowTrayIcon();
    }

/**
 * Mostra o programa como um ícone na System Tray com as devidas funcionalidades
 * em um menu, além das devidas características
 * @author Artur, Gabriel e Mariana
 */    
    public static void ShowTrayIcon() {
        if (!SystemTray.isSupported()) {
            System.out.println("Não suporta a System Tray");
            System.exit(0);
            return;
        }
        
        final PopupMenu popup = new PopupMenu();
        trayIcon = new TrayIcon(CreateIcon("/Imagem/rsz_tartaruga.png", "Tray Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        
        trayIcon.setToolTip("BibSys Tortoise\nVersão 1.0");
        
        // Coloca os componentes (itens) do menu
        MenuItem itemMenuPrincipal = new MenuItem("Menu Principal");
        MenuItem itemSobre = new MenuItem("Versão");
        MenuItem itemSair = new MenuItem("Sair");
        
        // Popular o pop up menu
        popup.add(itemMenuPrincipal);
        popup.add(itemSobre);
        popup.addSeparator();
        popup.add(itemSair);
        
        trayIcon.setPopupMenu(popup);
        
        itemMenuPrincipal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFrame jfPrincipal = new SplashForm();
                jfPrincipal.pack();
                jfPrincipal.setVisible(true);
                dispose();
            }

            private void dispose()
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        itemSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFrame jfVersao = new JFrameVersao();
                jfVersao.pack();
                jfVersao.setVisible(true);
                dispose();
            }

            private void dispose()
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        itemSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tray.remove(trayIcon);
                System.exit(0);
            }
        });
        
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            
        }
    }

/**
 * Cria a imagem a ser exibida na System Tray
 * @author Artur, Gabriel e Mariana
 * @param path o caminho da imagem a ser mostrada
 * @param desc o texto que será exibido ao se clicar no ícone
 * @return uma imagem pronta para ser usada
 */    
    protected static Image CreateIcon(String path, String desc) {
        URL ImageURL = DisplayTrayIcon.class.getResource(path);
        return (new ImageIcon(ImageURL,desc)).getImage();
    }
}
