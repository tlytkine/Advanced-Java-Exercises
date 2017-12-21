// File: TestSwing10.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Drawing outside the visible area.

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
	
	// Draw a wide rectangle:
	g.fillRect (-100, 100, 800, 50);
    }
    
}


class NewFrame extends JFrame {

    // Constructors.
    public NewFrame (int width, int height)
    {
	// Set the title and other parameters.
	this.setTitle ("Outside the region");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	this.getContentPane().add (new NewPanel());
	
	// Show the frame.
	this.setVisible (true);
    }
    
}

public class TestSwing10 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 300);
    }
    
}
