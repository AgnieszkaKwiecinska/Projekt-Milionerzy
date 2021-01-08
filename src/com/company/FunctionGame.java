package com.company;

import com.company.Prizes.Prize;
import com.company.Questions.*;
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

    public void displayQuestion() {
        int categoryChoice = scanner.nextInt();
        if (categoryChoice == 1) {
            questions.getQuestion(firstCategory);
        } else if (categoryChoice == 2) {
            questions.getQuestion(secondCategory);
        }
    }

    public void rightAnswer() {
        prize.chooseBox();
        Log.info("Dobra odpowiedź. Twoja nagroda: " + prize.getRoundPrize());
    }

    public void wrongAnswer() {
        Log.info("Zła odpowiedz. Koniec gry, wygrałeś: " + prize.getTotalPrize());
    }

    public void giveUp() {
        Log.info("To była dobra gra! Wygrałeś: " + prize.getTotalPrize());

    }

    public void winning() {
        Log.info("Brawo!! Jesteś Geniuszem!!! Twoja nagroda to: " + prize.getTotalPrize());

    }
}
