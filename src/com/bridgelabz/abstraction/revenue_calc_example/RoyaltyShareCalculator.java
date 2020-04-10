package com.bridgelabz.abstraction.revenue_calc_example;

/**
 * Provides implementation of royalty share
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 * @see {@link RevenueCalculator} main Interface which has a function of calculating Revenue
 */
public class RoyaltyShareCalculator implements RevenueCalculator {

    public static final double STANDARD_ROYALTY_PERCENTAGE = 0.15;
    private final double royaltyPercentage;

    public RoyaltyShareCalculator( final double royaltyPercentage ) { this.royaltyPercentage = royaltyPercentage; }

    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return STANDARD_ROYALTY_PERCENTAGE * clientEngagement.getAnticipatedRevenue();
    }
}
