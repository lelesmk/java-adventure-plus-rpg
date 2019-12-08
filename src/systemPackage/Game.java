package systemPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

	// instantiate UI class
	UI ui = new UI();  
	
	ChoiceHandler cHandler = new ChoiceHandler();
	
	// instantiate VisibilityManager class
	VisibilityManager vm = new VisibilityManager(ui); // send ui object to VisibiltyManager
	
	// instantiate Player class
	Player player = new Player();

	// send Game class, UI class, VisibilityManager class to Story class
	Story story = new Story(this, ui, vm, player);
	
	// declare player positions
	public String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	
	
	
	public static void main(String[] args) {
		
		
		new Game(); // start game

	}
	
	public Game() {
		
		// call createUI method inside UI class
		ui.createUI(cHandler); // send cHandler to UI class
		
		// default setup
		story.defaultPlayerSettings();
		
		// go to title screen
		vm.showTitleScreen();
				
		
		
	}
	
	public class ChoiceHandler implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent event) {
			
			// get player choice
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			/* click start from title screen to the town gate 
			 * read town gate narrative where the story begins */
			case "start": vm.titleToTown(); story.townGate(); break;
			/*  */
			case "c1": story.selectPosition(nextPosition1); break;
			case "c2": story.selectPosition(nextPosition2); break;
			case "c3": story.selectPosition(nextPosition3); break;
			case "c4": story.selectPosition(nextPosition4); break;
			
			}
			
			
		}
	}

}
