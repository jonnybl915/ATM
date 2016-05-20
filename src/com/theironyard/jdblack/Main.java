package com.theironyard.jdblack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Customer customer = new Customer();
    public static void main(String[] args) throws Exception {

            customer.makeAccount();

        while(true) {

            customer.enterName();

        }
    }
}


