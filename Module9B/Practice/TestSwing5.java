// File: TestSwing5.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Geometric figures.

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
	
	// Draw a Square:
	g.drawRect (50,50,50,50);
	g.drawString ("Square", 50, 115);
	
	// Circle:
	g.drawOval (200,50,50,50);
	g.drawString ("Circle", 200, 115);
	
	// Rounded rectangle:
	g.drawRoundRect (350,50,75,50,20,20);
	g.drawString ("Rectangle", 350, 115);
	
	// Draw a line across the middle:
	g.drawLine (0,150,500,150);
	
	// Now draw some filled shapes:
	
	// Square:
	g.fillRect (50,200,50,50);
	g.drawString ("Square", 50, 265);
	
	// Circle:
	g.fillOval (200,200,50,50);
	g.drawString ("Circle", 200, 265);
	
	// Rounded rectangle:
	g.fillRoundRect (350,200,75,50,20,20);
	g.drawString ("Rectangle", 350, 265);
    }
    
}

public class TestSwing5 {

    public static void main (String[] argv)
    {
	// Create an instance of NewFrame
	JFrame f = new JFrame ();
	
	// Set the title and other parameters.
	f.setTitle ("Some Geometric Figures");
	f.setResizable (true);
	f.setSize (500, 300);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	f.getContentPane().add (panel);
	
	// Show the frame.
	f.setVisible (true);
    }
    
}
