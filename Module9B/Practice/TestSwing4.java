import java.awt.*;
import javax.swing.*;

class NewPanel extends JPanel {

	public NewPanel ()
	{
		this.setBackground (Color.cyan);
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		g.drawString("Hello World!",100,100);

		System.out.println (" Inside paintComponent");

	}
}

public class TestSwing4 {

	public static void main (String[] argv)
	{
		JFrame f = new JFrame();

		f.setTitle ("Hello World Test");
		f.setResizable(true);
		f.setSize(500,300);

		NewPanel panel = new NewPanel ();
		Container cPane = f.getContentPane ();
		cPane.add(panel);

		f.setVisible(true);
	}
}