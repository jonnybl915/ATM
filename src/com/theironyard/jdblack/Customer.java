package com.theironyard.jdblack;

import com.theironyard.jdblack.Main;

/**
 * Created by jonathandavidblack on 5/18/16.
 */
import java.util.Scanner;

public class Customer {
    String name;
    String choice;

    public void enterName() throws Exception {
        System.out.println("Welcome to Wells Fargo!");
        System.out.println("What is your name?");
        String name = Main.scanner.nextLine(); //need to store it in a variable,
        System.out.println("Welcome, " + name);

        if (name.isEmpty()) {
            throw new Exception("We do not recognize that name");
        }
    }

    public void makeChoice() throws Exception {
        System.out.println("What would you like to do today?");
        int numInt = 2;
        while (numInt <= 2) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Cancel");
            String choice = Main.scanner.nextLine();
            numInt = Integer.valueOf(choice);
            if (1 == numInt) {
                System.out.println(":/ your balance is $100.");

            } else if (numInt == 2) {
                System.out.println("How much would you like to withdraw today?");
                String amount = Main.scanner.nextLine();

                int numAmount = Integer.valueOf(amount); //converts to an integer

                if (numAmount <= 100000 && numAmount >= 0)
                    System.out.println("Please take your money, and have a great day!");

                else {
                    throw new Exception("That is not a valid withdrawal amount");
                }
            }
            else if (numInt == 3) {
                break;
            }
            System.out.println("Would you like to complete another transaction? [Y/N]");
            String anotherChoice = Main.scanner.nextLine();
            if (anotherChoice.equalsIgnoreCase("N")) {
                break;
            }

        }
        System.out.println("Thank you and please come again");
    }
}


