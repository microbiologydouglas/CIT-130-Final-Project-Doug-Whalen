/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIouLaLaOuiOui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

/**
 *
 * @author douglas.whalen554
 */
public class GUIProject extends JFrame {
    // member variable allows all methods to access
    // top-level container
   
    
        public GUIProject() {
                    // step 1: object creation: store in typed member variable
            frame = new JFrame("Pattern Practice");

            // Set BorderLayout with horizonatal gap 5, vertical gap 10
            setLayout(new BorderLayout(5,10));
            
            //Add buttons to the frame
            
            frame.add(new JButton("East", BorderLayout.EAST));
            add(new JButton("South", BorderLayout.SOUTH));
            add(new JButton("West", BorderLayout.WEST));
            add(new JButton("North", BorderLayout.NORTH));
            add(new JButton("Center", BorderLayout.CENTER));
        }
    
    
                
    public static void main(String [] args) {
        GUIProject frame = new GUIProject();
        frame.setTitle("GUIProject");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // center das frame!
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
    

    
}
