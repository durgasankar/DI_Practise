package com.bridgelabz.composition.service;

/**
 * Case is a hardware part of which has the Computer
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 */
public class MotherBoard {

	private String model;
	private String manufacturer;
	private int ramSlot;
	private int cardSlot;
	private String bios;

	public MotherBoard(String model, String manufacturer, int ramSlot, int cardSlot, String bios) {

		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlot = ramSlot;
		this.cardSlot = cardSlot;
		this.bios = bios;
	}

	public MotherBoard() {

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

	public int getRamSlot() {
		return ramSlot;
	}

	public void setRamSlot(int ramSlot) {
		this.ramSlot = ramSlot;
	}

	public int getCardSlot() {
		return cardSlot;
	}

	public void setCardSlot(int cardSlot) {
		this.cardSlot = cardSlot;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}

	/**
	 * This function takes program name as String input parameter and loads the
	 * program.
	 * 
	 * @param programName as String Input parameter
	 */
	public void loadProgramme(String programName) {
		System.out.println("programme " + programName + " is loading...");
	}

}
