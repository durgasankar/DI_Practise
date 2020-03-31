package com.bridgelabz.corejava;

import com.bridgeLabz.utility.Util;
import com.bridgelabz.collections.predicatelambda.Person;

import java.util.*;

public class BasicQuestions {

    private void countVowelsConsonantsWhiteSpacesInString(String inputString) {
        int vowels = 0, consonants = 0, whiteSpaces = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char fetchedCharacter = inputString.toLowerCase().charAt(i);
            if (fetchedCharacter == 'a' || fetchedCharacter == 'e' || fetchedCharacter == 'i'
                    || fetchedCharacter == 'o' || fetchedCharacter == 'u')
                vowels++;
            else if ((fetchedCharacter >= 'a' && fetchedCharacter <= 'z'))
                consonants++;
            else if (fetchedCharacter == ' ')
                whiteSpaces++;
        }
        System.out.println("Total vowels count : " + vowels + ", Consonants count : "
                + consonants + ", Blank spaces : " + whiteSpaces);
    }

    private void iterateUsingForLoop(List<Person> personList) {
        List<String> forLoopPersonList = new ArrayList<>(personList.size());
        List<String> advancedLoopPersonList = new ArrayList<>(personList.size());
        List<String> whileLoopPersonList = new ArrayList<>(personList.size());

        System.out.println("Adding all names to for loop...");
        for (int index = 0; index < personList.size(); index++) {
            forLoopPersonList.add(personList.get(index).getName());
        }
        System.out.println("Adding all names to advanced for loop...");
        for (Person fetchedPerson : personList) {
            advancedLoopPersonList.add(fetchedPerson.getName());
        }
        System.out.println("Adding all names to while loop...");
        int counter = 0;
        while (personList.size() > counter) {
            whileLoopPersonList.add(personList.get(counter).getName());
            counter++;
        }
        System.out.println("Printing all names : ");
        System.out.println("For loop all names : " + forLoopPersonList.toString());
        System.out.println("Advanced for loop all names : " + advancedLoopPersonList.toString());
        System.out.println("While loop all names : " + whileLoopPersonList.toString());
    }

    private void printDuplicateCharactersInString(String inputString) {
        int counter = 0;
        char[] chars = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j < inputString.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + ", ");
                    counter++;
                    break;
                }
            }
        }
        System.out.println("\nTotal duplicates : " + counter);
    }

    private boolean isArmStrongNumber(int inputNumber) {
        int transferredNumber, tempValue, total = 0;
        transferredNumber = inputNumber;
        while (transferredNumber != 0) {
            tempValue = transferredNumber % 10;
            total += tempValue * tempValue * tempValue;
            transferredNumber /= 10;
        }
        return total == inputNumber;
    }


    public static void main(String[] args) {
        BasicQuestions questions = new BasicQuestions();
        System.out.println("count vowels and consonants in String -> ");
        questions.countVowelsConsonantsWhiteSpacesInString("Hy this is counting practise lets test.");

        System.out.println("Iterate ArrayList using for-loop, while-loop, and advance for-loop : ");
        List<Person> personList = Arrays.asList(new Person(10, "Ramesh", "IN", "Karnataka"),
                new Person(30, "Durgasankar", "IN", "Goa"),
                new Person(20, "John", "USA", "New York"),
                new Person(55, "Mic", "USA", "Chicago"),
                new Person(20, "Stanley", "USA", "Alaska"),
                new Person(50, "Jack", "AUS", "Sydney"),
                new Person(40, "Chang", "CHI", "Wuhan"));
        questions.iterateUsingForLoop(personList);

        System.out.println("The duplicate characters in a string : ");
        questions.printDuplicateCharactersInString("Duplicate characters in a string");

        System.out.println("Please Enter a number for checking Armstrong : ");
        System.out.println("result : " + questions.isArmStrongNumber(Util.scanner.nextInt()));


    }
}
