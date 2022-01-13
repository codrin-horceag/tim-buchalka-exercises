package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();

    Scanner scanner = new Scanner(System.in);
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contacts>();
    }

    public boolean addContact(Contacts contact){
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public void printContacts() {
        for(int i = 0; i < contactList.size(); i++){
            System.out.println((i+1) + ". " + contactList.get(i));
        }
    }

    private int findContact(Contacts contact){
        int position = contactList.indexOf(contact);
        return position;
    }

    private int findContact(String contactName){
        for(int i = 0; i < contactList.size(); i++){
            Contacts contact = contactList.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.contactList.get(position);
        }
        return null;
    }


    public boolean removeContact(Contacts contact){
        if(findContact(contact) >= 0){
            System.out.println("Contact " + contact.getName() + " was deleted!");
            this.contactList.remove(contact);
            return true;
        } else {
            System.out.println("Contact " + contact.getName() + " not found!");
            return false;
        }
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " not found!");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }


}
