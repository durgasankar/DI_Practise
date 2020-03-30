package com.bridgelabz.collections.lambda;


import com.bridgeLabz.utility.Util;

import java.util.Arrays;

/**
 * Impl class of marker interface. prime checker , palindrome checker , even odd checker
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

    PalindromeChecker palindromeChecker(){
        return inputString -> {
            if (inputString.length() == 0) {
                return false;
            }
            char[] ch1 = inputString.toCharArray();
            char[] ch2 = inputString.toCharArray();
            int lastChar = ch1.length - 1;

            for(int i = 0; i < ch1.length / 2; ++i) {
                char temp = ch1[i];
                ch1[i] = ch1[lastChar - i];
                ch1[lastChar - i] = temp;
            }
            return Arrays.equals(ch1, ch2);
        };
    }

    DivisibilityFifteen divisibilityFifteen(){
        return enteredNumber -> {
            int length = enteredNumber.length();
            if (enteredNumber.charAt(length - 1) != '5' && enteredNumber.charAt(length - 1) != '0')
                return false;
            int sum = 0;
            for (int i = 0; i < enteredNumber.length(); i++)
                sum += (int) enteredNumber.charAt(i);
            if (sum % 3 == 0)
                return true;
            return false;
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

        /*Palindrome checker using lambda functional interface.*/
        System.out.println("Enter a String for palindrome checker : ");
        System.out.println(new LambdaImpl().palindromeChecker().isPalindrome(Util.scanner.next()) ? "Palindrome" : "Not Palindrome");

        /*Divisibility by 15 checker using lambda functional interface.*/
        System.out.println("Enter a String for divisibility 15 checker : ");
        System.out.println(new LambdaImpl().divisibilityFifteen().isDivisible(Util.scanner.next()) ? "Divisible" : "Not Divisible");
    }
}
