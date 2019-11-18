package Package01;

public class Game {

	UI ui = new UI(); // instantiate UI object 
	
	public static void main(String[] args) {
		
		
		new Game(); // start game

	}
	
	public Game() {
		
		ui.createUI(); // call createUI method of the UI Class to create window
		
	}

}
