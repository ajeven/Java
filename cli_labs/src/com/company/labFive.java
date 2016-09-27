package com.company;

import java.util.Scanner;

public class labFive {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Welcome to labFive, we are going to play some dice games." +
                "\nI will generate rolls of dice for you based on what kind of dice you want." +
                "\nThe dice will always be rolled in pairs");
        String goOn = "y";
        while (goOn.equalsIgnoreCase("y")) {
            System.out.println("Whenever you are ready... how many sides do you want on your dice.");
            int sides = entry.nextInt();

            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            System.out.println("Ok we are going to roll these " + sides + " sided dice.");
            dice1.setSides(sides);
            dice2.setSides(sides);


            int roll1 = 0;
            int roll2 = 0;
            for (int i = 1; i <= sides; i++) {
                roll1 = dice1.rollDice(sides);
                roll2 = dice2.rollDice(sides);
            }
            System.out.println("Roll one" +
                    "\n-----------------------");
            System.out.println(roll1);
            System.out.println("Roll two" +
                    "\n-----------------------");
            System.out.println(roll2);
            if (roll1 == 1 && roll2 == 1) {
                System.out.println("Snake Eyes >.<");
            } else if (roll1 == 6 && roll2 == 6) {
                System.out.println("Box Cars ⋮⋮ ⋮⋮");
            } else if (roll1 + roll2 == 2 || roll1 + roll2 == 3 || roll1 + roll2 == 12) {
                System.out.println("CRAPS");
                break;
            }
            System.out.println("Would you like to roll again? (y/n)");

            goOn = entry.next();
        }

    }
}
