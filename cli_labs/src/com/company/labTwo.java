package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class labTwo {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Welcome to labTwo. " +
                "What is your name?");
        String name = entry.nextLine();
        System.out.println("Hello " + name + " would you like to play a game? (y/n)");
        String playOrNot = entry.nextLine();

        if (playOrNot.equals("y")) {
            System.out.println("AWESOME ... Lets Play!");
            System.out.println("----------------------" +
                    "\nYou are walking through a dark forest," +
                    "\nYou come to a riverbed and see some people fishing." +
                    "\nWould you like to 1. Talk to them. 2. Continue Walking. or 3. Turn around and go home." +
                    "\nPlease input the number you would like....");
            int choice = entry.nextInt();
            if (choice == 1) {
                System.out.println("You talk to them... they tell you about a strange fish they are trying to catch." +
                        "\nThey say its a carnivorous fish and it has been killing other fish, animals that drink from the river, and people too! " +
                        "\nWould you like to 1. Help them catch the fish. or 2. Continue walking.");
                int scenarioOne = entry.nextInt();
                if (scenarioOne == 1) {
                    System.out.println("---------------");
                    System.out.println("You pick up a fishing pole and its not long before you have a bite." +
                            "\nYou struggle for about 20 minutes, but finally pull in this huge monster looking fish." +
                            "\nIt thrashes around looking like its trying to stand up!" +
                            "\nWould you like to 1. Run away. 2. Try to kill the fish monster");
                    int scenarioOneFish = entry.nextInt();
                    if (scenarioOneFish == 1) {
                        System.out.println("---------------");
                        System.out.println("The fish is to fast, it catches you and eats you.");
                    } else {
                        System.out.println("---------------");
                        System.out.println("You search for some kind of weapon to fight this fish monster" +
                                "\nthe fish is now standing and tearing through the fisherman trying to fight it." +
                                "\nYou notice one of the fisherman had a knife, you see it on his body." +
                                "\nYou notice a lot of rocks as well, You think .. \" Maybe I can throw them ..\" " +
                                "\nYou dont notice anything else you could use. Maybe you can try to hide." +
                                "\nWould you like to 1. Go for the Knife. 2. Throw the rocks. or 3. Try to hide");
                        int scenarioOneFinal = entry.nextInt();
                        if (scenarioOneFinal == 1) {
                            System.out.println("---------------");
                            System.out.println("You grab the knife but the fish is much faster." +
                                    "\nYou get in a few good hits, you are sure he is wounded" +
                                    "\nthe fish monster is more than you can handle with a knife. He eats you.");
                        } else if (scenarioOneFinal == 2) {
                            System.out.println("---------------");
                            System.out.println("What were you thinking???!! Rocks???");
                            System.out.println("You see the laughter in the fish monsters eyes while he devours you.");
                        } else {
                            System.out.println("---------------");
                            System.out.println("You run while the fish monster is dealing with the fisherman." +
                                    "\nYou find a place to hide behind a boulder near a cliff." +
                                    "\nYou hear the fish monster coming fast, he must have seen you run off" +
                                    "\nYou get really scared dart off into some trees, as the fish sees you and tried to turn" +
                                    "\nhe trips over some underbrush and falls off the cliff." +
                                    "\nCongratulations. You win this Scenario.");
                        }
                    }
                } else {
                    System.out.println("---------------");
                    System.out.println("You continue walking around, it starts to get dark. You decide to go home.");
                }
            } else if (choice == 2) {
                System.out.println("---------------");
                System.out.println("You continue on you journey and find a cave. How cool!!" +
                        "\nWould you like to explore the cave? (y/n)");
                String explore = entry.next();
                System.out.println(explore);
                if (explore.equals("y")) {
                    System.out.println("---------------");
                    System.out.println("You enter the cave, after a few minutes you hear rustling noises," +
                            "\nafter a couple of steps you start to see a dim glow of what might be fire." +
                            "\nYour steps hurry, you are really interest in what that light might be." +
                            "\nYou are almost running through the cave at this point, the light is really bright now." +
                            "\nYou are about to turn a corner where the light source seems to be coming from. \nThe rustling that you heard before is now accompanied by low guttural growls." +
                            "\nWould you like to 1. Inspect further. 2. Turn around and run away.");
                    int scenarioCave = entry.nextInt();
                    if (scenarioCave == 1) {
                        System.out.println("You walk around the corner to see a tribe of cave dwellers, they seem to be having a party." +
                                "\nThey notice you and get really excited, you dont understand them very well but from what you can make out" +
                                "\nthey seem to have been throwing a party to celebrate the arrival of their new God, and they think you are it!" +
                                "\nThe party continues and they worship you, give you food, dress you in \"ceremonial robes\", and bathe you in gold." +
                                "\nCongratulations you win this scenario!");
                    } else {
                        System.out.println ("As you are turning around to run away your hand slips on the cave wall, \nyou fall and make a loud noise" +
                                "\nThere was a tribe of indigenous cave dwellers. They are mad that you interrupted their party," +
                                "\nthey beat you to death with blunt and crude stone weapons");
                    }

                } else {
                    System.out.println("---------------");
                    System.out.println("Did you really wanted to play? You just go home.");
                }
            } else {
                System.out.println("---------------");
                System.out.println("You cant have an adventure if you just go home.");
            }
        } else {
            System.out.println("---------------");
        }
        System.out.println("Thank you for playing! Goodbye");
    }

    public static class labThree {

        public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);
            System.out.println("Welcome to com.company.labTwo.labThree. " +
                    "Please give me any numbers you want" +
                    " and I will return the numbers squared and cubed.");

            System.out.println("How many numbers are you going to enter?");

            int numberOfEntries = entry.nextInt();

            int arr[] = new int[numberOfEntries];

            System.out.println("Okay go ahead and give me those " + numberOfEntries + " numbers, " + "I am ready.");

            StringBuilder sb = new StringBuilder();
            // Send all output to the Appendable object sb
            Formatter formatter = new Formatter(sb);

            for(int i=0;i<numberOfEntries;i++){ //for reading array
                arr[i] = entry.nextInt();

            }

            System.out.println(formatter.format("%3$2s %2$2s %1$2s", "Numbers", "Numbers Cubed", "Numbers Squared"));
            for(int i: arr){ //for printing array
                int numSquared = i*i;
                int numCubed = i*i*i;

                String results = i + "		       " + numSquared + "		       " + numCubed;
                System.out.println(results);
            }


        }
    }
}