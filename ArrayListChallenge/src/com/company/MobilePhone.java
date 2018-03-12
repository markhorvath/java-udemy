package com.company;


import java.util.ArrayList;

public class MobilePhone {
    private String myNum;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNum, ArrayList<Contact> myContacts) {
        this.myNum = myNum;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                System.out.println("Contact " + contactName + " already exists.");
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List: ");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    // Try using myContacts[i] here instead to see if it works
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNum());
        }
    }
}
