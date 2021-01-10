package com.company;

import com.company.LifeLines.UseLifeLine;
import com.company.Questions.Question;

import java.util.Scanner;

public class Game {
    String username;

    public Game(String username) {
        this.username = username;
    }

    FunctionGame functionGame = new FunctionGame();
    UseLifeLine useLifeLine = new UseLifeLine();

    public void startGame() {
        Log.info("Hey " + username + "\nYou must answer 7 multiple-choice questions correctly in a row to win the jackpot.\n" +
                "You may quit at any time and keep their earnings.\n" +
                "For each question, they are shown the question and four possible answers in advance before deciding whether to play on or not.\n");
        //Log.info("Jeśli chcesz skończyć gre naciśnij 0, jeśli chcesz grać naciśnij 9");
        //int signToBeReady = scanner.nextInt();

//        functionGame.displayGameRules();
        int round = 0;
        boolean hasLost = false;

        while (round < 7 && !hasLost) {
            boolean hasWon = playSingleRound(round);
            hasLost = !hasWon;
            round++;
        }

        if (!hasLost) {
            functionGame.winning();
        }
    }

    public boolean playSingleRound(int round) {
        functionGame.displayCategoryChoice();
        String chosenCategory = functionGame.askForCategory();
        Question generatedQuestion = functionGame.getNextQuestion(chosenCategory);
        functionGame.displayQuestion(generatedQuestion);
        Log.info("5) Użyj koła ratunkowego (jeśli jest aktywne)");
        Log.info("Wybierz odpowiedź: ");
        int userAnswer = functionGame.getUserAnswerForQuestion();
        if(userAnswer == 5) {
            useLifeLine.lifelineChoice(generatedQuestion);
            Log.info("Wybierz odpowiedź: ");
            userAnswer = functionGame.getUserAnswerForQuestion();
        }
        if (generatedQuestion.getRightAnswer() == userAnswer) {
            functionGame.rightAnswer();
            return true;
        } else {
            functionGame.wrongAnswer();
            return false;
        }
    }

    public void endGame() {

    }


}
