package com.company;

import com.company.LifeLines.Audience;
import com.company.LifeLines.CallToFriend;
import com.company.LifeLines.Fifty_fifty;
import com.company.LifeLines.LifeLines;
import com.company.Prizes.Prize;
import com.company.Questions.Question;
import com.company.Questions.Questions;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionGame {
    Scanner scanner = new Scanner(System.in);
    Questions questions = new Questions();
    Audience audience = new Audience();
    CallToFriend callToFriend = new CallToFriend();
    Fifty_fifty fifty_fifty = new Fifty_fifty();
    Prize prize = new Prize();
    Random rand = new Random();
    private ArrayList<LifeLines> lifelines = new ArrayList<>();
    private String firstCategory, secondCategory;

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
        Log.info("Aktywne koła ratunkowe: ");
        int i = 0;
        for (LifeLines lifeline : lifelines) {
            Log.info(i + ". " + lifeline.name());
            i++;
        }
    }

    public void lifelineChoice(Question generatedQuestion) {
        addLifeLine();
        if (lifelines.isEmpty()) {
            Log.info("Nie posiadasz więcej kół ratunkowych :(");
        } else {
            activeLifeLines();
            int chosenLifeLine;
            String userChoice;
            do {
                Log.info("Wybierz koło ratunkowe: ");
                chosenLifeLine = scanner.nextInt();
            } while (chosenLifeLine >= lifelines.size() || chosenLifeLine < 0);
            userChoice = lifelines.get(chosenLifeLine).name();

            if (userChoice.equals("Publiczność")) {
                audience.use();
                useAudience(generatedQuestion);
            }
            if (userChoice.equals("Telefon do przyjaciela")) {
                callToFriend.use();
                useCallToFriend(generatedQuestion);
            }
            if (userChoice.equals("50/50")) {
                fifty_fifty.use();
                useFiftyFifty(generatedQuestion);
            }
        }

    }

    public void useAudience(Question generatedQuestion) {
        Log.info(generatedQuestion.getContent());
        for (int i = 0; i < generatedQuestion.getAnswers().size(); i++) {
            int questionNumber = i + 1;
            String answerContent = generatedQuestion.getAnswers().get(i);
            if(questionNumber == generatedQuestion.getRightAnswer()){
                Log.info("" + questionNumber + ") " + answerContent + "  <-- WYBÓR PUBLICZNOŚCI");
            } else
            Log.info("" + questionNumber + ") " + answerContent);
        }
        Log.info();
    }

    public void useCallToFriend(Question generatedQuestion) {
        Log.info(generatedQuestion.getContent());
        int friendChoice = rand.nextInt(4);
        for (int i = 0; i < generatedQuestion.getAnswers().size(); i++) {
            int questionNumber = i + 1;
            String answerContent = generatedQuestion.getAnswers().get(i);
            if(questionNumber == friendChoice){
                Log.info("" + questionNumber + ") " + answerContent + "  <-- WYBÓR PRZYJACIELA");
            } else
                Log.info("" + questionNumber + ") " + answerContent);
        }
        Log.info();
    }

    public void useFiftyFifty(Question generatedQuestion){
        Log.info(generatedQuestion.getContent());

            if(generatedQuestion.getRightAnswer() == 4) {
                Log.info("" + (generatedQuestion.getRightAnswer() - 1) + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer()));
                Log.info("" + generatedQuestion.getRightAnswer() + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer()+1));
            }
            else{
                Log.info("" + generatedQuestion.getRightAnswer() + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer()-1));
                Log.info("" + (generatedQuestion.getRightAnswer() + 1) + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer()));
            }
            Log.info();
        }



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
