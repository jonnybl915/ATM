package com.theironyard.jdblack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Customer customer = new Customer();
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Wells Fargo!");

        customer.enterName();
        customer.makeChoice();

    }
}


   /* HashMap<String, Double> customers = new HashMap<>();
customers.put("Hodor", 1000.0);
        customers.put("John S", 2000.0);
        customers.put("Sansa", 0.0);
        customers.put("Bran", 1500.0);
        customers.put("Brianne", 10000.0); */
