/**
 * 
 */
package com.learning.jokeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
@Service
public class JokeServiceImpl implements JokeService{

	ChuckNorrisQuotes quotes;
	
	@Autowired
	public JokeServiceImpl(ChuckNorrisQuotes quotes) {
		super();
		this.quotes = quotes;
	}



	@Override
	public String getRandomJoke() {
		return quotes.getRandomQuote();
	}

}
