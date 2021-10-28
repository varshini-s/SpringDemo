package com.bridgelabz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		System.out.print("Helloo from bridgelbz"); 
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
