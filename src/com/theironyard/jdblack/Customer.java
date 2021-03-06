package com.theironyard.jdblack;

import com.theironyard.jdblack.Main;

/**
 * Created by jonathandavidblack on 5/18/16.
 */
import java.util.HashMap;

public class Customer {
    String name;
    String choice;
    Double balance;
    Double amount;

    public Customer(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public void enterName() throws Exception {
        System.out.println("Welcome to Wells Fargo!");
        System.out.println("What is your name?");
        name = Main.scanner.nextLine(); //need to store it in a variable,

        if (name.isEmpty()) {
            throw new Exception("We do not recognize that name");
        }

        if (Main.customers.containsKey(name)){
            System.out.println("Welcome, " + name);
        }

        else {
            System.out.println("Name not recognized, would you like to open an account? [Y/N]");
            String entry = Main.scanner.nextLine();
            if (entry.equalsIgnoreCase("Y")){
                System.out.println("Great " + name + ", Your account has been created.");
                System.out.println(" ");
                System.out.println("The sign-up bonus amount of $200 has been deposited into your account!");
                System.out.println(" ");
                Main.customers.put(name, 200.0);
            }

            else if (entry.equalsIgnoreCase("N")){
                System.out.println("We're sorry we couldn't be of service today.");
            }

            else {
                return;
            }
        }
    }

    public void makeChoice() throws Exception {
        System.out.println("What would you like to do today?");
        System.out.println(" ");
        int numInt = 0;
        while (numInt != 3) {
            System.out.println("Select the number that correlates to the desired function.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Cancel");
            System.out.println("4. Delete Account");
            choice = Main.scanner.nextLine();
            numInt = Integer.valueOf(choice);

            if (numInt == 1) {
                System.out.println("Your current account balance is " + Main.customers.get(name));

            } else if (numInt == 2) {
                System.out.println("How much would you like to withdraw today?");
                String amount = Main.scanner.nextLine();
                double numAmount = Double.valueOf(amount);
                double newNumAmount = ((Main.customers.get(name)) - numAmount);
                Main.customers.put(name, newNumAmount);
                System.out.println(Main.customers.get(name));

                if(((Main.customers.get(name)) - numAmount) < 0) {
                    throw new Exception("Sorry Brother");
                }
                else {
                    Main.customers.put(name, newNumAmount);
                }

//                while(!(numAmount < Main.customers.get(name) && numAmount >= 0)) {
//                    System.out.println("That is not a valid withdrawal amount.");
//                    System.out.println("Please select a different amount.");
//                    String amount2 = Main.scanner.nextLine();
//                    double numAmount2 = Double.valueOf(amount2);
//                    double newNewNumAmount = ((Main.customers.get(name)) - numAmount2);
//                    Main.customers.put(name, newNewNumAmount);
//
//                }
                System.out.println("Please remove your money.");
               // double newNumAmount = new double

            }

            else if (numInt == 3) {
                break;
            }

            else if (numInt == 4) {
                System.out.println("We're sorry to see you go " + name + ".");
                System.out.println(" ");
                System.out.println("Your account has been removed.");
                System.out.println(" ");
                Main.customers.remove(name);
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
    public static void makeAccount () {
        Main.customers = new HashMap<>();
        Main.customers.put("Hodor", 1000.0);
        Main.customers.put("John S", 2000.0);
        Main.customers.put("Sansa", 0.0);
        Main.customers.put("Bran", 1500.0);
        Main.customers.put("Brianne", 10000.0);
    }

}


