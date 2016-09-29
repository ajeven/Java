package com.labTwelve;

public class RockAI extends player {
    public RockAI() {
        name = "AI Player";
    }

    public RPS generateRPS() {
        choice = RPS.ROCK;
        return choice;
    }
}
