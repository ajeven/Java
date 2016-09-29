package com.labTwelve;

import java.util.Scanner;

public class Human extends player {
        Scanner entry;

        public Human(Scanner s) {
            entry = s;
            System.out.print("Enter your name: ");
            name = entry.nextLine();
        }

        public RPS generateRPS() {
            System.out.print("Rock, paper, or scissors? (R/P/S)");
            String input = entry.nextLine();
            int play = RPSValidate.isValidPlay(input);

            while (play < 0) {
                System.out.println("Sorry, that's not a valid choice.");
                System.out.print("Rock, paper, or scissors? (R/P/S)");
                input = entry.nextLine();
                play = RPSValidate.isValidPlay(input);
            }

            if (play == 0)
                choice = RPS.ROCK;
            else if (play == 1)
                choice = RPS.PAPER;
            else if (play == 2)
                choice = RPS.SCISSORS;

            return choice;
        }
}

