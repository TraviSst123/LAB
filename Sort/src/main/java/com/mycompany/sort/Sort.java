
package com.mycompany.sort;

import View.Menu;
import Controller.NumberMenu;

public class Sort {
    public static void main(String[] args) {
        Menu menu = new NumberMenu();
        int choice;
        do {
            menu.display();
            choice = menu.getUserChoice();
            menu.execute(choice);
        } while (choice != 0);
        System.out.println("Exiting program...");
    }
}