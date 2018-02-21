package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Final score is " + highScore);
//
//        score = 10000;
//        levelCompleted = 5;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Final score is " + highScore);
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("mark", position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("jenny", position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("carol", position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("tom", position);

    }

    // Challenge
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if(score >= 500 && score < 1000) {
            return 2;
        } else if(score >= 100 && score < 500) {
            return 3;
        } else return 4;
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.printf("Player %s got into position %d on the high score table%n", playerName, scorePosition);
    }

}
