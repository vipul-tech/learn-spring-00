package com.vipul.learnspring;

import com.vipul.learnspring.game.GameRunner;
import com.vipul.learnspring.game.MarioGame;
import com.vipul.learnspring.game.PacmanGame;
import com.vipul.learnspring.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var game = new MarioGame();
		//var game = new SuperContraGame();
		//var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
