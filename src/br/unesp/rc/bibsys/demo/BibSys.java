package br.unesp.rc.bibsys.demo;

import java.awt.Graphics2D;
import java.awt.SplashScreen;

public class BibSys
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        final SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }
        Graphics2D g = splash.createGraphics();
        if (g == null) {
            System.out.println("g is null");
            return;
        }
        
    }
}
