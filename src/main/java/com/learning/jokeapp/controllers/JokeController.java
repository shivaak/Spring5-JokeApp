/**
 * 
 */
package com.learning.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learning.jokeapp.services.JokeService;

/**
 * @author shivaak on 27-Dec-2018
 *
 */
@Controller
public class JokeController {
	
	JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping(value= {"/",""}, method=RequestMethod.GET)
	public String loadJoke(Model model) {
		model.addAttribute("joke", jokeService.getRandomJoke());
		return "chucknorris";
	}
}
