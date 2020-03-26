package com.bridgelabz.polymorphism.serviveImpl;

import com.bridgelabz.polymorphism.model.Movie;

/**
 * Comedy movie category and corresponding movie is hard coded.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Movie}
 */
public class ComedyMovie extends Movie {

	public ComedyMovie() {
		super("Dhammal");
	}

	@Override
	public String plot() {
		return "Comedy Movie";
	}

}
