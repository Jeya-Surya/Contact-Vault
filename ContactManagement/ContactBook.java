package ContactManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n<---- Contact Book Menu ---->");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = in.nextInt();
            in.nextLine();

            System.out.println();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice");
            }
        }
        while (choice != 5);
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter Phone number: ");
        String phNo = in.nextLine();

        System.out.print("Enter Email: ");
        String email = in.nextLine();

        contacts.add(new Contact(name, phNo, email));
        System.out.println("Contact added!");
    }

    private void viewContacts() {
        if(contacts.isEmpty()){
            System.out.println("No contacts found");
        }
        else{
            contacts.forEach(contact -> System.out.println(contact));
        }
    }

    private void searchContact(){
        System.out.print("Enter the name to search: ");
        String name = in.nextLine();

        contacts.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .forEach(contact -> System.out.println(contact));
    }

    private void  deleteContact(){
        System.out.println("Enter the name to delete: ");
        String name = in.nextLine();

        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));

        System.out.println("Contact deleted if it existed!");
    }
}
