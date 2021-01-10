import milionerzy.Log;

import java.util.Scanner;

public class Game {
    FunctionGame functionGame = new FunctionGame();
    String username;
    Scanner scanner = new Scanner(System.in);
    private void username() {
        System.out.println("Enter username:   ");
        username = scanner.nextLine();
    }

    public void startGame() {
        username();
        Log.info("Hey " + username + "\nYou must answer 7 multiple-choice questions correctly in a row to win the jackpot.\n" +
                "You may quit at any time and keep their earnings.\n" +
                "For each question, they are shown the question and four possible answers in advance before deciding whether to play on or not.\n");
        Log.info("if you ready enter '1', if you want to quit enter '0'");
        int signToBeReady = scanner.nextInt();
        if (signToBeReady == 1){
            playGame();
        }else if (signToBeReady == 0){
            Log.info("You quit");
        }
    }
    public void playGame(){
        functionGame.categoryChoice();
    }
    public void endGame() {

    }


}
