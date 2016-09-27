package com.company;

import java.util.Scanner;

public class labSeven {

    public static void main(String[] args) {
        System.out.println("Welcome to labSeven, we have a java class going on, " +
                "\nhere you have access to our complete student roster." +
                "\n" +
                "\n");
        Scanner entry = new Scanner(System.in);

        String[][] students = {
                {"Vincent Dufek", "Portland, OR", "Pizza"},
                {"Troy Russom", "Baltimore, MD", "BBQ"},
                {"Amy Austin", "Nacagdoches, TX", "Veggies"},
                {"Paul Even", "San Antonio, TX", "Pork Chops"},
                {"Stewart Wealer", " New Orleans, LA", "Funnel Cakes"},
                {"William Kelly", "Detroit, MI", "Donuts"}
        };
        System.out.println("Here is a list of students names");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i][0]);
        }
        System.out.println("\nWould you like more information about one of our students? (y/n)");
        String moreInfo = entry.next();
        String goOn = "y";
        while (goOn.equalsIgnoreCase("y")) {
            if (moreInfo.equals("y")) {
                System.out.println("Please enter the number of the student to get corresponding information");
                int studentNumber = entry.nextInt();


                String selected = students[studentNumber - 1][0];

                if (studentNumber >= 1 && studentNumber <= 6) {
                    System.out.println("Student: " + selected + "," +
                            "\nThey are from " + students[studentNumber - 1][1] + "." +
                            "\nThey love to eat " + students[studentNumber - 1][2] + ".");
                } else {
                    try {
                        throw new ArrayIndexOutOfBoundsException();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("That student does not exist.  Please try again. (enter a number between 1-6)");
                    }
                }
                System.out.println("\nWould you like to continue learning about the students? (y/n)");
                goOn = entry.next();
            }

        }
    }
}