// File: TestSwing21.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 2000
//
// Flowlayout example.

import java.awt.*;
import javax.swing.*;

class NewFrame extends JFrame {

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
	
	// Extract the contentPane because we'll 
	// need to refer to it a couple of times.
	Container cPane = this.getContentPane();
	
	// Create a Button instance and pass the button 
	// label as a parameter to the constructor.
	JButton b = new JButton ("Quit");
	b.setBackground (Color.cyan);
	
	// Set the layout manager for our Frame.
	cPane.setLayout (new FlowLayout());
	
	// Add five buttons at the different locations:
	JButton b1 = new JButton ("South Quit");
	b1.setBackground (Color.cyan);
	b1.setForeground (Color.magenta);
	cPane.add (b1);
	
	JButton b2 = new JButton ();
	b2.setBackground (Color.red);
	b2.setFont (new Font ("Serif", Font.PLAIN, 15));
	b2.setText ("North Quit");
	cPane.add (b2);
	
	JButton b3 = new JButton ("<html> East <p> Quit </html>");
	b3.setBackground (Color.blue);
	cPane.add (b3);
	
	JButton b4 = new JButton ("West");
	b4.setBackground (Color.green);
	cPane.add (b4);
	
	JButton b5 = new JButton ("CENTER");
	b5.setBackground (Color.yellow);
	cPane.add (b5);
	
	// Show the frame.
	this.setVisible (true);
    }

} // End of class "NewFrame"


public class TestSwing21 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }
    
}
