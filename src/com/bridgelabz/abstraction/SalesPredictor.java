package com.bridgelabz.abstraction;

import java.util.Arrays;
import java.util.List;

public class SalesPredictor {
    private static final double STANDARD_FEE = 2000;

    public static void main( String[] args ) {

        final List<ClientEngagement> engagements = Arrays.asList(
                new ClientEngagement( "Jack", 30, 50000 ),
                new ClientEngagement( "Mac", 40, 30000 ),
                new ClientEngagement( "Sim", 20, 40000 ),
                new ClientEngagement( "Kim", 50, 20000 ),
                new ClientEngagement( "Jim", 25, 60000 )
        );
        RevenueCalculator calculator = new FixedFeeCalculator( STANDARD_FEE );

//        calculate revenue
//        stream using
        double total = engagements
                .stream()
                .mapToDouble( calculator :: calculate )
                .sum();
        System.out.println( "total = " + total );

//        advanced for loop using
        double advancedForLoopTotal = 0;
        for (ClientEngagement clientEngagement : engagements) advancedForLoopTotal += calculator.calculate( clientEngagement );
        System.out.println( "advancedForLoopTotal = " + advancedForLoopTotal );
    }
}
