package com.bridgelabz.polymorphism.serviveImpl;

import com.bridgelabz.polymorphism.model.Movie;

/**
 * Super hero movie category and corresponding movie is hard coded.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Movie}
 */
public class SuperHeroMovie extends Movie {

	public SuperHeroMovie() {
		super("Doctor Strange");
	}

	@Override
	public String plot() {
		return "Super hero movie";
	}

}
