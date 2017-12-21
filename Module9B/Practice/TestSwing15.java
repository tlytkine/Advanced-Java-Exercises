// File: TestSwing15.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Image tracking via MediaTracker.

import java.awt.*;
import javax.swing.*;
import java.net.*;

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
	
	try {
	    URL u = new URL ("http://www2.seas.gwu.edu/~simha/canyon.jpg");
	    Image img = tk.getImage (u);
	    
	    // Create an instance of MediaTracker and 
	    // pass a Frame instance as parameter (via "this").
	    MediaTracker mt = new MediaTracker (this);
	    
	    // Add the image instance to the tracker.
	    mt.addImage (img, 1);
	    
	    // We will use a "wait" (clock) cursor while the
	    // image is loading.
	    this.setCursor (Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
	    
	    // Ask the MediaTracker to wait.
	    try {
		mt.waitForID (1);
	    }
	    catch (InterruptedException e) {
		System.out.println (e);
	    }
	    // Now the image has been loaded.
	    
	    // Return to default cursor.
	    this.setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    
	    // Draw the complete image.
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

public class TestSwing15 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (600, 300);
    }

}
