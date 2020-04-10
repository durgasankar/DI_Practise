package com.bridgelabz.abstraction.revenue_calc_example;

/**
 * Provides implementation of hourly rate revenue
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 * @see {@link RevenueCalculator} main Interface which has a function of calculating Revenue
 */
public class HourlyRateRevenueCalculator implements RevenueCalculator{

    public static final double STANDARD_HOURLY_RATE = 50;
    private final double hourlyRate;

    public HourlyRateRevenueCalculator( final double hourlyRate ) { this.hourlyRate = hourlyRate; }

    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
