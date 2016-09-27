package com.company;

import java.util.Scanner;

public class labOne {
    public static void main(String[] args) {
        System.out.println("Welcome to labOne. " +
                "We are going to give you the perimeter and area of rooms" +
                " based on input you give us.");
        Scanner entry = new Scanner(System.in);  // Use Scanner to get input
        String goOn = "y";

        while (goOn.equalsIgnoreCase("y")) {
            System.out.print("Please enter the width in feet: ");
            double width = entry.nextDouble(); // Scans the next token of the input as an double
            System.out.print("Please enter the height in feet: ");
            double height = entry.nextDouble(); // Scans the next token of the input as an double
            System.out.print("Please enter the length in feet: ");
            double length = entry.nextDouble(); // Scans the next token of the input as an double
            System.out.print("Would you like to enter more? (y/n)");
            goOn = entry.next();

            System.out.println("--------------------");
            double perimeter = (width + width + length + length);
            System.out.println("Perimeter: " + perimeter + " ft");
            System.out.println("--------------------");
            double area = (width * length);
            System.out.println("Area: " + area + " ft");
            System.out.println("--------------------");
            double volume = (width * length * height);
            System.out.println("Volume: " + volume);
            System.out.println("--------------------");

        }

    }
}