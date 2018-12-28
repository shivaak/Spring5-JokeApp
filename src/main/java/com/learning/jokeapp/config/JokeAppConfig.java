/**
 * 
 */
package com.learning.jokeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author shivaak on 28-Dec-2018
 *
 */

@Configuration
public class JokeAppConfig {
	
	@Bean
	public ChuckNorrisQuotes initChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

	
}
