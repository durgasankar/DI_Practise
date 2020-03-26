package com.bridgelabz.composition.service;

/**
 * Case is a hardware part of the Computer
 * 
 * @author Durgasankar Mishra
 * @created 2020-03-26
 * @version 1.8
 * @see {@link MotherBoard,Monitor, Case} model class
 */
public class PC {

	private Case theCase;
	private Moniter moniter;
	private MotherBoard motherboard;

	public PC(Case theCase, Moniter moniter, MotherBoard motherboard) {
		super();
		this.theCase = theCase;
		this.moniter = moniter;
		this.motherboard = motherboard;
	}

	public PC() {

		// TODO Auto-generated constructor stub
	}

	public Case getTheCase() {
		return theCase;
	}

	public void setTheCase(Case theCase) {
		this.theCase = theCase;
	}

	public Moniter getMoniter() {
		return moniter;
	}

	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}

	public MotherBoard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(MotherBoard motherboard) {
		this.motherboard = motherboard;
	}

}
