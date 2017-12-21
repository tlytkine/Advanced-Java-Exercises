// File: TestSwing24.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 2000
//
// Handling mouse clicks in the JPanel

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListener.

class NewPanel extends JPanel implements MouseListener {

    public NewPanel ()
    {
	this.setBackground (Color.cyan);
    }
    
    // These methods are required to implement 
    // the MouseListener interface.
    int currentX=0, currentY=0;
    public void mouseClicked (MouseEvent m)
    {
	System.out.println ("mouseClicked event: " + m.paramString());
	int x = m.getX();
	int y = m.getY();
	Graphics g = this.getGraphics();
	g.drawLine (currentX, currentY, x, y);
	currentX = x;
	currentY = y;
    }
    
    // We need to implement these methods, but
    // don't actually have to do anything inside.
    public void mouseEntered (MouseEvent m) {}
    public void mouseExited (MouseEvent m) {}
    public void mousePressed (MouseEvent m) {}
    public void mouseReleased (MouseEvent m) {}
    
}


class NewFrame extends JFrame 
    implements ActionListener {

    NewPanel panel;
    
    // Constructor.
    public NewFrame (int width, int height)
    {
	// Set the title and other frame parameters.
	this.setTitle ("Button example");
	this.setResizable (true);
	this.setSize (width, height);
	
	Container cPane = this.getContentPane();
	// cPane.setLayout (new BorderLayout());    
	
	// The panel for drawing.
	panel = new NewPanel ();
	cPane.add (panel, BorderLayout.CENTER);
	
	// Add panel's mouse-listening to panel.
	panel.addMouseListener (panel);
	
	// Create a quit button.
	JButton b = new JButton ("Quit");
	b.setBackground (Color.red);
	b.setFont (new Font ("Serif", Font.PLAIN | Font.BOLD, 15));
	b.addActionListener (this);
	cPane.add (b, BorderLayout.SOUTH);
	
	// Show the frame.
	this.setVisible (true);
    }

    // This method is required to implement the 
    // ActionListener interface.
    public void actionPerformed (ActionEvent a)
    {
	// Button must have been pressed - so really quit.
	System.exit (0);
    }

} // End of class "NewFrame"


public class TestSwing24 {

    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (300, 200);
    }

}

