package com.bridgelabz.collections.lambda;


import com.bridgeLabz.utility.Util;
/**
 * Impl class of marker interface.
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-30
 */
public class LambdaImpl {

    private EvenOddChecker evenOddChecker;

    private static int checker(EvenOddChecker checker, int number){
        return checker.oddNumberChecker(number);
    }
    EvenOddChecker checker(){
        EvenOddChecker checker = number -> {return number%2;};
        return checker;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        System.out.println(( checker( new LambdaImpl().checker(), Util.scanner.nextInt()) == 0 ) ? "Even" : "Odd" );

    }
}
