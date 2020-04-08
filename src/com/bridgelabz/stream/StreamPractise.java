package com.bridgelabz.stream;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamPractise {

    private static FileSystem openZip( Path zipPath ) throws IOException, URISyntaxException, Exception{
        Map<String, String> providerProps = new HashMap<>();
        providerProps.put( "create","true" );
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null );
        return FileSystems.newFileSystem(zipUri, providerProps);
    }

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

//        Using Buffer reader
        List<Character> chars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\angular.txt" ))){
            int intVAlue;
            while ((intVAlue = bufferedReader.read()) >= 0)
                chars.add( (char) intVAlue );
            System.out.println( "\n Buffered Reader reading : " );
            chars.forEach( System.out :: print );
        }

//        create a zip file
        try(FileSystem zipFs = openZip( Paths.get("D:\\ myZip.zip" ))) {

        }catch (Exception e){
            System.out.println(e.getMessage());
        }





    }
}
