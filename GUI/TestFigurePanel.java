/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author douglas.whalen554
 */
public class TestFigurePanel extends JFrame {
    public TestFigurePanel() {
        setLayout(new GridLayout(2, 3, 5, 5));
        add(new FigurePanel(FigurePanel.LINE));
        add(new FigurePanel(FigurePanel.RECTANGLE));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
        add(new FigurePanel(FigurePanel.OVAL));
        add(new FigurePanel(FigurePanel.RECTANGLE, true));
        add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, true));
    } // close TestFigurePanel
    
    public static void main(String[] args) {
        TestFigurePanel frame = new TestFigurePanel();
        frame.setSize(400, 200);
        frame.setTitle("TestFigurePanel");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        } // close main
    
    public class FigurePanel {
    // filler class because Liang SUCKS!!!
    } 
    
    
}
