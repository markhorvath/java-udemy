package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 50;
        short myShort = 20;
        int myInt = 10;
        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("Long value is " + longTotal);
        System.out.println("Short value is " + shortTotal);

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("My total: " + myTotal);

        // byte has a width of 8, -128 to 127
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("My new byte value: " + myNewByteValue);

        // short has a width of 16, -32768 to 32767
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("My new short value: " + myNewShortValue);

        // long has a width of 64, 2 to the power of 63 is the max
        long myLongValue = 9_223_372_036_854_775_807L;
    }
}
