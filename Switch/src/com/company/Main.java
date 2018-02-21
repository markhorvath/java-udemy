package com.company;

public class Main {

    public static void main(String[] args) {
//        int val = 1;
//        if (val == 1) {
//            System.out.println("value was 1");
//        } else if (val == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("value was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 4 or 5");
                System.out.println("actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        // Challenge

        char switchVal = 'C';

        switch (switchVal) {
            case 'A':
                System.out.println("value was a A");
                break;

            case 'B':
                System.out.println("value was a B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(switchVal + " was found");
                break;

            default:
                System.out.println("was not A B C D OR E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println(month.toUpperCase() + " was found");
                break;

            default:
                System.out.println("No month was found");
                break;
        }

    }
}
