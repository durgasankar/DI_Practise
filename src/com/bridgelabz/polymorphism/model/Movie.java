package com.bridgelabz.polymorphism.model;

/**
 * Model class of movie which has a method plot defines the story of movie.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 */
public class Movie {
	private String movieName;

	/**
	 * Single parameterized Constructor
	 * 
	 * @param name
	 */
	public Movie(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * Simple one method which defines the plot of the movie
	 * 
	 * @return String.
	 */
	public String plot() {
		return "No Plot Here";
	}

	public String getName() {
		return movieName;
	}

	@Override
	public String toString() {
		return "Movie [name=" + movieName + "]";
	}

}
