// File: ex2.java (Module 9b)
//
// Template for Ex. 9.2 (Draw a chessboard).

import java.awt.*;
import javax.swing.*;

// Create a JPanel subclass to override paintComponent()

class NewPanel extends JPanel {

    public NewPanel ()
    {
	this.setBackground (Color.cyan);
    }
    
    // PUT YOUR CODE HERE
    public void paintComponent(Graphics g){
        super.paintComponent (g);
        // Row 1
        g.drawRect (0,0,30,30);
        g.fillRect (30,0,30,30);
        g.drawRect (60,0,30,30);
        g.fillRect (90,0,30,30);
        g.drawRect (120,0,30,30);
        g.fillRect (150,0,30,30);
        g.drawRect (180,0,30,30);
        g.fillRect (210,0,30,30);
        // Row 2 
        g.fillRect (0,30,30,30);
        g.drawRect (30,30,30,30);
        g.fillRect (60,30,30,30);
        g.drawRect (90,30,30,30);
        g.fillRect (120,30,30,30);
        g.drawRect (150,30,30,30);
        g.fillRect (180,30,30,30);
        g.drawRect (210,30,30,30);
        // Row 3 
        g.drawRect (0,60,30,30);
        g.fillRect (30,60,30,30);
        g.drawRect (60,60,30,30);
        g.fillRect (90,60,30,30);
        g.drawRect (120,60,30,30);
        g.fillRect (150,60,30,30);
        g.drawRect (180,60,30,30);
        g.fillRect (210,60,30,30);
        // Row 4
        g.fillRect (0,90,30,30);
        g.drawRect (30,90,30,30);
        g.fillRect (60,90,30,30);
        g.drawRect (90,90,30,30);
        g.fillRect (120,90,30,30);
        g.drawRect (150,90,30,30);
        g.fillRect (180,90,30,30);
        g.drawRect (210,90,30,30);
        // Row 5
        g.drawRect (0,120,30,30);
        g.fillRect (30,120,30,30);
        g.drawRect (60,120,30,30);
        g.fillRect (90,120,30,30);
        g.drawRect (120,120,30,30);
        g.fillRect (150,120,30,30);
        g.drawRect (180,120,30,30);
        g.fillRect (210,120,30,30);
        // Row 6 
        g.fillRect (0,150,30,30);
        g.drawRect (30,150,30,30);
        g.fillRect (60,150,30,30);
        g.drawRect (90,150,30,30);
        g.fillRect (120,150,30,30);
        g.drawRect (150,150,30,30);
        g.fillRect (180,150,30,30);
        g.drawRect (210,150,30,30);
        // Row 7 
        g.drawRect (0,180,30,30);
        g.fillRect (30,180,30,30);
        g.drawRect (60,180,30,30);
        g.fillRect (90,180,30,30);
        g.drawRect (120,180,30,30);
        g.fillRect (150,180,30,30);
        g.drawRect (180,180,30,30);
        g.fillRect (210,180,30,30);
        // Row 8
        g.fillRect (0,210,30,30);
        g.drawRect (30,210,30,30);
        g.fillRect (60,210,30,30);
        g.drawRect (90,210,30,30);
        g.fillRect (120,210,30,30);
        g.drawRect (150,210,30,30);
        g.fillRect (180,210,30,30);
        g.drawRect (210,210,30,30);




       

    }
    
}


class NewFrame extends JFrame {
    
    // Constructors.
    public NewFrame (int width, int height)
    {
	// Set the title and other parameters.
	this.setTitle ("Chessboard");
	this.setResizable (true);
	this.setSize (width, height);
	
	// Create panel and add it.
	this.getContentPane().add (new NewPanel());
	
	// Show the frame.
	this.setVisible (true);
    }
    
    // No-parameter constructor - use a default size.
    public NewFrame ()
    {
	this (500, 300);
    }
    
}

public class ex2 {

    public static void main (String[] argv)
    {
	NewFrame f = new NewFrame (500, 300);
    }
    
}
