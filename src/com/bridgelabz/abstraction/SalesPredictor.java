package com.bridgelabz.abstraction;

import java.util.Arrays;
import java.util.List;

public class SalesPredictor {

    private static double printTotalRevenue( final List<ClientEngagement> engagements, final RevenueCalculator calculator ) {
//        using stream
        return engagements
                .stream()
                .mapToDouble( calculator :: calculate )
                .sum();
    }

    private static double getAdvancedForLoopTotal( List<ClientEngagement> engagements, RevenueCalculator calculator ) {
//        advanced for loop using
        double advancedForLoopTotal = 0;
        for (ClientEngagement clientEngagement : engagements)
            advancedForLoopTotal += calculator.calculate( clientEngagement );
        return advancedForLoopTotal;
    }


    public static void main( String[] args ) {

        final List<ClientEngagement> engagements = Arrays.asList(
                new ClientEngagement( "Jack", 30, 50000 ),
                new ClientEngagement( "Mac", 40, 30000 ),
                new ClientEngagement( "Sim", 20, 40000 ),
                new ClientEngagement( "Kim", 50, 20000 ),
                new ClientEngagement( "Jim", 25, 60000 )
        );
//        fixed rate
        System.out.println( "fixed rate : " );
//        calculate revenue
        System.out.println( "total = " + printTotalRevenue( engagements, new FixedFeeCalculator( FixedFeeCalculator.STANDARD_FEE ) ) );
        System.out.println( "advancedForLoopTotal = " + getAdvancedForLoopTotal( engagements, new FixedFeeCalculator( FixedFeeCalculator.STANDARD_FEE ) ) );
//        Royalty percentage rate
        System.out.println( "royalty percentage rate : " );
        System.out.println( "total = " + printTotalRevenue( engagements, new RoyaltyShareCalculator( RoyaltyShareCalculator.STANDARD_ROYALTY_PERCENTAGE ) ) );
//        Hourly rate
        System.out.println( "hourly rate rate : " );
//        calculate revenue
        System.out.println( "total = " + printTotalRevenue( engagements, new HourlyRateRevenueCalculator( HourlyRateRevenueCalculator.STANDARD_HOURLY_RATE ) ) );

    }


}
