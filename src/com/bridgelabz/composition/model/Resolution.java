package com.bridgelabz.composition.model;

/**
 * Model class for Dimension
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 */
public class Resolution {
	private int width;
	private int height;

	public Resolution(int width, int height) {

		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}