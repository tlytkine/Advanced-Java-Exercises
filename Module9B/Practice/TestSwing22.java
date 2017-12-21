// File: TestSwing22.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 2000
//
// Quit button - handling the event.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListener.

class NewFrame extends JFrame implements ActionListener {

    // Constructor.
    public NewFrame (int width, int height)
    {
	// On Mac-OS-X, you may add this for the default Java look:
	try {
	    UIManager.setLookAndFeel (UIManager.getCrossPlatformLookAndFeelClassName());
	} catch (Exception e) {
	    e.printStackTrace(); 
	}

	// Set the title and other frame parameters.
	this.setTitle ("Button example");
	this.setResizable (true);
	this.setSize (width, height);
	
	Container cPane = this.getContentPane();
	
	// Create a new button.
	JButton b = new JButton ("<html> <b> Quit </b> </html>");
	b.setBackground (Color.red);
	
	// Add an ActionListener to the button.
	b.addActionListener (this);
	
	// BorderLayout is already the manager of the content pane
	// but leave a comment as a reminder.
	// cPane.setLayout (new BorderLayout());
	
	// Add the button to the south of the frame.
	cPane.add (b, BorderLayout.SOUTH);
	
	// Show the frame.
	this.setVisible (true);
    }
    
    // This method is required to implement the 
    // ActionListener interface.
    public void actionPerformed (ActionEvent a)
    {
	System.out.println ("In actionPerformed");
	
	// Button must have been pressed - so really quit.
	System.exit (0);
    }
    
} // End of class "NewFrame"


public class TestSwing22 {
    
    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }

}
