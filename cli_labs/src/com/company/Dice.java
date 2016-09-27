package com.company;
// This is a class for labFive
public class Dice {
    private int sides;
    private int roll;

    public Dice() {
        sides = 0;
        roll = 0;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public int rollDice(int sides) {
        roll = (int) Math.ceil(Math.random() * sides);
        return roll;
    }
}