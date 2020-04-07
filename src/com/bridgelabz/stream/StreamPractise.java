package com.bridgelabz.stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamPractise {

    public static void main( String[] args ) throws IOException {
//        Reading one byte a time.
        InputStream inputStream = new FileInputStream( new File( "D:\\angular.txt" ) );
        int intValueByteReading;
        List<Byte> bytes = new ArrayList<>();
        while ((intValueByteReading = inputStream.read()) >= 0) bytes.add( (byte) intValueByteReading );
        System.out.println( "Byte reading : " );
        bytes.forEach( System.out :: print );

//        Reading one character at a time
        Reader reader = new FileReader( "D:\\angular.txt" );
        int intValueCharReading;
        List<Character> characters = new ArrayList<>();
        while ((intValueCharReading = reader.read()) >= 0) characters.add( (char) intValueCharReading );
        System.out.println( "\n Character reading : " );
        bytes.forEach( System.out :: print );


    }
}
