package systemPackage;

/* Handle the transition from Title Screen to Game Screen*/
public class VisibilityManager {
	UI userInterface;

	// constructor
	public VisibilityManager(UI ui) { // accept ui object from Game class to access UI class methods
		
		userInterface = ui;
	}
	
	/* 1. Display title screen and start button 
	 * 2. Hide game screen and choice buttons 
	 * */
	
	// display title screen
	public void showTitleScreen() {
		
		// Show the title screen
		userInterface.titleNamePanel.setVisible(true);
		userInterface.startButtonPanel.setVisible(true);
		
		// Hide the game screen
		userInterface.mainTextPanel.setVisible(false);
		userInterface.choiceButtonPanel.setVisible(false);
		userInterface.playerPanel.setVisible(false);
		
	}
	
	// display game screen
	public void titleToTown() {

		// Hide the title screen
		userInterface.titleNamePanel.setVisible(false);
		userInterface.startButtonPanel.setVisible(false);

		// Show the game screen
		userInterface.mainTextPanel.setVisible(true);
		userInterface.choiceButtonPanel.setVisible(true);
		userInterface.playerPanel.setVisible(true);

	}
	
}
