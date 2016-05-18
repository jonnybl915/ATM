package com.theironyard.jdblack;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Wells Fargo!");
        System.out.println("What is your name?");
        String name = Main.scanner.nextLine();
        System.out.println("Good Day " + name + "!");

        /*if (name.isEmpty()){
            System.out.println("We're sorry.");
            System.out.println("We do not recognize that name");
        */
        if (name.isEmpty()) {
            throw new Exception ("We do not recognize that name");
        }

        System.out.println("What would you like to do today? [Check Balance/Withdraw Funds/Cancel]");
        String choice = Main.scanner.nextLine();
        if (choice.equalsIgnoreCase("Check Balance")){
            System.out.println(":/ your balance is $100.");
        }
        else if (choice.equalsIgnoreCase("Withdraw Funds")){
            System.out.println("How much would you like to withdraw today?");
            String amount = Main.scanner.nextLine();

            int numInt = Integer.valueOf(amount); //converts to an integer

            if (numInt <= 100 && numInt >= 0) {
                System.out.println("Please take your money, and have a great day!");
            }
            else {
                throw new Exception ("That is not a valid withdrawal amount");
            }
        }
        else if (choice.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again");
        }
    }
}
