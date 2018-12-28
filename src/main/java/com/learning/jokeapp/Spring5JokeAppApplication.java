package com.learning.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class Spring5JokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokeAppApplication.class, args);
	}

}

