package ArrayListChallenge;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("0724702616");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Enter action! (press 6 to check possible actions)");
            int action = Integer.valueOf(scanner.next());

            switch (action) {
                case 0:
                    quit = true;
                    System.out.println("Phone shutting down...");
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeExistingContact();
                    break;
                case 5:
                     checkForContact();
                     break;
                case 6:
                     printActions();
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Input name for new contact: ");
        String name = scanner.next();
        System.out.println("Input the new contact's phone number: ");
        String phoneNumber = scanner.next();
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        myPhone.addContact(newContact);
        System.out.println("Contact added: " + name + ", " + phoneNumber);
    }

    private static void updateExistingContact(){
        System.out.println("Input name for new contact: ");
        String name = scanner.next();
        Contacts existingContactRecord = myPhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Input name for new contact: ");
        String newName = scanner.next();
        System.out.println("Input the new contact's phone number: ");
        String phoneNumber = scanner.next();

        Contacts newContact = Contacts.createContact(name, phoneNumber);

        myPhone.updateContact(existingContactRecord, newContact);
    }

    private static void removeExistingContact(){
        System.out.println("Input name for contact to be removed: ");
        String name = scanner.next();
        Contacts existingContactRecord = myPhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found!");
            return;
        }
        if(myPhone.removeContact(existingContactRecord)){
            System.out.println("Contact succesfully removed!");
        } else {
            System.out.println("Error deleting contact!");
        }
    }

    private static void checkForContact(){
        System.out.println("Input name for contact to be removed: ");
        String name = scanner.next();
        Contacts existingContactRecord = myPhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found!");
            return;
        }

        System.out.println(existingContactRecord.getName() + "'s phone number is: " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("Available actions: ");
        System.out.println("Press 0 to shut down.");
        System.out.println("Press 1 to print the list of contacts.");
        System.out.println("Press 2 to add a contact.");
        System.out.println("Press 3 to update an existing contact.");
        System.out.println("Press 4 to remove an existing contact.");
        System.out.println("Press 5 to check if a contact exists.");
        System.out.println("Press 6 to print the list of possible actions.");
    }

}
