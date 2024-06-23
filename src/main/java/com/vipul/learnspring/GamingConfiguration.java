package com.vipul.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vipul.learnspring.game.GamingConsole;
import com.vipul.learnspring.game.GameRunner;
import com.vipul.learnspring.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	//Object creation by us that is managed by spring i.e here game() is spring bean
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	// Object creation by us that is managed by spring i.e here gameRunner() is spring bean & wiring of dependency(GamingConsole is a dependency of GameRunner class)
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
