package com.bridgelabz.abstraction;

public class FixedFeeCalculator implements RevenueCalculator {
    private final double fee;
    public static final double STANDARD_FEE = 500;

    public FixedFeeCalculator( final double fee ) { this.fee = fee; }


    @Override
    public double calculate( ClientEngagement clientEngagement ) {
        return fee;
    }
}
