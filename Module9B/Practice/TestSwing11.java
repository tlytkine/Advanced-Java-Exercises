// File: TestSwing11.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Explores fonts.

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
	
	// Create 10-point Serif fonts in all styles:
	Font f = new Font ("Serif", Font.PLAIN, 10);
	g.setFont (f);
	g.drawString ("Serif-Plain-10pt", 30, 60);
	
	f = new Font ("Serif", Font.ITALIC, 10);
	g.setFont (f);
	g.drawString ("Serif-Italic-10pt", 30, 90);
	
	f = new Font ("Serif", Font.PLAIN | Font.BOLD, 10);    
	g.setFont (f);
	g.drawString ("Serif-Plain-Bold-10pt", 30, 120);
	
	f = new Font ("Serif", Font.ITALIC | Font.BOLD, 10);    
	g.setFont (f);
	g.drawString ("Serif-Italic-Bold-10pt", 30, 150);
	
	// Create 20-point SansSerif fonts in all styles:
	f = new Font ("SansSerif", Font.PLAIN, 20);
	g.setFont (f);
	g.drawString ("SansSerif-Plain-20pt", 160, 60);
	
	f = new Font ("SansSerif", Font.ITALIC, 20);
	g.setFont (f);
	g.drawString ("SansSerif-Italic-20pt", 160, 90);
	
	f = new Font ("SansSerif", Font.PLAIN | Font.BOLD, 20);    
	g.setFont (f);
	g.drawString ("SansSerif-Plain-Bold-20pt", 160, 120 );
	
	f = new Font ("SansSerif", Font.ITALIC | Font.BOLD, 20);    
	g.setFont (f);
	g.drawString ("SansSerif-Italic-Bold-20pt", 160, 150);
    }
    
} // End of NewPanel



// Create a new Frame class.

class NewFrame extends JFrame {

    public NewFrame ()
    {
	// Set the title and other parameters.
	this.setTitle ("Fonts");
	this.setResizable (true);
	this.setSize (500, 250);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
	
	// Print out available font names.
	GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String[] fNames = gEnv.getAvailableFontFamilyNames();
	System.out.println ("Available font families: ");
	for (int i=0; i<fNames.length; i++)
	    System.out.println ("  " + fNames[i]);
    }
    
}

public class TestSwing11 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame ();
    }
    
}
