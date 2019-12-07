package Package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

	// instantiate UI object
	UI ui = new UI();  
	ChoiceHandler cHandler = new ChoiceHandler();
	// instantiate VisibilityManager object
	VisibilityManager vm = new VisibilityManager(ui); // send ui object to VisibiltyManager
	
	public static void main(String[] args) {
		
		
		new Game(); // start game

	}
	
	public Game() {
		
		// call createUI method inside UI class
		ui.createUI(cHandler); // send cHandler to UI class
		
		vm.showTitleScreen();
		
		
	}
	
	public class ChoiceHandler implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent event) {
			
			// get player choice
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			case "start": vm.titleToTown(); break; // go to game screen
			case "c1": break;
			case "c2": break;
			case "c3": break;
			case "c4": break;
			
			}
			
			
		}
	}

}
