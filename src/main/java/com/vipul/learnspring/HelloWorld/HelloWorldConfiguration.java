package com.vipul.learnspring.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
	
	record Person(String name, int age, Address address) { };
	record Address(String firstLine, String city) { };
	
	@Bean
	public String name() {
		return "Vipul";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Rohit Kumar", 25, new Address("Sarojini Nagar", "New Delhi"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		var person = new Person(name, age, address3);
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier")Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Primary
	@Bean(name = "address2")
	public Address address() {
		var address = new Address("Kurla Complex", "Mumbai");
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		var address = new Address("Bellandur", "Bengaluru");
		return address;
	}
	
}
