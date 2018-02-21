package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while(count != 6) {
//            System.out.println("Count is " + count);
//            count++;
//        }
//
//        count = 6;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        // Challenge 2

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            count++;
            System.out.println("Even number " + number);

            if(count == 5) {
                break;
            }
        }
        System.out.println(count + " even numbers found.");
    }

    // Challenge 1

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else return false;
    }
}
