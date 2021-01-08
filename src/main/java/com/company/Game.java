package com.company;

import java.util.Scanner;

public class Game {
    String username;
    public Game(String username){
        this.username = username;
    }
    FunctionGame functionGame = new FunctionGame();
    Scanner scanner = new Scanner(System.in);


    public void startGame() {
        Log.info("Hey " + username + "\nYou must answer 7 multiple-choice questions correctly in a row to win the jackpot.\n" +
                "You may quit at any time and keep their earnings.\n" +
                "For each question, they are shown the question and four possible answers in advance before deciding whether to play on or not.\n");
        //Log.info("Jeśli jesteś gotowy naciśnij '1', jeśli nie, naciśnij '0'");
        playGame();
        /*int signToBeReady = scanner.nextInt();
        if (signToBeReady == 1){
            playGame();
        }else if (signToBeReady == 0){
            Log.info("You quit");
        }*/
    }
    public void playGame(){
        functionGame.displayCategoryChoice();
        functionGame.displayQuestion();
    }
    public void endGame() {

    }


}
