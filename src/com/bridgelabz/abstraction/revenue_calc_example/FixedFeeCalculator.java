package com.bridgelabz.abstraction.revenue_calc_example;

/**
 * Provides implementation of fixed rate revenue
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 * @see {@link RevenueCalculator} main Interface which has a function of calculating Revenue
 */
public class FixedFeeCalculator implements RevenueCalculator {
    private final double fee;
    public static final double STANDARD_FEE = 500;

    public FixedFeeCalculator( final double fee ) { this.fee = fee; }


    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return fee;
    }
}
