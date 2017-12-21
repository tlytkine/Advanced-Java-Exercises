// File: TestSwing14.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Images - from a URL.

import java.awt.*;
import javax.swing.*;
import java.net.*;  // For class URL.

// Extend JPanel to override paintComponent ()
class NewPanel extends JPanel {

    public NewPanel () 
    {
	this.setBackground (Color.cyan);
    }
    
    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);
	
	Toolkit tk = Toolkit.getDefaultToolkit ();
	
	// try-catch needed since URL constructor throws an exception.
	try {
	    // URL is in java.net.
	    URL u = new URL ("http://www.seas.gwu.edu/~simha/canyon.jpg");
	    
	    // Load the image using the second form of getImage().
	    Image img = tk.getImage (u);
	    
	    // Display image.
	    g.drawImage (img, 0, 0, this);
	}
	catch (MalformedURLException e) {
	    System.out.println (e);
	}
	
    }
  
} // End of NewPanel
  

class NewFrame extends JFrame {

  // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Gif image");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"

public class TestSwing14 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (600, 300);
    }
    
}
