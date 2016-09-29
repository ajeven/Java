package com.labTwelve;

public class RandomAI extends player {
    public RandomAI() {
        name = "AI Player";
    }

    public RPS generateRPS() {
        int play = (int) (Math.random() * 3);
        if (play == 0) {
            choice = RPS.ROCK;
        } else if (play == 1) {
            choice = RPS.PAPER;
        } else {
            choice = RPS.SCISSORS;
        }
        return choice;
    }

}
