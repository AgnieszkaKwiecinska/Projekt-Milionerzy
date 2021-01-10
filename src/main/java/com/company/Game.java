package com.company;

import com.company.LifeLines.Lifebuoys;
import com.company.Questions.Question;

public class Game {
    String username;

    public Game(String username) {
        this.username = username;
    }

    FunctionGame functionGame = new FunctionGame();
    Lifebuoys useLifeLine = new Lifebuoys();

    public void startGame() {
        functionGame.displayGameRules();
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
        if (userAnswer == 5) {
            useLifeLine.lifelineChoice(generatedQuestion);
            Log.info("Wybierz odpowiedź: ");
            userAnswer = functionGame.getUserAnswerForQuestion();
        }
        if (userAnswer == 9) {
            functionGame.giveUp();
            return false;
        } else if (generatedQuestion.getRightAnswer() == userAnswer) {
            functionGame.rightAnswer();
            return true;
        } else {
            functionGame.wrongAnswer();
            return false;
        }
    }
}
