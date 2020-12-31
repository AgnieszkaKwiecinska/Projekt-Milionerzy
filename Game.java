package milionerzy;

import milionerzy.Prizes.Prize;


public class Game {

    Prize prize = new Prize();

    public void startGame() {
        Log.info("You must answer 7 multiple-choice questions correctly in a row to win the jackpot.\n" +
                "You may quit at any time and keep their earnings.\n" +
                "For each question, they are shown the question and four possible answers in advance before deciding whether to play on or not.\n");
    }

    public void rightAnswer() {
        prize.chooseBox();
        Log.info("Your prize: " + prize.getRoundPrize());
    }

    public void wrongAnswer() {
        Log.info("Wrong answer. This is the end of the game, you won: " + prize.getTotalPrize());
    }

    public void endGame() {

    }

    public void giveUp() {
        Log.info("It was the good game! You won: " + prize.getTotalPrize());

    }

    public void winning() {
        Log.info("Congratulations!!! You are the genius!!! This is your total prize: " + prize.getTotalPrize());

    }

}