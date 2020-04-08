package com.bridgelabz.stream;

import java.util.StringJoiner;

public class StringClasses {

    public static void main( String[] args ) {
//        joining Strings separated by comma
        StringJoiner sj1 = new StringJoiner( ", " );
        sj1.add( "Ram" ).add( "Jack" ).add( "Izak" );
        System.out.println( "After joining String : " + sj1.toString() );

//        joining string starts with and ends with
        StringJoiner sj2 = new StringJoiner( ", ", "{", "}" );
        sj2.add( "Ram" ).add( "Jack" ).add( "Izak" );
        System.out.println( "After joining String : " + sj2.toString() );

//        All value enclosed with sq braces
        StringJoiner sj3 = new StringJoiner( "], [", "[", "]" );
        sj3.add( "Ram" ).add( "Jack" ).add( "Izak" );
        System.out.println( "After joining String : " + sj3.toString() );

//        Customizing empty handling -> empty case is add is never called
        StringJoiner sj4 = new StringJoiner( "], [", "[", "]" );
        sj4.setEmptyValue( "EMPTY" );
//        sj4.add( "" );
        System.out.println( "Empty String  : " + sj4.toString() );

//        String formatting
        int ramesh = 10, suresh = 20, uncle = 30, kursi = 40;
        System.out.println( String.format( "My friends are %d, %d, %d and %d", ramesh, suresh, uncle, kursi ) );




    }
}
