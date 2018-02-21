package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Mark", 1200);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(13, 1);
        calcFeetAndInchesToCentimeters(72);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player unknown scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Player Score");
        return 0;
    }

    //Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = ((feet * 12) + inches);
            double centimeters = totalInches * 2.54;
            System.out.println("Value in centimeters is " + centimeters);
            return centimeters;
        } else {
            System.out.println("invalid parameter");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            // could just use double feet = (int) inches / 12;
            double feet = Math.round((inches/12) - 0.5);
            System.out.println(feet + " feet in " + inches + " inches.");
            double newInches = inches - (feet * 12);
            return calcFeetAndInchesToCentimeters(feet, newInches);
        } else return -1;
    }


}
