// File: TestSwing6.java (Module 9b)
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


// Create a new Frame class.

class NewFrame extends JFrame {

    public NewFrame ()
    {
	// Set the title and other parameters.
	this.setTitle ("Some Geometric Figures");
	this.setResizable (true);
	this.setSize (500, 400);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
}

public class TestSwing6 {

    public static void main (String[] argv)
    {
	// Simply fire up the whole application.
	NewFrame f = new NewFrame ();
    }
    
}
