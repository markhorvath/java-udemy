package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to = " + myString);
        myString = myString + " and this is more.";
        System.out.println("Appended myString is " + myString);
        myString = myString + "\u00a9" + " 2015";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNum = 120.47;
        lastString = lastString + doubleNum;
        System.out.println(lastString);
    }
}
