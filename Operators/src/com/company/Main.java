package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now " + result);

        result++; // = result = result + 1;
        System.out.println("Result is now " + result);

        result--; // = result = result - 1;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien.");

        int topScore = 100;
        int secondScore = 93;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        // !=, >, <, <=, &&, || seems similar if not same to javascript

        if ((topScore > 90) || (secondScore <= 90))
            System.out.println("One of these tests is true.");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen.");

        // Formula for ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // Challenge
        double dubVar = 20d;
        double dubVar2 = 80d;
        double sumTimes25 = (dubVar + dubVar2) * 25;
        System.out.println("sumTimes25 is " + sumTimes25);
        double remainder = sumTimes25 % 40;
        if(remainder <= 20)
            System.out.println("Remainder " + remainder + " was over the limit!");
    }
}
