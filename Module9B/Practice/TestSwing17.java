// File: TestSwing17.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 1998
//
// A simple quit button - using paintComponent.

import java.awt.*;
import javax.swing.*;

// Extend JPanel to override paintComponent ()
class NewPanel extends JPanel {

    public NewPanel () 
    {
	this.setBackground (Color.cyan);
    }
    
    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);
	
	JButton b = new JButton ("QUIT");
	
	// Add the button to the panel
	this.add (b);
	this.validate ();
    }
    
} // End of NewPanel


class NewFrame extends JFrame {

    // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Button example");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"

  
public class TestSwing17 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }
    
}
