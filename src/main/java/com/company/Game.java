package com.company;

import java.util.Scanner;

public class Game {
    String username;

    public Game(String username) {
        this.username = username;
    }

    FunctionGame functionGame = new FunctionGame();
    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        Log.info("Hey " + username + "\nYou must answer 7 multiple-choice questions correctly in a row to win the jackpot.\n" +
                "You may quit at any time and keep their earnings.\n" +
                "For each question, they are shown the question and four possible answers in advance before deciding whether to play on or not.\n");
        //Log.info("Jeśli chcesz skończyć gre naciśnij 0, jeśli chcesz grać naciśnij 9");
        //int signToBeReady = scanner.nextInt();
        playGame();
    }

    public void playGame() {
        functionGame.displayCategoryChoice();
        functionGame.displayQuestion();
        functionGame.getAnswerUser();
        if (functionGame.answerToQuestion() == true) {
            functionGame.rightAnswer();
        } else {
            functionGame.wrongAnswer();
        }
    }

    public void endGame() {

    }


}
