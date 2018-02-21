package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A1';
        System.out.println("My unicode char is " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // Challenge
        char regSymbol = '\u00AE';
        System.out.println("Registered symbol is " + regSymbol);
    }
}
