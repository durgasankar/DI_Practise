package com.bridgelabz.abstraction;

public class HourlyRateRevenueCalculator implements RevenueCalculator{

    private static final double STANDARD_HOURLY_RATE = 50;
    private final double hourlyRate;

    public HourlyRateRevenueCalculator( final double hourlyRate ) { this.hourlyRate = hourlyRate; }

    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
