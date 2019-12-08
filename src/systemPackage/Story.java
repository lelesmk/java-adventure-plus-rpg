package systemPackage;

import assetsPackage.WeaponKnife;
import assetsPackage.WeaponLongSword;

/* Narrative class */
public class Story {


	Game game;
	UI userInterface;
	VisibilityManager vManager;
	Player player1;


	/* constructor */
	public Story(Game g, UI ui, VisibilityManager vm, Player player) {

		game = g;
		userInterface = ui;
		vManager = vm;	
		player1 = player;

	}

	public void defaultPlayerSettings() {

		// Set and display health points
		player1.hp = 10;
		userInterface.hpNumberLabel.setText("" + player1.hp);

		// Set and display default weapon
		player1.currentWeapon = new WeaponKnife();
		userInterface.weaponNameLabel.setText("" + player1.currentWeapon.name);



	}

	// receive player position from ChoiceHandler inside Game class
	public void selectPosition(String nextPosition) {

		switch (nextPosition) {
		case "townGate": townGate(); break;
		case "talkGuard": talkGuard(); break; // call talkGuard method if player choice is c1 button
		case "attackGuard": attackGuard(); break; // call attackGuard method if player choice is c2 button
		case "crossRoad": crossRoad(); break; // call crossRoad method if player choice is c3 button
		case "north": north(); break;
		case "east": east(); break;
		case "west": west(); break;



		}

	}


	public void townGate() {

		// town gate narrative
		userInterface.mainTextArea.setText(""
				+ "You are at the gate of the town. "
				+ "\nA guard is standing in front of you. "
				+ "\n "
				+ "\n What do you do?");

		// set choice button text
		userInterface.choiceBtn1.setText("Talk to the guard");
		userInterface.choiceBtn2.setText("Attack the guard");
		userInterface.choiceBtn3.setText("Leave");
		userInterface.choiceBtn4.setText("");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "talkGuard";
		game.nextPosition2 = "attackGuard";
		game.nextPosition3 = "crossRoad";
		game.nextPosition4 = "";

	}

	// player action methods
	public void talkGuard() {

		// talkGuard narrative
		userInterface.mainTextArea.setText(""
				+ "Guard: Hello stranger. I have never seen your face before. "
				+ "\nI'm sorry but we cannot let a stranger enter our town.");

		// set choice button text
		userInterface.choiceBtn1.setText("continue >");
		userInterface.choiceBtn2.setText("");
		userInterface.choiceBtn3.setText("");
		userInterface.choiceBtn4.setText("");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "townGate";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";

	}

	public void attackGuard() {

		// talkGuard narrative
		userInterface.mainTextArea.setText(""
				+ "Guard: Don't be stupid! "
				+ "\n "
				+ "\nThe guard attacked you so hard you gave up."
				+ "\n"
				+ "\n(You receive 3 damage.)");

		// update player health points
		player1.hp = player1.hp - 3;
		userInterface.hpNumberLabel.setText("" + player1.hp);

		// set choice button text
		userInterface.choiceBtn1.setText("continue >");
		userInterface.choiceBtn2.setText("");
		userInterface.choiceBtn3.setText("");
		userInterface.choiceBtn4.setText("");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "townGate";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";


	}

	public void crossRoad() {

		// talkGuard narrative
		userInterface.mainTextArea.setText(""
				+ "You are a the crossroad."
				+ "\nIf you go south you will go back to the town.");

		// set choice button text
		userInterface.choiceBtn1.setText("Go north");
		userInterface.choiceBtn2.setText("Go east");
		userInterface.choiceBtn3.setText("Go south");
		userInterface.choiceBtn4.setText("Go west");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "north";
		game.nextPosition2 = "east";
		game.nextPosition3 = "townGate"; // if south go to townGate
		game.nextPosition4 = "west";


	}

	// north of town gate takes you to the river
	public void north() {

		// north route narrative
		userInterface.mainTextArea.setText(""
				+ "There is a river."
				+ "\nYou drink water and rest at the riverside."
				+ "\n"
				+ "\n(Your HP has recovered by 2.)");

		// update player health points
		player1.hp = player1.hp + 2;
		userInterface.hpNumberLabel.setText("" + player1.hp);

		// set choice button text
		userInterface.choiceBtn1.setText("Go south");
		userInterface.choiceBtn2.setText("");
		userInterface.choiceBtn3.setText("");
		userInterface.choiceBtn4.setText("");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "crossRoad"; // if south go to crossRoad
		game.nextPosition2 = "";
		game.nextPosition3 = ""; 
		game.nextPosition4 = "";


	}

	// east of town gate takes you through the forest to find long sword
	public void east() {

		// east route narrative
		userInterface.mainTextArea.setText(""
				+ "You walked into a forrest and found a Long Sword. "
				+ "\n"
				+ "\n(You obtained a Long Sword.)");

		// update player weapon
		player1.currentWeapon = new WeaponLongSword();
		userInterface.weaponNameLabel.setText("" + player1.currentWeapon.name);

		// set choice button text
		userInterface.choiceBtn1.setText("Go west");
		userInterface.choiceBtn2.setText("");
		userInterface.choiceBtn3.setText("");
		userInterface.choiceBtn4.setText("");

		/* set player positions when choice button is clicked 
		 * which is received in ChoiceHandler in Game class and
		 * sent to selectPosition method in Story class 
		 * which calls the appropriate player action method */
		game.nextPosition1 = "crossRoad"; // if west go back to crossRoad
		game.nextPosition2 = "";
		game.nextPosition3 = ""; 
		game.nextPosition4 = "";


	}

	// west of town gate you encounter a monster
	public void west() {

		

	}


}
