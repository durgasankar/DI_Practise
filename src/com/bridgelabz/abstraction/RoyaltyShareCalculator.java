package com.bridgelabz.abstraction;

public class RoyaltyShareCalculator implements RevenueCalculator {

    private static final double STANDARD_ROYALTY_PERCENTAGE = 0.15;
    private final double royaltyPercentage;

    public RoyaltyShareCalculator( final double royaltyPercentage ) { this.royaltyPercentage = royaltyPercentage; }

    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return STANDARD_ROYALTY_PERCENTAGE * clientEngagement.getAnticipatedRevenue();
    }
}
