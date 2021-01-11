package com.company.LifeLines;

import com.company.Log;
import com.company.Questions.Question;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LifeLineFunction {
    Scanner scanner = new Scanner(System.in);
    Audience audience = new Audience();
    CallToFriend callToFriend = new CallToFriend();
    Fifty_fifty fifty_fifty = new Fifty_fifty();
    Random rand = new Random();
    private ArrayList<LifeLines> lifelines = new ArrayList<>();


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
        int friendChoice = rand.nextInt(4) + 1;
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
            Log.info("" + (generatedQuestion.getRightAnswer() - 1) + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer() - 2));
            Log.info("" + generatedQuestion.getRightAnswer() + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer() - 1));
        }
        else{
            Log.info("" + generatedQuestion.getRightAnswer() + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer() - 1));
            Log.info("" + (generatedQuestion.getRightAnswer() + 1) + ") " + generatedQuestion.getAnswers().get(generatedQuestion.getRightAnswer()));
        }
        Log.info();
    }

}
