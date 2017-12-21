// File: ex1.java (Module 9b)
//
// Template for Ex 9.1 (Obtain the screen resolution etc).

import java.awt.*;
import javax.swing.*;

public class ex1 {

    public static void main (String[] argv)
    {
	// Get a Toolkit instance.
	Toolkit tk = Toolkit.getDefaultToolkit ();
	
	// Get resolution in pixels per inch.
	int pixelsPerInch = tk.getScreenResolution ();
	
	// Screen dimensions can also be obtained in a Dimension instance.
	Dimension screenSize = tk.getScreenSize ();
	
	// Print out results.
	System.out.println ("Resolution: " + pixelsPerInch);
	System.out.println ("Size (pixels): Height=" + screenSize.height +
			    ", Width=" + screenSize.width);
	
	// Add your stuff here:

	int widthWindow = pixelsPerInch * 3;

	int heightWindow = pixelsPerInch * 2;

	JFrame f = new JFrame();

	f.setSize (widthWindow,heightWindow);

	f.setTitle("3 inches wide, 2 inches in height");
	
	// Center of screen
	f.setLocation(screenSize.width/2-f.getSize().width/2,
		screenSize.height/2-f.getSize().height/2);

	f.setVisible(true);




    }

}
