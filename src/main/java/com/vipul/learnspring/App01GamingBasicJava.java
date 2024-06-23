package com.vipul.learnspring;

import com.vipul.learnspring.game.GameRunner;
import com.vipul.learnspring.game.MarioGame;
import com.vipul.learnspring.game.PacmanGame;
import com.vipul.learnspring.game.SuperContraGame;

public class App01GamingBasicJava {
	
	public static void main(String[] args) {
		
		//Object creation
		var game = new MarioGame();
		//var game = new SuperContraGame();
		//var game = new PacmanGame();
		
		// Object creation & wiring of dependency(Here game i.e. GamingConsole is a dependency of GameRunner class)
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
