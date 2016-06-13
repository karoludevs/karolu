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

    public void printGroseryList() {
            if (groceryList.contains(0)) {
                System.out.println("The list is empty");

            } else {
                for (int i = 0; i < groceryList.size(); i++) {
                    System.out.println(i + 1 + ". " + groceryList.get(i) + "\n");

            }
        }
    }

    public String  findGroceryItem(String item){
            int position = groceryList.indexOf(item);
        if(position >= 0){
            return groceryList.get(position);
            }else{
            return null;
        }
    }

    public String modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        return newItem;
    }

    }


