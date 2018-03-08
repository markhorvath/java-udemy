package com.company;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNum;

    public Contacts(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static Contact createContact(String name, String phoneNum) {
        return new Contact(name, phoneNum);
    }
}
