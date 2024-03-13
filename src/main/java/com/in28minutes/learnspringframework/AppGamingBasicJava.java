package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); // Object Creation
		var gameRunner = new GameRunner(game); // Object Creation + Wiring of Dependencies
			// game (GamingConsole) is a Dependency of GameRunner
			// so we are injecting a dependency in the creation of the object
		gameRunner.run();
	}

}
