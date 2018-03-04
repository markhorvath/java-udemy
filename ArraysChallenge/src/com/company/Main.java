package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }
        int[] sorted = sortDesc(myIntegers);
        printArray(sorted);

    }


    public static int[] sortDesc(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
//        Arrays.sort(array, Collections.reverseOrder());
//        return array;
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    System.out.println("temp value is " + temp);
                    sortedArray[i] = sortedArray[i+1];
                    System.out.println("sortedArray[i] value is now " + sortedArray[i]);
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element i is " + i + " with a value of " + array[i]);
        }
    }
}
