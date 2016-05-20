package com.theironyard.jdblack;

import com.theironyard.jdblack.Main;

/**
 * Created by jonathandavidblack on 5/18/16.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Customer {
    String name;
    String choice;
    HashMap<String, Double> customers;
    Double balance;

    public void enterName() throws Exception {
        System.out.println("Welcome to Wells Fargo!");
        System.out.println("What is your name?");
        name = Main.scanner.nextLine(); //need to store it in a variable,
        if (name.isEmpty()) {
            throw new Exception("We do not recognize that name");
        }

        if (customers.containsKey(name)){
            System.out.println("Welcome, " + name);
        }

        else {
            System.out.println("Name not recognized, would you like to open an account? [Y/N]");
            String entry = Main.scanner.nextLine();
            if (entry.equalsIgnoreCase("Y")){
                System.out.println("Great " + name + ", Your account has been created.");
                customers.put(name, +200.0);
            }

            else if (entry.equalsIgnoreCase("N")){
                throw new Exception ("We're sorry we couldn't be of service today.");
            }

            else {
                return;
            }
        }
    }

    public void makeChoice() throws Exception {
        System.out.println("What would you like to do today?");
        int numInt = 2;
        while (numInt != 3) {
            System.out.println("Select the number that correlates to the desired function.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Cancel");
            System.out.println("4. Delete Account");
            choice = Main.scanner.nextLine();
            numInt = Integer.valueOf(choice);
            if (1 == numInt) {
                System.out.println("Your current account balance is " + customers.get(name)); //***************************** needs to be corrected

            } else if (numInt == 2) {
                System.out.println("How much would you like to withdraw today?");
                String amount = Main.scanner.nextLine();

                int numAmount = Integer.valueOf(amount); //converts to an integer

                //double numAmount = customers.remove(name);

                if (numAmount <= 100000 && numAmount >= 0)
                    System.out.println("Please take your money, and have a great day!");

                else {
                    throw new Exception("That is not a valid withdrawal amount");
                }
            }
            else if (numInt == 3) {
                break;
            }
            else if (numInt == 4) {
                System.out.println("We're sorry to see you go " + name + ".");
                System.out.println("Your account has been removed.");
                customers.remove(name);
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
    public void makeAccount () {
        customers = new HashMap<>();
        customers.put("Hodor", 1000.0);
        customers.put("John S", 2000.0);
        customers.put("Sansa", 0.0);
        customers.put("Bran", 1500.0);
        customers.put("Brianne", 10000.0);
    }
    //public void setAccountBalance () {
      //  balance = new double;

    //}
}


