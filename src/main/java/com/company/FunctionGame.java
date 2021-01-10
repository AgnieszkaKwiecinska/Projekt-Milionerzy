package com.company;


import com.company.Prizes.Prize;
import com.company.Questions.Question;
import com.company.Questions.Questions;

import java.util.Scanner;

public class FunctionGame {
    Scanner scanner = new Scanner(System.in);
    Questions questions = new Questions();
    Prize prize = new Prize();
    private String firstCategory, secondCategory;


    public void displayCategoryChoice() {
        firstCategory = questions.getRandomCategory();
        do {
            secondCategory = questions.getRandomCategory();
        } while (firstCategory.equals(secondCategory));
        Log.info("Wybierz kategorie: ");
        Log.info("1. " + firstCategory + "\t\t2. " + secondCategory);
    }

    public void displayQuestion(Question generatedQuestion) {
        Log.info(generatedQuestion.getContent());
        for (int i = 0; i < generatedQuestion.getAnswers().size(); i++) {
            int questionNumber = i + 1;
            String answerContent = generatedQuestion.getAnswers().get(i);
            Log.info("" + questionNumber + ") " + answerContent);
        }
        Log.info();
    }

    public void rightAnswer() {
        Log.info("Brawo!!! Dobra Odpowiedź.");
        prize.chooseBox();
        Log.info("Twoja nagroda: " + prize.getRoundPrize());
    }

    public void wrongAnswer() {
        Log.info("Zła odpowiedz. Koniec gry, wygrałeś: " + prize.getTotalPrize());
    }

    public void giveUp() {
        Log.info("Wygrałeś: " + prize.getTotalPrize());

    }

    public void winning() {
        Log.info("Brawo!! Jesteś Geniuszem!!! Twoja nagroda to: " + prize.getTotalPrize());

    }

    public String askForCategory() {
        String category = null;
        do {
            int categoryChoice = scanner.nextInt();
            if (categoryChoice == 1) {
                category = firstCategory;
            } else if (categoryChoice == 2) {
                category = secondCategory;
            } else {
                Log.info("Inna wartosc");
            }
        } while (category == null);

        return category;
    }

    public Question getNextQuestion(String chosenCategory) {
        return questions.getQuestion(chosenCategory);
    }

    public int getUserAnswerForQuestion() {
        int answerToQestion;
        answerToQestion = scanner.nextInt();
        return answerToQestion;
    }
}
