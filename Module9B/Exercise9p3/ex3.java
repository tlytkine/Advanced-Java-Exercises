// File: ex3.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 14, 2000
//
// Template for Ex. 9.3 (Draw a chessboard that re-sizes).

import java.awt.*;
import javax.swing.*;

// Create a JPanel subclass to override paintComponent()

class NewPanel extends JPanel {

  public NewPanel ()
  {
    this.setBackground (Color.white);


  }

  // PUT YOUR CODE HERE
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      int width = this.getWidth();
      int height = this.getHeight();
      int dest = 0;
      if (width < height) {
        dest = width;
      }
      else {
        dest = height;
      }
      int x = (dest / 8);

        // Border Lines
        // Top
        g.drawLine (0,0,7*x,0);
        // Bottom
        g.drawLine (0,7*x,7*x,7*x);
        // Right
        g.drawLine (7*x,0,7*x,7*x);
        // Left
        g.drawLine (0,0,0,7*x);
         // Row 1
        g.drawRect (0,0,x,x);
        g.fillRect (x,0,x,x);
        g.drawRect (2*x,0,x,x);
        g.fillRect (3*x,0,x,x);
        g.drawRect (4*x,0,x,x);
        g.fillRect (5*x,0,x,x);
        g.drawRect (6*x,0,x,x);
        g.fillRect (7*x,0,x,x);
        // Row 2 
        g.fillRect (0,x,x,x);
        g.drawRect (x,x,x,x);
        g.fillRect (2*x,x,x,x);
        g.drawRect (3*x,x,x,x);
        g.fillRect (4*x,x,x,x);
        g.drawRect (5*x,x,x,x);
        g.fillRect (6*x,x,x,x);
        g.drawRect (7*x,x,x,x);
        // Row 3 
        g.drawRect (0,2*x,x,x);
        g.fillRect (x,2*x,x,x);
        g.drawRect (2*x,2*x,x,x);
        g.fillRect (3*x,2*x,x,x);
        g.drawRect (4*x,2*x,x,x);
        g.fillRect (5*x,2*x,x,x);
        g.drawRect (6*x,2*x,x,x);
        g.fillRect (7*x,2*x,x,x);
        // Row 4
        g.fillRect (0,3*x,x,x);
        g.drawRect (x,3*x,x,x);
        g.fillRect (2*x,3*x,x,x);
        g.drawRect (3*x,3*x,x,x);
        g.fillRect (4*x,3*x,x,x);
        g.drawRect (5*x,3*x,x,x);
        g.fillRect (6*x,3*x,x,x);
        g.drawRect (7*x,3*x,x,x);
        // Row 5
        g.drawRect (0,4*x,x,x);
        g.fillRect (x,4*x,x,x);
        g.drawRect (2*x,4*x,x,x);
        g.fillRect (3*x,4*x,x,x);
        g.drawRect (4*x,4*x,x,x);
        g.fillRect (5*x,4*x,x,x);
        g.drawRect (6*x,4*x,x,x);
        g.fillRect (7*x,4*x,x,x);
        // Row 6 
        g.fillRect (0,5*x,x,x);
        g.drawRect (x,5*x,x,x);
        g.fillRect (2*x,5*x,x,x);
        g.drawRect (3*x,5*x,x,x);
        g.fillRect (4*x,5*x,x,x);
        g.drawRect (5*x,5*x,x,x);
        g.fillRect (6*x,5*x,x,x);
        g.drawRect (7*x,5*x,x,x);
        // Row 7 
        g.drawRect (0,6*x,x,x);
        g.fillRect (x,6*x,x,x);
        g.drawRect (2*x,6*x,x,x);
        g.fillRect (3*x,6*x,x,x);
        g.drawRect (4*x,6*x,x,x);
        g.fillRect (5*x,6*x,x,x);
        g.drawRect (6*x,6*x,x,x);
        g.fillRect (7*x,6*x,x,x);
        // Row 8
        g.fillRect (0,7*x,x,x);
        g.drawRect (x,7*x,x,x);
        g.fillRect (2*x,7*x,x,x);
        g.drawRect (3*x,7*x,x,x);
        g.fillRect (4*x,7*x,x,x);
        g.drawRect (5*x,7*x,x,x);
        g.fillRect (6*x,7*x,x,x);
        g.drawRect (7*x,7*x,x,x);


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

public class ex3 {

  public static void main (String[] argv)
  {
    NewFrame f = new NewFrame (600, 600);
  }

}
