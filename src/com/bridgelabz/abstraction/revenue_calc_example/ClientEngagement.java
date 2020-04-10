package com.bridgelabz.abstraction.revenue_calc_example;

/**
 *  Model class
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */
public class ClientEngagement {

    private String name;
    private double hoursWorked;
    private int anticipatedRevenue;

    public ClientEngagement( String name, double hoursWorked, int anticipatedRevenue ) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.anticipatedRevenue = anticipatedRevenue;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked( double hoursWorked ) {
        this.hoursWorked = hoursWorked;
    }

    public int getAnticipatedRevenue() {
        return anticipatedRevenue;
    }

    public void setAnticipatedRevenue( int anticipatedRevenue ) {
        this.anticipatedRevenue = anticipatedRevenue;
    }

    @Override
    public String toString() {
        return "ClientEngagement{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", anticipatedRevenue=" + anticipatedRevenue +
                '}';
    }
}
