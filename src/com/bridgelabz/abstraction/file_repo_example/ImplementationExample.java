package com.bridgelabz.abstraction.file_repo_example;

/**
 * Implementation class main class
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-10
 */

public class ImplementationExample {

    public static void main( String[] args ) {

        ClientEngageRepository repository = null;
//        without following builder design pattern

//        findBy.setAtLeastHoursWorked( 5 );
//        findBy.setClient( "John" );

//        with following builder design pattern
        final Iterable<ClientEngagement> engagements = repository.find( new FindBy()
                .atLeastHoursWorked( 5 )
                .client( "John" ) );
    }
}
