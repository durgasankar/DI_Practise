package com.bridgelabz.abstraction.builder_ds;

/**
 * implementation class for builder design pattern
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-11
 */
public class PurchaseRation {

    public static void main( String[] args ) {

        Ration ration = new Ration.Builder(  )
                .bread( "wheat" )
                .nonVeg( "chicken" )
                .snacks( "biscuit" )
                .spices( "turmeric powder" )
                .createRation();

        System.out.println( "ration = " + ration );

    }
}
