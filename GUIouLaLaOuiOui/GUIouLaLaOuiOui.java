/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIouLaLaOuiOui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author douglas.whalen554
 */
public class GUIouLaLaOuiOui {
   
/* Le programme plus sample monstree' comme utilizer le AWT GUI (dit "goo-oui") system
l'auteur: monsieurDouglas
 */

public static void main(String[] args) {
        GUIMaker();

    }
    private static Frame mainFrame;

    

    public static void GUIMaker() {
        // Create project Frame(le titre)

        mainFrame = new Frame ("AWT Le Plus Simple Demo");


    // set mainFrame Layout
    mainFrame.setLayout(new GridLayout(1,2));

    // set mainFrame size
    mainFrame.setSize(500,250);

    // set the mainFrame as visible
    mainFrame.setVisible(true);

    

    //Program ze button para el exito
    mainFrame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
        } // Close windowClosing()
    });// Close addWindowListener
    } // Close GUIMaker
    
} // close class GUIouLaLaOuiOui

