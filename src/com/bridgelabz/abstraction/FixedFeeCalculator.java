package com.bridgelabz.abstraction;

public class FixedFeeCalculator implements RevenueCalculator {

    private static final double STANDARD_FEE = 500;
    private final double fee;

    public FixedFeeCalculator( final double fee ) { this.fee = fee; }

    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return fee;
    }
}