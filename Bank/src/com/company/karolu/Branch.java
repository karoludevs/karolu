package com.company.karolu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sam on 17/06/16.
 */
public class Branch {

    private static Scanner scan = new Scanner(System.in);
    private ArrayList<String> customers;


    public Branch(String name) {
        customers = new ArrayList<String>();
        this.customers.add(name);
    }

    public void addCustomer(){
        System.out.println("Please, enter the customer's name:");
        String name = scan.next();
        this.customers.add(name);

    }
}
