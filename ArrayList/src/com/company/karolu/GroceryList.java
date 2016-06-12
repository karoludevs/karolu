package com.company.karolu;

import java.util.ArrayList;

/**
 * Created by sam on 11/06/16.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList <String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println("You have added an item.");
    }

    public void showGroseryList(){
        groceryList.get()
    }
}
