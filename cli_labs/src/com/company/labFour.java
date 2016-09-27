package com.company;

import java.util.Scanner;

public class labFour {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String goOn = "y";

        while (goOn.equalsIgnoreCase("y")) {
            boolean isValid = false;
            while (!isValid) {
                System.out.println("Welcome to labFour, here you can give me a number" +
                        "\ngreater than 0 but less that 10 and I will return to you the factorial of that number.");
                System.out.println("Please go ahead and give me that number");

                int i, j = 1, fact = 1;

                try {
                    j = entry.nextInt();
                } catch (Exception e) {
                    // Read any pending input which would be invalid characters at this point
                    System.out.println("Please enter a number");
                    entry.next();
                    continue;
                }

                if (j > 10 || j < 0) {
                    System.out.println("Wrong input enter only 1 number within the requested parameters ");
                } else {
                    isValid = true;
                    for ( i = 1 ; i <= j ; i++ ) {
                        fact = fact * i;
                        System.out.println("The factorials of: " + j + "! = " + fact);
                    }
                }


                System.out.print("Would you like to enter more? (y/n)");
                goOn = entry.next();
            }
        }


    }
}