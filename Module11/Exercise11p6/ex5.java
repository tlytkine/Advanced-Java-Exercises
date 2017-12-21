
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;


class NewFrame extends JFrame {

    // Data.
    JPanel centerpanel;         // For the questions.
    JScrollPane sc;             // For placing the centerpanel.

    JTextField lastnameTextF;   // To get the lastname.
    String lastname;

    JTextField firstnameTextF;  // Firstname.
    String firstname;

    JTextField networthTextF;   // Net worth
    String networth;

    JTextArea addressTextA;     // Address (TextArea)
    String address;

    JMenuBar mb;                // The menubar.


    // Constructor.
    public NewFrame (int width, int height)
    {
	this.setTitle ("Snoot Club Membership Form");
	this.setResizable (true);
	this.setSize (width, height);

	Container cPane = this.getContentPane();
	// cPane.setLayout (new BorderLayout());

	// First, a welcome message:
	JLabel L = new JLabel ("Please fill out the following membership form:");
	L.setFont (new Font ("Serif", Font.BOLD | Font.ITALIC, 15));
	L.setForeground (Color.blue);
	cPane.add (L, BorderLayout.NORTH);

	// Now the center panel.
	centerpanel = new JPanel ();
	centerpanel.setLayout (new GridLayout (4,1));

	// Each widget is created in a separate method.
	centerpanel.add ( firstName() );
	centerpanel.add ( lastName() );
	centerpanel.add ( netWorth() );
	centerpanel.add ( address () );

	// Next, the scrollpane to contain the main panel.
	sc = new JScrollPane (centerpanel);
	cPane.add (sc, BorderLayout.CENTER);

	// Create a menubar and add two menus.
	mb = new JMenuBar ();
	mb.add ( makeFileMenu() );
	mb.add ( makeActionMenu() );


	// ADD A HELP MENU TO THE MENU BAR HERE.
	// CREATE THE ACTUAL MENU IN A SEPARATE METHOD.
	mb.add( makeHelpMenu() );


	// Note how a menubar is added to a Frame.
	this.setJMenuBar (mb);

	// Finally, show the frame.
	this.setVisible (true);
    }




    // No-parameter constructor.
    public NewFrame () 
    {
	this (500, 300);
    }


    // Read in the first name.

    JPanel firstName ()
    {
	JPanel subpanel = new JPanel ();

	// First, a label before the textfield.
	JLabel L = new JLabel ("First Name");
	L.setFont (new Font ("SansSerif", Font.ITALIC, 20));
	subpanel.add (L);

	// Create and add the textfield.
	firstnameTextF = new JTextField (20);
	firstnameTextF.setForeground (Color.blue);
	subpanel.add (firstnameTextF);

	return subpanel;
    }


    // Get last name.

    JPanel lastName ()
    {
	JPanel subpanel = new JPanel ();

	// The "last name" label.
	JLabel L = new JLabel ("Last Name");
	L.setFont (new Font ("SansSerif", Font.ITALIC, 20));
	subpanel.add (L);

	lastnameTextF = new JTextField (20);
	lastnameTextF.setForeground (Color.blue);
	subpanel.add (lastnameTextF);

	return subpanel;
    }


    // Get net worth.

    JPanel netWorth ()
    {
	JPanel subpanel = new JPanel ();

	JLabel L = new JLabel ("Net worth (in millions)");
	L.setFont (new Font ("SansSerif", Font.ITALIC, 20));
	subpanel.add (L);

	networthTextF = new JTextField (10);
	networthTextF.setForeground (Color.blue);
	subpanel.add (networthTextF);

	return subpanel;
    }


    // Get address via a TextArea.

    JPanel address ()
    {
	JPanel subpanel = new JPanel ();

	JLabel L = new JLabel ("Address");
	L.setFont (new Font ("SansSerif", Font.ITALIC, 20));
	subpanel.add (L);

	addressTextA = new JTextArea (4, 30);
	addressTextA.setForeground (Color.blue);
	subpanel.add (addressTextA);

	return subpanel;
    }

    // Create the File menu and associated listeners.

