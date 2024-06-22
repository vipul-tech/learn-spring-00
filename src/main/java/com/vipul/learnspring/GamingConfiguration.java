package com.vipul.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vipul.learnspring.game.GamingConsole;
import com.vipul.learnspring.game.GameRunner;
import com.vipul.learnspring.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner GameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
