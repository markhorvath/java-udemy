package com.company;

public class Main {

    public static void main(String[] args) {
        // expressions are essentially building blocks of all java programs

        // a mile is equal to 1.609344 kilometers,
        // the xpression below is the variables, values and operators, not the data type double
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if(highScore = 50) {
            System.out.println("This is an expression");
        }

        // Challenge
        int score = 100; // exp = score = 100
        if (score > 90) { // exp = score > 90
            System.out.println("bla blah"); // exp = "bla blah"
            score = 0; // exp = score = 0
        }
    }
}
