package com.company;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;


    public Account() {
        // the this statement below is optional and used for cases where you want to be sure
        // that the class is created with all the fields set, essentially just defaults
        // also, this when used in constructors has to be the very first line
        this("41345", 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Account(String name, String email, String phone) {
        this("99999", 100.55, name, email, phone);
    }

    public Account(String number, double balance, String name, String email, String phone) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposited $" + String.format("%.2f", deposit) + " successfully.  New balance is $"
                + String.format("%.2f", this.balance));
    }

    public void withdrawFunds(double withdrawal) {
        if(balance - withdrawal >= 0.00) {
            this.balance -= withdrawal;
            System.out.println("Withdrew $" + String.format("%.2f", withdrawal) + " successfully.  New balance is $" +
                    String.format("%.2f", this.balance));
        } else {
            System.out.println("Withdrawl of $" + String.format("%.2f", withdrawal) + " exceeds balance of $" +
                    String.format("%.2f", this.balance) + ".  Unable to process.");
        }

    }





}
