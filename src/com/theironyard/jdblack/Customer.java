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
        System.out.println("What is your name?");
        String name = Main.scanner.nextLine(); //need to store it in a variable,
        System.out.println("Welcome, " + name);

        if (name.isEmpty()) {
            throw new Exception("We do not recognize that name");
        }
    }

    public void makeChoice() throws Exception {
        System.out.println("What would you like to do today? [Check Balance/Withdraw Funds/Cancel]");
        String choice = Main.scanner.nextLine();

        if (choice.equalsIgnoreCase("Check Balance")) {
            System.out.println(":/ your balance is $100.");
        }

        else if (choice.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again");
        }

        else if (choice.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("How much would you like to withdraw today?");
            String amount = Main.scanner.nextLine();

            int numInt = Integer.valueOf(amount); //converts to an integer

            if (numInt <= 100000 && numInt >= 0)
                System.out.println("Please take your money, and have a great day!");

            else {
                throw new Exception("That is not a valid withdrawal amount");
            }
        }
    }
}

