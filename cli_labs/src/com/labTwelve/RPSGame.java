package com.labTwelve;

import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        System.out.println ("Welcome to labTwelve!" +
        "\nWe are going to play some Roshambo");
        player player1 = new Human (entry);
        player opponent;
        System.out.print("We have two opponents for you today" +
                "\nWould you like to play against 1 or 2? (1/2)");
        String choice = entry.nextLine();
        int challenger = RPSValidate.isValidOpponent(choice);
        while (challenger < 0) {
            System.out.println("I dont understand that, please try again.");
            System.out.print("Would you like to play against 1 or 2? (1/2) ");
            choice = entry.nextLine();
            challenger = RPSValidate.isValidOpponent(choice);
        }
        if (challenger == 0)
            opponent = new RockAI();
        else
            opponent = new RandomAI();

        int games = 0;
        int wins = 0;
        int draw = 0;
        int loses = 0;


        while (true) {
            games++;
            player1.generateRPS();
            opponent.generateRPS();

            System.out.println();
            System.out.println(player1.getName() + ": " + player1.getChoice());
            System.out.println(opponent.getName() + ": " + opponent.getChoice());

            int winner = RPS.decideWinner(player1.getChoice(), opponent.getChoice());
            if (winner == 0) {
                System.out.println("Players tied!");
                draw++;
            } else if (winner == 1) {
                System.out.println(player1.getName() + " wins!");
                wins++;
            }
            else {
                System.out.println(opponent.getName() + " wins!");
                loses++;
            }

            System.out.println();

            System.out.print("Continue? (y/n) ");
            String answer = entry.nextLine();
            char firstLetter = answer.toUpperCase().charAt(0);
            while (!RPSValidate.isYN(answer)) {
                System.out.print("That input wont work. Continue? (y/n) ");
                answer = entry.nextLine();
            }
            if (firstLetter == 'N')
                break;
        }
        System.out.println("You won " + wins + " and lost " + loses + " times out of " + games + " total games");
    }
}
