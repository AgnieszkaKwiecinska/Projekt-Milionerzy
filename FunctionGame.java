package com.company;

import com.company.Prizes.Prize;
import com.company.Questions.Questions;

public class FunctionGame {
    Questions questions = new Questions();
    Prize prize = new Prize();


    public String randomCategory() {
        int number;
        number = questions.getRandomNumber();
        return questions.category(number).toString();  //zwraca stringi kategorii
    }

    public void categoryChoice(){
        String firstCategory = randomCategory();
        String secondCategory;
        do {
            secondCategory = randomCategory();
        }while (firstCategory == secondCategory);  //sprawdza czy kategorie nie są takie same, jeśli są losuje dalej aż będzie inne
        Log.info("Choose category: ");
        Log.info("1. " + firstCategory + "\t\t2. " +  secondCategory);
    }

    public void rightAnswer() {
        prize.chooseBox();
        Log.info("Your prize: " + prize.getRoundPrize());
    }

    public void wrongAnswer() {
        Log.info("Wrong answer. This is the end of the game, you won: " + prize.getTotalPrize());
    }
    public void giveUp() {
        Log.info("It was the good game! You won: " + prize.getTotalPrize());

    }

    public void winning() {
        Log.info("Congratulations!!! You are the genius!!! This is your total prize: " + prize.getTotalPrize());

    }
}
