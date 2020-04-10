package com.bridgelabz.abstraction.revenue_calc_example;

import com.bridgelabz.abstraction.revenue_calc_example.*;
import com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement;

import java.util.Arrays;
import java.util.List;

/**
 * Implementation class main class
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */
public class Implementation {

    private static double printTotalRevenue( final List<com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement> engagements, final RevenueCalculator calculator ) {
//        using stream
        return engagements
                .stream()
                .mapToDouble( calculator :: calculate )
                .sum();
    }

    private static double getAdvancedForLoopTotal( List<com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement> engagements, RevenueCalculator calculator ) {
//        advanced for loop using
        double advancedForLoopTotal = 0;
        for (com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement clientEngagement : engagements)
            advancedForLoopTotal += calculator.calculate( clientEngagement );
        return advancedForLoopTotal;
    }


    public static void main( String[] args ) {

        final List<com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement> engagements = Arrays.asList(
                new com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement( "Jack", 30, 50000 ),
                new com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement( "Mac", 40, 30000 ),
                new com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement( "Sim", 20, 40000 ),
                new com.bridgelabz.abstraction.revenue_calc_example.ClientEngagement( "Kim", 50, 20000 ),
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
