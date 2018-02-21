package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("$10000 at 2% interest is " + calcInterest(10000, 2.0));

//        // Challenge 1
//        for(int i = 2; i < 9; i++) {
//            System.out.println("$10000 at " + i + "% interest is " + String.format("%.2f", calcInterest(10000, i)));
//        }
//
//        // Challenge 2
//        for(int i = 8; i >= 2; i--) {
//            System.out.println("$10000 at " + i + "% interest is " + String.format("%.2f", calcInterest(10000, i)));
//        }

        int count = 0;

        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("exit for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        // i <= (long) Math.sqrt(n) is much faster than i <= n/2, fewer times thru for loop
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calcInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }

}
