package com.bridgelabz.composition.service;

import com.bridgelabz.composition.model.Resolution;

/**
 * Case is a hardware part of the Computer
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Resolution}
 */
public class Moniter {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;

	public Moniter(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}

	public Moniter() {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}

	/**
	 * This function takes coordinate and color as input parameter and does display
	 * operation
	 * 
	 * @param x     as Integer coordinate
	 * @param y     as Integer coordinate
	 * @param color as String
	 */
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Draw pixel at " + x + " , " + y + " in color : " + color);
	}

}
