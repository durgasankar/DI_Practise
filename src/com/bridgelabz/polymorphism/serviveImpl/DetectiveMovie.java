package com.bridgelabz.polymorphism.serviveImpl;

import com.bridgelabz.polymorphism.model.Movie;

/**
 * Detective movie category and corresponding movie is hard coded.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Movie}
 */
public class DetectiveMovie extends Movie {

	public DetectiveMovie() {
		super("Sherlock Holmes");
	}

	@Override
	public String plot() {
		return "Detective Movie";
	}

}
