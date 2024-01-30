package Controller;

import Model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;
    private int nextId;

    public ContactManager() {
        contacts = new ArrayList<>();
        nextId = 1;
    }

    public void addContact(String name, String group, String address, String phone) {
        String[] names = name.split(" ");
        String firstname = names[0];
        String lastname = names[1];

        Contact contact = new Contact(nextId, name, group, address, phone);
        contacts.add(contact);
        nextId++;

        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        System.out.println("ID\tName\t\tFirst Name\tLast Name\tGroup\tAddress\t\tPhone");
        for (Contact contact : contacts) {
            System.out.println(contact.getId() + "\t" + contact.getFullname() + "\t" + contact.getFullname().split(" ")[0] + "\t\t" +
                    contact.getFullname().split(" ")[1] + "\t\t" + contact.getGroup() + "\t" + contact.getAddress() + "\t" + contact.getPhone());
        }
    }

    public boolean deleteContact(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }
}