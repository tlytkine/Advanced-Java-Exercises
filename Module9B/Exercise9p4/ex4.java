// File: ex4.java (Module 9)
//
// Template for Ex. 9.4: 

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
	
	// INSERT YOUR CODE HERE.
	int fontsize = 10;
	Font f = new Font ("Serif", Font.PLAIN, fontsize);
	g.setFont (f);
	FontMetrics fm = g.getFontMetrics();
	int string_width = fm.stringWidth("Hello World!");
	int fontheight = fm.getHeight ();
	Dimension D  = this.getSize ();
	int max_width = D.width;
	int max_height = D.height;
	while(string_width<max_width){
		if(fontheight < max_height){
			fontsize++;
			f = new Font ("Serif", Font.PLAIN, fontsize);
			g.setFont (f);
			fm = g.getFontMetrics();
			string_width = fm.stringWidth("Hello World!");
			fontheight = fm.getHeight ();
		}
	}
	g.drawString("Hello World!",0,fontsize);
}
}


class NewFrame extends JFrame {
    
    // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Exercise 9.4");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create and add the panel.
	NewPanel panel = new NewPanel ();
	this.getContentPane().add (panel);
	
	// Show the frame.
	this.setVisible (true);
    }
    
} // End of class "NewFrame"


public class ex4 {
    
    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (600, 200);
    }
    
}

