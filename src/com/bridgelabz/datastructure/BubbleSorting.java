package com.bridgelabz.datastructure;

/**
 * Bubble sort operations in integer
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-04-03
 */
public class BubbleSorting {

    public int[] bubbleSort( int array[] ) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    /* swap temporary variable and array[i] */
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static String[] bubbleSort( String[] stringArray ) {
        // comparing adjacent strings
        for (int j = 0; j < stringArray.length; j++)
            for (int i = j + 1; i < stringArray.length; i++)
                if (stringArray[i].compareTo( stringArray[j] ) < 0) {
                    String temp = stringArray[j];
                    stringArray[j] = stringArray[i];
                    stringArray[i] = temp;
                }
        return stringArray;
    }

}
