package com.company.karolu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sam on 17/06/16.
 */
public class Bank {

    private static Scanner scan = new Scanner(System.in);
    private String name;
    private ArrayList<String> branches;

    public Bank(String name) {
        branches = new ArrayList<String>();
        this.branches.add(name);
    }

}
