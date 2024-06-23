package com.vipul.learnspring.HelloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vipul.learnspring.HelloWorld.HelloWorldConfiguration.Address;
import com.vipul.learnspring.HelloWorld.HelloWorldConfiguration.Person;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a spring context using configuration file
		try(var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);) {
			
			//2. Configure the things that we want spring to manage 
			//HelloWorldConfiguration - @configuration
			//name -@Bean (in HelloWorldConfiguration class)
			
			//3. Retrieving beans managed by spring
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("person4Parameters"));
			System.out.println(context.getBean("person5Qualifier"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			
			
			//listing all beans that are managed by the spring container
			System.out.println();
			System.out.println("Listing all beans that are managed by the spring container....");
			System.out.println();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
