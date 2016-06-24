package com.company.karolu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Contacts contactList = new Contacts();

        boolean quit = false;

        while(!quit) {

            System.out.println("Options menu, press: \n1. To quit" +
                    "                                \n2. To print lists of contacts" +
                    "                                \n3. To add new contact" +
                    "                                \n4. To Update existing contact" +
                    "                                \n5. To remove contact" +
                    "                                \n6. To search a contact" +
                    "                                \nEnter: ");

            switch (scan.nextInt()) {

                case 1:
                    quit = true;
                    break;
                case 2:
                    contactList.printContactList();
                    break;
                case 3:
                    contactList.addNewContact();
                    break;
                case 4:
                    contactList.updateContact();
                    break;
                case 5:
                    contactList.removeContact();
                    break;
                case 6:
                    contactList.searchContact();
                    break;
                }

            }

        }


}
