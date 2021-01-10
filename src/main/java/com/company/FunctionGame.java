package com.company;

import com.company.LifeLines.Audience;
import com.company.LifeLines.CallToFriend;
import com.company.LifeLines.Fifty_fifty;
import com.company.LifeLines.LifeLines;
import com.company.Prizes.Prize;
import com.company.Questions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionGame {
    Scanner scanner = new Scanner(System.in);
    Questions questions = new Questions();
    Audience audience = new Audience();
    CallToFriend callToFriend = new CallToFriend();
    Fifty_fifty fifty_fifty = new Fifty_fifty();
    Prize prize = new Prize();
    private ArrayList<LifeLines> lifelines = new ArrayList<>();
    private String firstCategory, secondCategory;
    private int answerUser;

    public void addLifeLine() {
        lifelines.clear();
        if (audience.active()) {
            lifelines.add(audience);
        }
        if (callToFriend.active()) {
            lifelines.add(callToFriend);
        }
        if (fifty_fifty.active()) {
            lifelines.add(fifty_fifty);
        }
    }

    public void activeLifeLines() {
        Log.info("Active milionerzy.LifeLines: ");
        int i = 0;
        for (LifeLines lifeline : lifelines) {
            Log.info(i + ". " + lifeline.name());
            i++;
        }
    }

    public void lifelineChoice() {
        addLifeLine();
        if (lifelines.isEmpty()) {
            Log.info("You don't have any milionerzy.LifeLines left :(");
        } else {
            activeLifeLines();
            int chosenLifeLine;
            String userChoice;
            do {
                Log.info("Choose your LifeLine: ");
                chosenLifeLine = scanner.nextInt();
            } while (chosenLifeLine >= lifelines.size() || chosenLifeLine < 0);
            userChoice = lifelines.get(chosenLifeLine).name();

            if (userChoice.equals("Audience")) {
                audience.use();
                Log.info("cos sie stanie 1");
            }
            if (userChoice.equals("CallToFriend")) {
                callToFriend.use();
                Log.info("cos sie stanie 2");
            }
            if (userChoice.equals("FiftyFifty")) {
                fifty_fifty.use();
                Log.info("cos sie stanie 3");
            }
        }

    }

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

    public void getAnswerUser() {
        answerUser = scanner.nextInt();
    }

    public boolean answerToQuestion() {
        boolean respond = true;
        return respond;
    }

    public void rightAnswer() {
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
}
