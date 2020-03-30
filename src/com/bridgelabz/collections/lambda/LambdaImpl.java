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

    private static int checker(EvenOddChecker checker, int number){
        return checker.oddNumberChecker(number);
    }
    EvenOddChecker checker(){
        return number -> { return number%2;};
    }

    PrimeChecker primeChecker(){
        return  number -> {
            if (number <= 0) {
                return false;
            } else if (number == 1) {
                return false;
            } else {
                for(int divisor = 2; divisor <= number / 2; ++divisor) {
                    if (number % divisor == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static void main(String[] args) {
        /*takes impl class of functional interface and number from user and checks whether even or odd
        then prints the status*/

        System.out.println("Enter a number for even odd checker : ");
        System.out.println(( checker( new LambdaImpl().checker(), Util.scanner.nextInt()) == 0 ) ? "Even" : "Odd" );

        /*Prime checker using lambda functional interface.*/

        System.out.println("Enter a number for prime checker : ");
        System.out.println(new LambdaImpl().primeChecker().isPrime(Util.scanner.nextInt()) ? "Prime Number" : "Not Prime");


    }
}
