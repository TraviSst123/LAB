package Controller;

import Model.Contact;
import Model.PhoneNumberValidator;
import View.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu {

    private ContactManager contactManager;

    public MainMenu() {
        super("Contact Management Program", new String[]{"Add a contact", "Display all contacts", "Delete a contact", "Exit"});
        contactManager = new ContactManager();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                addContact();
                break;
            case 2:
                displayContacts();
                break;
            case 3:
                deleteContact();
                break;
            case 4:
                System.out.println("Exiting the program...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter group: ");
        String group = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        if (!PhoneNumberValidator.isValidPhoneNumber(phone)) {
            System.out.println("Invalid phone number. Please enter a valid phone number.");
            return;
        }

        contactManager.addContact(name, group, address, phone);
    }

    private void displayContacts() {
        contactManager.displayContacts();
    }

    private void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();

        if (contactManager.deleteContact(id)) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("No contact found with the given ID.");
        }
    }
}