    JMenu makeFileMenu ()
    {


	// Add a "File" menu with two items.
	JMenu fileMenu = new JMenu ("File");

	// "Load From File" menu item
	JMenuItem loadFromFileMenuItem = new JMenuItem ("Load From File");
	loadFromFileMenuItem.addActionListener (
 	    new ActionListener () {
		public void actionPerformed (ActionEvent a)
		{
		    loadFromFile ();
		}  
	    }
	);
	fileMenu.add (loadFromFileMenuItem);

	// "Quit" menu item
	JMenuItem quitMenuItem = new JMenuItem ("Quit");
	quitMenuItem.addActionListener (
	    new ActionListener () {
		public void actionPerformed (ActionEvent a)
		{
		    System.exit (0);
		}  
	    }
	);
	fileMenu.add (quitMenuItem);

	return fileMenu;
    }

    JMenu makeHelpMenu ()
    {
  	
  	JMenu helpMenu = new JMenu ("Help");


  	JMenuItem aboutMenuItem = new JMenuItem("About");
  	aboutMenuItem.addActionListener (
  		new ActionListener () {
  			public void actionPerformed (ActionEvent a)
  			{
  				about();
  			}
  			}
			);

  	helpMenu.add(aboutMenuItem);
  	JMenuItem helpMenuItem = new JMenuItem("Help");
  	helpMenuItem.addActionListener (
  		new ActionListener () {
  			public void actionPerformed (ActionEvent a)
  			{
  				help();
  			}
  			}
  			);
  		helpMenu.add(helpMenuItem);




  		return helpMenu;
  	}


    // Create the Action Menu and its listeners.

    JMenu makeActionMenu ()
    {
	// Add an "Action" menu with two items.
	JMenu actionMenu = new JMenu ("Action");

	// "Submit" menu item
	JMenuItem submitMenuItem = new JMenuItem ("Submit");
	submitMenuItem.addActionListener (
	    new ActionListener () {
		public void actionPerformed (ActionEvent a)
		{
		    submit ();
		}  
	    }
        );
	actionMenu.add (submitMenuItem);

	// "Clear" menu item
	JMenuItem clearMenuItem = new JMenuItem ("Clear");
	clearMenuItem.addActionListener (
	    new ActionListener () {
		public void actionPerformed (ActionEvent a)
		{
		    // Clear all the fields.
		    firstname = "";  firstnameTextF.setText (firstname);
		    lastname = "";  lastnameTextF.setText (lastname);
		    networth = "";  networthTextF.setText (networth);
		    address = "";  addressTextA.setText (address);
		}  
	    }
        );
	actionMenu.add (clearMenuItem);

	return actionMenu;
    }


    // Process data when ready.

    void submit ()
    {
	// Retrieve data from the widgets.
	lastname = lastnameTextF.getText();
	firstname = firstnameTextF.getText();
	networth = networthTextF.getText();
	address = addressTextA.getText();

	// Create a file by concatenating firstname and lastname.
	String filename = firstname + lastname;
	if (filename.length() == 0) return;

	// We will use a "Properties" instance to store data.
	Properties p = new Properties ();
	p.put ("firstname", firstname);
	p.put ("lastname", lastname);
	p.put ("networth", networth);
	p.put ("address", address);

	// Use the "save" feature of the Properties instance.
	try {
	    FileOutputStream f = new FileOutputStream (filename);
	    p.store (f, "Member information");
	}
	catch (IOException e) {
	    System.out.println (e);
	    System.exit (0);
	}
    }


    // Load information from an existing Properties file.

    Properties info;


    void loadFromFile ()
    {
	System.out.println ("Load From File");
    }

    void about ()
    {

    	JOptionPane.showMessageDialog(this, "Version: 1.0\n Copyright 2017 ", "About", JOptionPane.INFORMATION_MESSAGE);

    }

    void help()

    {
    	JFrame newHelp = new JFrame("Help?");
    	newHelp.setTitle("You want help?");
    	newHelp.setSize(200,200);
    	Container helpPane = newHelp.getContentPane();

    	helpPane.setLayout(new BorderLayout());

    	JLabel nah = new JLabel("Nahhhh");
    	helpPane.add(nah,BorderLayout.NORTH);

    	JButton peace = new JButton("Quit");

    
    		peace.addActionListener (
            new ActionListener () {
		public void actionPerformed (ActionEvent a)
		{
			System.exit (0);
		}  
	    }
        );

    	helpPane.add(peace,BorderLayout.SOUTH);

    	newHelp.setVisible(true);

    }

}


public class ex5 {
    public static void main (String[] argv)
    {
	NewFrame nf = new NewFrame (500, 200);
    }
}
