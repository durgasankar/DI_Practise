package com.bridgelabz.polymorphism.serviveImpl;

import com.bridgelabz.polymorphism.model.Movie;

/**
 * Comic action movie category and corresponding movie is hard coded.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Movie}
 */
public class ComicActionMovie extends Movie {

	public ComicActionMovie() {
		super("Pirates of Carribian");
	}

	@Override
	public String plot() {
		return "Comic action movie";
	}

}
