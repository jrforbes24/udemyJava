package com.jrf;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String myPlayerName = "BigBadJohn";
        score = 1000;

        int thePlace = calculateHighScorePosition(score);
        displayHighScorePosition(myPlayerName, thePlace);

        score = 501;
        thePlace = calculateHighScorePosition(score);
        displayHighScorePosition(myPlayerName, thePlace);

        score = 105;
        thePlace = calculateHighScorePosition(score);
        displayHighScorePosition(myPlayerName, thePlace);

        score = 50;
        thePlace = calculateHighScorePosition(score);
        displayHighScorePosition(myPlayerName, thePlace);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static int calculateHighScorePosition(int theScore) {
        if(theScore >= 1000){
            return 1;
        } else if (theScore >= 500){
            return 2;
        } else if (theScore >= 100){
            return 3;
        } else  {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playerName, int place){
        System.out.println(playerName + " your position is " + place + " on the high score table.");
    }
}
