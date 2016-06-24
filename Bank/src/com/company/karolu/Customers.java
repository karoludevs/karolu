package com.company.karolu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sam on 17/06/16.
 */
public class Customers {
    private static Scanner scan = new Scanner(System.in);
    private String name;
    private ArrayList<Double> transaction;


    public Customers(String name) {
        transaction = new ArrayList<Double>();
        this.name = name;

    }

    public void addTransaction(){
        System.out.println("Please, enter transaction's type: " +
                "\n1. Ingres." +
                "\n2. Withdrawal." +
                "\n3. Print movements.");
        int chooice = scan.nextInt();
        switch(chooice){
            case 1:
                System.out.println("Amount: ");
                double amount = scan.nextInt();
                if(amount >= 0){
                    System.out.println("Deposit of " + amount + " done.");
                }else{
                    System.out.println("Incorrect amount, try again.");
                }
                this.transaction.add(amount);

            case 2:
                System.out.println("Amount: ");
                double amount2 = scan.nextInt();
                if(amount2 >= 0){
                    System.out.println("Extraction of " + amount2 + " done.");
                }else{
                    System.out.println("Incorrect amount, try again.");
                }
                this.transaction.add(amount2);

            case 3:
                System.out.println("Movements are: ");
        }

    }

    public ArrayList<Double> getTransaction() {

        return transaction;
    }
}
