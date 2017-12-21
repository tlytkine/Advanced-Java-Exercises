// File: TestSwing12.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Using FontMetrics.

import java.awt.*;
import javax.swing.*;

// Extend JPanel to override paintComponent ()
class NewPanel extends JPanel {

    String[] words; // List of words to display.
    int fontsize;   // Size of font.
    
    public NewPanel (String[] words, int fontsize)
    {
	// Retain data and font size.
	this.words = words;
	this.fontsize = fontsize;
	
	this.setBackground (Color.cyan);
    }
    
    public void paintComponent (Graphics g)
    {
	super.paintComponent (g);
	// Create a Serif font in the given font size.
	Font f = new Font ("Serif", Font.PLAIN | Font.BOLD, fontsize);    
	g.setFont (f);
	
	// Get a FontMetrics instance from the graphics context.
	FontMetrics fm = g.getFontMetrics();
	
	// Get the height (height of font plus separator).
	int fontheight = fm.getHeight ();
	
	// Size of frame plus insets.
	Dimension D = this.getSize ();
	
	// Visible drawing area
	int max_width = D.width;
	int max_height = D.height;
	
	// Start at topleft.
	int startx = 0;
	
	// Must add font height since bottom left corner 
	// of font is used as starting point.
	int y = 0 + fontheight;
	
	int x = startx;
	for (int i=0; i < words.length; i++) {
	    
	    // Obtain pixel-length of string (with blank)
	    int len = fm.stringWidth (" " + words[i]);
	    
	    if (x + len < max_width) {
		// If it fits within the current line, draw it
		g.drawString (" " + words[i], x, y);
		x += len;
	    }
	    else {
		// Go to next line.
		x = startx;
		y += fontheight;
		g.drawString (" " + words[i], x, y);
		x += len;
	    }
	}

    }
  
} // End of NewPanel

class NewFrame extends JFrame {

    // Constructor.
    public NewFrame (int width, int height, String[] words, int fontsize)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Font metrics");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel (words, fontsize);
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"

public class TestSwing12 {

    public static void main (String[] argv)
    {
	String[] testwords = {
	    //"There", "once", "was", "a", "poet", "named", "Heinz",
	    //"All", "of", "whose", "poems", "had", "just", "two", "lines."
	    "What", "inspired", "this", "little", "rhyme?",
	    "A", "shot", "of", "gin", "and", "a", "dash", "of", "lime"
	};
	NewFrame nf = new NewFrame (500, 200, testwords, 35);
    }
    
}
