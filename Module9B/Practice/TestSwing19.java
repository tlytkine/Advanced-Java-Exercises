// File: TestSwing19.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 2000
//
// Quit button - placed SOUTH.

import java.awt.*;
import javax.swing.*;

class NewFrame extends JFrame {

    // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Button example");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Extract the contentPane because we'll 
	// need to refer to it a couple of times.
	Container cPane = this.getContentPane();
	
	// Create a Button instance and pass the button 
	// label as a parameter to the constructor.
	JButton b = new JButton ("Quit");
	b.setBackground (Color.cyan);
	
	// Set the layout manager for our Frame.
	cPane.setLayout (new BorderLayout());
	
	// Add the button to the frame.
	cPane.add (b, BorderLayout.SOUTH);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"


public class TestSwing19 {
    
    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }
    
}
