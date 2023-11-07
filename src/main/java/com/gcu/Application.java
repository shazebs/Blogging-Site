package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class simply starts our application.
 */
@SpringBootApplication
public class Application 
{	
	/**
	 * Application entry point.
	 * @param args commands to executes
	 */
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}
