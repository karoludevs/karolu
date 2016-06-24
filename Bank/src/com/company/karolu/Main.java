package com.company.karolu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        printOptions();
        boolean quit = false;
        do {
            System.out.println("Enter option:");

            switch (scan.nextInt()) {

                case 0:
                    printOptions();
                    break;

                case 1:
                    System.out.println("Please, enter a branch name: ");
                    String branchName = scan.next();
                    new Bank(branchName);
                    break;

                case 2:
                    System.out.println("Please, enter a customer's name: ");
                    String customerName = scan.next();
                    new Branch(customerName);
                    break;

                case 3:
                    System.out.println("Please, enter transaction's name: ");
                    String transactionName = scan.next();
                    new Customers(transactionName).addTransaction();
                    break;

                case 4:
                    showCustomerList();
                    break;

                case 5:
                    addDataValidation();
                    break;

                case 6:
                    System.out.println("Please, enter the transaction customer's name to print:");
                    new Customers(scan.next()).getTransaction();

                    break;

                case 7:
                    quit = true;
                    break;
            }

        } while (!quit);
        {
                System.out.println("Thanks.");
        }
            }

    public static void printOptions(){
        System.out.println("Welcome to the bank. What you wanna do?: " +
                "\n0. Print options." +
                "\n1. Add new branch." +
                "\n2. Add new customer." +
                "\n3. Add transaction." +
                "\n4. Show list of customers." +
                "\n5. Add data validation" +
                "\n6. Hint transactions");
    }




    public static void showCustomerList(){

    }

    public static void addDataValidation(){

    }

    public static void hintTransactions(){

    }
}
