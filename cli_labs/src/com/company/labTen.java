package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class labTen {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in).useDelimiter("\\n");
        String goOn = "y";

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Event Horizon", "scifi"));
        movies.add(new Movie("Enders Game", "scifi"));
        movies.add(new Movie("Dune", "scifi"));
        movies.add(new Movie("Big Daddy", "comedy"));
        movies.add(new Movie("The Rocker", "comedy"));
        movies.add(new Movie("Poltergheist", "horror"));
        movies.add(new Movie("Texas Chainsaw Massacre", "horror"));
        movies.add(new Movie("Parranormal Activity", "thriller"));
        movies.add(new Movie("Die Hard", "action"));
        movies.add(new Movie("Supercop", "action"));
        movies.add(new Movie("Kung Fu Hustle", "comedy"));
        movies.add(new Movie("The Shawshank Redemption", "drama"));
        movies.add(new Movie("Pay it Forward", "drama"));
        movies.add(new Movie("Masters of the Universe", "action"));

        System.out.println("Welcome to labTen!" +
        "\nI store a list of movies that you can search by genre.");
        System.out.println("                     "); // just for a line break

        while (goOn.equalsIgnoreCase("y")) {
            System.out.println("Here is a list of the genres I have available:" +
            "\nscifi | comedy | horror | action | thriller | drama" +
            "\n\nWhich genre would you like to search?");

            String genre = entry.next();

            if (genre.equals("scifi") || genre.equals("comedy") || genre.equals("horror")
                    || genre.equals("action") || genre.equals("thriller") || genre.equals("drama")) {
                int count = 0;
                for (Movie m : movies) {
                    if (m.getGenre().equals(genre)) {
                        System.out.println(m.getTitle());
                        count++;
                    }
                }
                System.out.println(count + " movies found in genre: " + genre);
                System.out.println("                  "); //another line break
            } else {
                System.out.println("We didnt understand what you wanted. Sorry.");
            }

            System.out.print("Would you like to search another genre? (y/n)");
            goOn = entry.next();
        }
    }
}
