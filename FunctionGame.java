package milionerzy;

import milionerzy.LifeLines.*;
import milionerzy.Prizes.Prize;
import milionerzy.Questions.Questions;

import java.util.Scanner;
import java.util.ArrayList;

public class FunctionGame {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<LifeLines> lifelines = new ArrayList<>();
    Questions questions = new Questions();
    Prize prize = new Prize();
    Audience audience = new Audience();
    CallToFriend callToFriend = new CallToFriend();
    Fifty_fifty fifty_fifty = new Fifty_fifty();

    public void addLifeLine() {
        lifelines.clear();
        if(audience.active()) {
            lifelines.add(audience);
        }
        if(callToFriend.active()) {
            lifelines.add(callToFriend);
        }
        if(fifty_fifty.active()) {
            lifelines.add(fifty_fifty);
        }
    }

    public void activeLifeLines() {
        Log.info("Active LifeLines: ");
        int i = 0;
        for(LifeLines lifeline: lifelines) {
                Log.info(i + ". " + lifeline.name());
                i++;
        }
    }

    public void lifelineChoice(){
        addLifeLine();
        if(lifelines.isEmpty()){
            Log.info("You don't have any LifeLines left :(");
        }
        else {
            activeLifeLines();
            int chosenLifeLine;
            String userChoice;
            do {
                Log.info("Choose your LifeLine: ");
                chosenLifeLine = scanner.nextInt();
            } while (chosenLifeLine >= lifelines.size() || chosenLifeLine < 0);
            userChoice = lifelines.get(chosenLifeLine).name();

            if(userChoice.equals("Audience")) {
                audience.use();
                Log.info("cos sie stanie 1");
            }
            if(userChoice.equals("CallToFriend")) {
                callToFriend.use();
                Log.info("cos sie stanie 2");
            }
            if(userChoice.equals("FiftyFifty")) {
                fifty_fifty.use();
                Log.info("cos sie stanie 3");
            }
        }

    }

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
