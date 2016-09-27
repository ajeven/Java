
package com.company;

import java.util.Scanner;

public class labEight {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in).useDelimiter("\\n"); // delimiter to escape the new line or "space" for .next()
        System.out.println("Welcome to labEight!" +
        "\nHere we are going to calculate bating averages for you.");
        String goOn = "y";
        String player = " ";
        while (goOn.equalsIgnoreCase("y")) {
            System.out.println("Who are we calculating batting average for?");
            player = entry.next();

            System.out.println("Please enter the number of at bats for " + player);
            int ab = entry.nextInt(); // get the number of at bats to enter
            int[] atBat = new int[ab]; // create an array to store the values of bases scored per at bat

            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run" +
            "\nPlease enter the number of bases " + player + " earned on each at bat.");
            for (int i = 0; i < ab; i++) {
                System.out.print("Result for at-bat attempt " + i +": ");
                atBat[i] = entry.nextInt();
                while (atBat[i] < 0 || atBat[i] > 4) { // while inside for to make sure user input in correct
                    System.out.print("Invalid entry.  Please try again.  Result for at-bat " + i + ": ");
                    atBat[i] = entry.nextInt();
                }
            }
            int hits = 0;
            int scores = 0;
            for (int i : atBat) {
                if (i > 0)
                    hits++;
                scores += i;
            }

            double average = (double)hits/ab;
            double slugPercentage = (double)scores/ab;

            System.out.printf(player + "'s Average: %.3f \n", average);
            System.out.printf(player + "'s Slug Percentage: %.3f \n", slugPercentage);

            System.out.println("Would you like to enter another batter? (y/n)");
            goOn = entry.next();
        }
    }
}
