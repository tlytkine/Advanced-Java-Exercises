import java.awt.*;
import javax.swing.*;

public class TestSwing2 {

	public static void main (String[] argv)
	{

		JFrame f = new JFrame();

		f.setSize (200,100);

		f.setTitle ("A Test Window");

		Container cPane = f.getContentPane();

		cPane.setBackground (Color.cyan);
		f.setVisible (true);
	}
}