package com.bridgelabz.polymorphism;

import com.bridgelabz.polymorphism.model.Movie;
import com.bridgelabz.polymorphism.serviveImpl.ComedyMovie;
import com.bridgelabz.polymorphism.serviveImpl.ComicActionMovie;
import com.bridgelabz.polymorphism.serviveImpl.DetectiveMovie;
import com.bridgelabz.polymorphism.serviveImpl.SuperHeroMovie;

/**
 * Main controller class where randomly 10 times the movie category is picked up
 * and corresponding movie name is also displayed.
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 */
public class Controller {
	/**
	 * Randomly a number is generated between 1-4 based on that a particular movie
	 * is chosen and the plot of the movie is printed up.
	 * 
	 * @return Integer
	 */
	private static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 4) + 1;
		System.out.println("Randomly generated number :" + randomNumber);
		switch (randomNumber) {
		case 1:
			return new DetectiveMovie();
		case 2:
			return new ComedyMovie();
		case 3:
			return new ComicActionMovie();
		case 4:
			return new SuperHeroMovie();
		}
		return null;
	}

	public static void main(String[] args) {
		for (int movieNumber = 1; movieNumber <= 10; movieNumber++) {
			Movie movie = randomMovie();
			System.out
					.println("Movie #" + movieNumber + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}
	}

}
