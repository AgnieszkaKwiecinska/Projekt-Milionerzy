package com.company;

import com.company.LifeLines.LifeLineFunction;
import com.company.Questions.Question;

public class Game {
    String username;

    public Game(String username) {
        this.username = username;
    }

    GameFunction gameFunction = new GameFunction();
    LifeLineFunction lifeLineFunction = new LifeLineFunction();

    public void startGame() {
        Log.info("Witaj " + this.username + "!!!");
        gameFunction.displayGameRules();
        int round = 0;
        boolean hasLost = false;

        while (round < 7 && !hasLost) {
            boolean hasWon = playSingleRound(round);
            hasLost = !hasWon;
            round++;
        }

        if (!hasLost) {
            gameFunction.winning();
        }
    }

    public boolean playSingleRound(int round) {
        gameFunction.displayCategoryChoice();
        String chosenCategory = gameFunction.askForCategory();
        Question generatedQuestion = gameFunction.getNextQuestion(chosenCategory);
        gameFunction.displayQuestion(generatedQuestion);
        Log.info("5) Użyj koła ratunkowego (jeśli jest aktywne)");
        Log.info("9) Zakończ grę");
        Log.info("Wybierz odpowiedź: ");
        int userAnswer = gameFunction.getUserAnswerForQuestion();
        if (userAnswer == 5) {
            lifeLineFunction.lifelineChoice(generatedQuestion);
            Log.info("Wybierz odpowiedź: ");
            userAnswer = gameFunction.getUserAnswerForQuestion();
        }
        if (userAnswer == 9) {
            gameFunction.giveUp();
            return false;
        } else if (generatedQuestion.getRightAnswer() == userAnswer) {
            gameFunction.rightAnswer();
            return true;
        } else {
            gameFunction.wrongAnswer();
            return false;
        }
    }
}
