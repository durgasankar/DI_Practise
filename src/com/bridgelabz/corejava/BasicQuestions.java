package com.bridgelabz.corejava;

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


    public static void main(String[] args) {
        BasicQuestions questions = new BasicQuestions();
        System.out.println("count vowels and consonants in String -> ");
        questions.countVowelsConsonantsWhiteSpacesInString("Hy this is counting practise lets test.");

    }
}
