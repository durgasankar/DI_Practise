package com.bridgelabz.composition.service;

import com.bridgelabz.composition.model.Dimension;

/**
 * Case is a hardware part of which has the Computer
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link Dimension}
 */
public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimensions;

	public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	public Case() {
		super();
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

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	/**
	 * This hardware has the functionality of switching on desktop when power button
	 * is pressed.
	 */
	public void pressPowerBotton() {
		System.out.println("Power Botton is pressed...");
	}

}
