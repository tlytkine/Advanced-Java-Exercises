// File: ex6.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 13, 2000
//
// Template for Ex. 9.6 - getting image sizes.

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

    // INSERT YOUR CODE HERE
    // Create frame in which you load the four image 
    // fit all four images side by side so each image is the same size 
    // 

    Dimension D = this.getSize();
    int max_width = D.width;
    int max_height = D.height;
    Toolkit tk = Toolkit.getDefaultToolkit ();  // Toolkit instance 

    try {
    URL p1 = new URL ("http://www2.seas.gwu.edu/~simhaweb/java/person1.jpg");
    Image person1 = tk.getImage (p1);

    URL p2 = new URL ("http://www2.seas.gwu.edu/~simhaweb/java/person2.jpg"); 
    Image person2 = tk.getImage (p2);

    URL p3 = new URL ("http://www2.seas.gwu.edu/~simhaweb/java/person3.jpg"); 
    Image person3 = tk.getImage (p3);

    URL p4 = new URL ("http://www2.seas.gwu.edu/~simhaweb/java/person4.jpg"); 
    Image person4 = tk.getImage (p4);

    MediaTracker mt = new MediaTracker (this);
    mt.addImage (person1, 1);
    mt.addImage (person2, 2);
    mt.addImage (person3, 3);
    mt.addImage (person4, 4);

    this.setCursor (Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    try {
    mt.waitForID (1);
    mt.waitForID (2);
    mt.waitForID (3);
    mt.waitForID (4);
      }
    catch (InterruptedException e) {
    System.out.println (e);
    }
    this.setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    /*int width_p1 = person1.getWidth(this);
    int height_p1 = person1.getHeight(this);
    int width_p2  = person2.getWidth(this);
    int height_p2 = person2.getHeight(this);
    int width_p3 = person3.getWidth(this);
    int height_p3 = person3.getHeight(this);
    int width_p4 = person4.getWidth(this);
    int height_p4 = person4.getHeight(this);
    */
    int w2 = max_width / 2;
    int h2 = max_height / 2;

    g.drawImage (person1, 0, 0, w2, h2, this);
    g.drawImage (person2, w2, 0, w2, h2, this);
    g.drawImage (person3, 0, h2, w2, h2, this);
    g.drawImage (person4, w2, h2, w2, h2, this);
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
    this.setTitle ("Exercise 9.6");
    this.setResizable (true);
    this.setSize (width, height);

    // Create and add the panel.
    NewPanel panel = new NewPanel ();
    this.getContentPane().add (panel);

    // Show the frame.
    this.setVisible (true);
  }


} // End of class "NewFrame"

public class ex6 {

  public static void main (String[] argv)
  {
    NewFrame nf = new NewFrame (300, 200);
  }

}
