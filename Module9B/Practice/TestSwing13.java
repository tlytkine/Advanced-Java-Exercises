// File: TestSwing13.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Images.

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
	
	// Get a Toolkit instance.
	Toolkit tk = Toolkit.getDefaultToolkit ();
	
	// Provide a filename to the getImage() method.
	Image img = tk.getImage ("bugs.gif");
	
	// Use the drawImage method.
	g.drawImage (img, 0, 0, this);
	// Note: we pass "this" as a parameter.
    }
    
} // End of NewPanel

class NewFrame extends JFrame {

    // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Bugs");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"


public class TestSwing13 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }
    
}
