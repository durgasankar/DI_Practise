package com.bridgelabz.crud_operatuion.model;

import javax.persistence.Embeddable;
/**
 * SalaryInfo Embedded class which has the parameters of Salary Info
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-04
 * @version 1.1
 */
@Embeddable
public class SalaryInfo {
    private int basicSalary;
    private double da;
    private double tax;

    public SalaryInfo( int basicSalary, double da, double tax ) {
        this.basicSalary = basicSalary;
        this.da = da;
        this.tax = tax;
    }
    

    public SalaryInfo() {
		super();
	}


	public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary( int basicSalary ) {
        this.basicSalary = basicSalary;
    }

    public double getDa() {
        return da;
    }

    public void setDa( double da ) {
        this.da = da;
    }

    public double getTax() {
        return tax;
    }

    public void setTax( double tax ) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "SalaryInfo{" +
                "basicSalary=" + basicSalary +
                ", da=" + da +
                ", tax=" + tax +
                '}';
    }
}
