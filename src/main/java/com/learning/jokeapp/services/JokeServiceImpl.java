/**
 * 
 */
package com.learning.jokeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
@Service
public class JokeServiceImpl implements JokeService{

	ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Autowired
	public JokeServiceImpl(@Qualifier("chuckNorrisQuotesConfigBean")ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}



	@Override
	public String getRandomJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
