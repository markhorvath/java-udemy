package com.company;

public class Main {

    public static void main(String[] args) {
        // This is just the default constructor called
        //Account myAcct = new Account();

        Account myAcct = new Account("12345", 2000, "Tim Tool", "tt@gmail.com",
                "202-555-1234");

        myAcct.withdrawFunds(100);
        myAcct.depositFunds(1250);
        myAcct.withdrawFunds(5000);
        System.out.println(myAcct.getName());
        System.out.println(myAcct.getEmail());
    }
}
