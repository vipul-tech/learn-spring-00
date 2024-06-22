package com.vipul.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vipul.learnspring.game.GameRunner;
import com.vipul.learnspring.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class);){
		
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
