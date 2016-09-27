package com.company;


import java.util.Scanner;

public class labSix {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Welcome to labSix." +
                "\nHere we are going to translate any word you want into piglatin.");


        String goOn = "y";

        while (goOn.equalsIgnoreCase("y")) {
            System.out.println("Whenever you are ready... type in a word for me.");
            String inputString = entry.next();
            System.out.println("Your input: " + "\n" + inputString);


            inputString = inputString.toUpperCase(); //converting the word into Uppercase
            int l = inputString.length();
            int pos = -1;
            char ch;

            for (int i = 0; i < l; i++) {
                ch = inputString.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    pos = i; //storing the index of the first vowel
                    break;
                }
            }


            if (pos != -1) { //printing piglatin only if vowel exists
                String a = inputString.substring(pos); //extracting all alphabets in the word beginning from the 1st vowel
                String b = inputString.substring(0, pos); //extracting the alphabets present before the first vowel
                String translated = a + b + "AY"; //adding "AY" at the end of the extracted words after joining them
                System.out.println("Translation: " + "\n" + translated);
            } else {
                System.out.println("No vowel, hence piglatin not possible");
            }

            System.out.println("Would you like to enter in another word? (y/n)");
            goOn = entry.next();

        }
    }
}

