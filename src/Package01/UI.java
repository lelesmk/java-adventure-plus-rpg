package Package01;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Package01.Game.ChoiceHandler;

public class UI {
	
	/* Declare Window fields */
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
	JButton startButton, choiceBtn1, choiceBtn2, choiceBtn3, choiceBtn4;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font mainFont = new Font("Times New Roman", Font.PLAIN, 30);
	Font buttonFont = new Font("Times New Roman", Font.PLAIN, 25);
		
	
	public void createUI(ChoiceHandler cHandler) { // accept cHandler from Game class
		
		/* APPLICATION WINDOW */
		window = new JFrame(); // instantiate window
		// window size
		window.setSize(800, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window button
		// content style
		window.getContentPane().setBackground(Color.black);;
		window.setLayout(null); // switch off default style
		
		
		/* TITLE SCREEN */
		titleNamePanel = new JPanel();
		// screen position and size
		titleNamePanel.setBounds(100, 100, 600, 500);
		// content style
		titleNamePanel.setBackground(Color.blue);
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		// start button
		startButtonPanel = new JPanel();
		// button position and size
		startButtonPanel.setBounds(300, 400, 200, 100);
		// button style
		startButtonPanel.setBackground(Color.blue);
		startButton = new JButton("START");
		startButton.setBackground(Color.red);
		startButton.setForeground(Color.blue);
		startButton.setFont(buttonFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(cHandler); // use action listener choice handler
		startButton.setActionCommand("start");
		startButtonPanel.add(startButton);
		
		// assemble title screen
		window.add(titleNamePanel);
		window.add(startButtonPanel);
		
		/* GAME SCREEN */
		
		// main text panel

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);
		
		// main text area
		mainTextArea = new JTextArea("This is the main text area.");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(mainFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);
		
		// choice buttons panel
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250,350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4, 1));
		window.add(choiceButtonPanel); 
		
		
		// choice buttons
		choiceBtn1 = new JButton("Choice 1");
		choiceBtn1.setBackground(Color.black);
		choiceBtn1.setForeground(Color.black);
		choiceBtn1.setFont(buttonFont);
		choiceBtn1.setFocusPainted(false);
		choiceBtn1.addActionListener(cHandler); // use action listener choice handler
		choiceBtn1.setActionCommand("c1");
		choiceButtonPanel.add(choiceBtn1);
		
		choiceBtn2 = new JButton("Choice 2");
		choiceBtn2.setBackground(Color.black);
		choiceBtn2.setForeground(Color.black);
		choiceBtn2.setFont(buttonFont);
		choiceBtn2.setFocusPainted(false);
		choiceBtn2.addActionListener(cHandler); // use action listener choice handler
		choiceBtn2.setActionCommand("c2");
		choiceButtonPanel.add(choiceBtn2);
		
		choiceBtn3 = new JButton("Choice 3");
		choiceBtn3.setBackground(Color.black);
		choiceBtn3.setForeground(Color.black);
		choiceBtn3.setFont(buttonFont);
		choiceBtn3.setFocusPainted(false);
		choiceBtn3.addActionListener(cHandler); // use action listener choice handler
		choiceBtn3.setActionCommand("c3");
		choiceButtonPanel.add(choiceBtn3);
		
		choiceBtn4 = new JButton("Choice 4");
		choiceBtn4.setBackground(Color.black);
		choiceBtn4.setForeground(Color.black);
		choiceBtn4.setFont(buttonFont);
		choiceBtn4.setFocusPainted(false);
		choiceBtn4.addActionListener(cHandler); // use action listener choice handler
		choiceBtn4.setActionCommand("c4");
		choiceButtonPanel.add(choiceBtn4);
		
		// player panel
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1, 4));
		window.add(playerPanel);
		
		// player info
		hpLabel = new JLabel("HP: ");
		hpLabel.setFont(mainFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpNumberLabel = new JLabel();
		hpNumberLabel.setFont(mainFont);
		hpNumberLabel.setForeground(Color.white);
		playerPanel.add(hpNumberLabel);
		
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setFont(mainFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		
		weaponNameLabel = new JLabel();
		weaponNameLabel.setFont(mainFont);
		weaponNameLabel.setForeground(Color.white);
		playerPanel.add(weaponNameLabel);
		
		// display window
		window.setVisible(true);

		
		
	}

}
