package com.company;

import java.util.Scanner;
import java.util.Formatter;

public class labThree {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Welcome to labThree. " +
                "Please give me any numbers you want" +
                " and I will return the numbers squared and cubed.");

        System.out.println("How many numbers are you going to enter?");

        int numberOfEntries = entry.nextInt();

        int arr[] = new int[numberOfEntries];

        System.out.println("Okay go ahead and give me those " + numberOfEntries + " numbers, " + "I am ready.");

        StringBuilder sb = new StringBuilder();
        // Send all output to the Appendable object sb
        Formatter formatter = new Formatter(sb);

        for(int i=0;i<numberOfEntries;i++){ //for reading array
            arr[i] = entry.nextInt();

        }

        System.out.println(formatter.format("%3$2s %2$2s %1$2s", "Numbers", "Numbers Cubed", "Numbers Squared"));
        for(int i: arr){ //for printing array
            int numSquared = i*i;
            int numCubed = i*i*i;

            String results = i + "		       " + numSquared + "		       " + numCubed;
            System.out.println(results);
        }


    }
}
