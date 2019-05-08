/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIouLaLaOuiOui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
/**
 *
 * @author douglas.whalen554
 */
public class Swiiiiiiiiing {
    
    // member variable allows all methods to access
    // top-level container
    private static JFrame frame;
    private static JPanel p1;
    private static JPanel p2;
    private static JPanel p3;
    private static JPanel p4;
    private static JPanel p5;
        
    public static void main(String [] args) {
        
        // GUI Creation pattern
        
        // step 1: object creation: store in typed member variable
        frame = new JFrame("Pattern Practice");
        
        // step 2: configure propoerties on our new object
        frame.setTitle("Mission Impossible");
        frame.setSize(2000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // step 3: set visibility and/ or attach to parent component
        // for display
        frame.setVisible(true);
        // are these even necessary if JFrame is visible?
        /* p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        p4.setVisible(true);
        p5.setVisible(true); */
        //add JPanels to the JFrame
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        
        JPanel p1 = new JPanel(new BorderLayout());
        // p1.setSize(600, 400);
        p1.setLayout(new GridLayout(1,9));
        // I know something is wrong with BorderLayout but I cannot solve it
        p1.setLayout(new BorderLayout(100,500));
        p1.add(new JButton("Back"));
        p1.add(new JButton("Forward"));
        p1.add(new JButton("Reload"));
        p1.add(new JButton("Images"));
        p1.add(new JButton("Open"));
        p1.add(new JButton("Print"));
        p1.add(new JButton("Find"));
        p1.add(new JButton("Stop"));
        
        JPanel p2 = new JPanel(new BorderLayout());
        p2.setSize(100, 400);
        p2.setLayout(new GridLayout(1,1));
        p2.add(new JButton("SELECT USENET GROUP"), BorderLayout.CENTER);
        
        JPanel p3 = new JPanel();
        p3.setSize(1000, 150);
        p3.setLayout(new GridLayout(1,1));
        p3.add(new JButton("To unsubscribe from any user groups, select the"
                + "matching toggle buttons and click the 'Unsubscribe from"
                + "Selected Newsgroups' button. To subscribe to a new newsgroup"
                + "type in the name of the newsgroup in the 'Subscribe to this"
                + "Newsgroup' field and press RETURN or ENTER."),
                 BorderLayout.CENTER);
        
        JPanel p4 = new JPanel();
        p4.setSize(1000, 250);
        p4.setLayout(new GridLayout(1,1));
        p4.add(new JButton("SEARCH: MAX.COM"), BorderLayout.CENTER);
        
        JPanel p5 = new JPanel();
        p5.setSize(1000, 250);
        p5.setLayout(new GridLayout(1,9));
        p5.add(new JButton("Subscribe"));
        p5.add(new JButton("Unsubscribe"));
        p5.add(new JButton("Show All Articles"));
        p5.add(new JButton("About Newsgroups"));
        
        // I cannot get anything but the JFrame to show when I run
                       
    }
    
}
