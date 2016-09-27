package com.company;

import java.util.Scanner;

public class labNine {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Welcome to labNine!" +
        "\nHere we are going to return you the area and circumference of a circle.");
        double radius = 0;
        int count = 0;
        String goOn = "y";

        while(goOn.equalsIgnoreCase("y")) {
            System.out.println("Please enter the radius of your circle.");
            double r = entry.nextDouble();
            //construct a new circle with the radius from user input
            Circle circle = new Circle(r);
            //call the Circle object created to modify the needed variables
            System.out.println("Circumference: " + circle.getFormattedCircumference());
            System.out.println("Area: " + circle.getFormattedArea());
            count = circle.getObjectCount();

            System.out.println("Would you like to find dimensions for another circle? (y/n)");
            goOn = entry.next();
        }
        System.out.println("That you for using my application!" +
        "\nYou found dimentions for " + count + " circles.");
    }
}
