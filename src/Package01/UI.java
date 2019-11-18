package Package01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI {
	
	/* Declare Window fields */
	JFrame window;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	JButton startButton;
	
	
	
	public void createUI() {
		
		/* Create Window */
		window = new JFrame(); // instantiate window
		
		// window format
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window button
		
		// content style
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null); // switch off default style
		window.setVisible(true); // show window
		
	}

}
