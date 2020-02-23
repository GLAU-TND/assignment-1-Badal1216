package main;

import definition.ContactList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        while (true) {
            final Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to SRB's Contact List App :");
            System.out.println("Press 1 to add a new contact ");
            System.out.println("Press 2 to view all contacts ");
            System.out.println("Press 3 to search for a contact ");
            System.out.println("Press 4 to delete a contact ");
            System.out.println("Press 5 to exit program ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a person to add the contact list: ");
                    String name = scanner.nextLine();
                    contactList.insertPerson(name);
                    contactList.displayList();
                    System.out.println(contactList);
            }
        }

    }
}
