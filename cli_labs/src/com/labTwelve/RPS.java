package com.labTwelve;

public enum RPS {
    ROCK, PAPER, SCISSORS;


    public String toString() {
        if (ordinal() == 0)
            return "Rock";
        if (ordinal() == 1)
            return "Paper";
        return "Scissors";
    }

    public static int decideWinner(RPS p1, RPS p2) {
        if (p1 == p2)
            return 0; // tie
        if (p1 == RPS.ROCK && p2 == RPS.SCISSORS)
            return 1;
        if (p1 == RPS.PAPER && p2 == RPS.ROCK)
            return 1;
        if (p1 == RPS.SCISSORS && p2 == RPS.PAPER)
            return 1;
        return 2;
    }
}
