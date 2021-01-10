package milionerzy.Prizes;


import milionerzy.Boxes.*;
import milionerzy.Log;

import java.util.ArrayList;
import java.util.Scanner;

public class Prize {
    BoxOne one = new BoxOne();
    BoxTwo two = new BoxTwo();
    BoxThree three = new BoxThree();
    BoxFour four = new BoxFour();
    BoxFive five = new BoxFive();
    BoxSix six = new BoxSix();
    BoxSeven seven = new BoxSeven();
    BoxEight eight = new BoxEight();
    BoxNine nine = new BoxNine();
    BoxTen ten = new BoxTen();

    private boolean check = false;

    private ArrayList<Integer> usedBoxes = new ArrayList();


    private int NumberOfBox = 0;
    private int RoundPrize = 0;
    private int TotalPrize = 0;
    Scanner scanner = new Scanner(System.in);

    private boolean checkIfUsedThisBox() {
        for (int i = 0; i < usedBoxes.size(); i++) {
            if (usedBoxes.get(i) == NumberOfBox) {
                this.check = true;
                break;
            } else this.check = false;
        }
        return this.check;
    }

    public void chooseBox() {
        do {
            Log.info("Choose box: ");
            NumberOfBox = scanner.nextInt();
        } while (NumberOfBox < 0 || NumberOfBox > 10 || checkIfUsedThisBox() == true);
    }

    public int getRoundPrize() {


        switch (NumberOfBox) {
            case 1:
                RoundPrize = one.randomPrizeMoney();
                break;
            case 2:
                RoundPrize = two.randomPrizeMoney();
                break;
            case 3:
                RoundPrize = three.randomPrizeMoney();
                break;
            case 4:
                RoundPrize = four.randomPrizeMoney();
                break;
            case 5:
                RoundPrize = five.randomPrizeMoney();
                break;
            case 6:
                RoundPrize = six.randomPrizeMoney();
                break;
            case 7:
                RoundPrize = seven.randomPrizeMoney();
                break;
            case 8:
                RoundPrize = eight.randomPrizeMoney();
                break;
            case 9:
                RoundPrize = nine.randomPrizeMoney();
                break;
            case 10:
                this.RoundPrize = ten.randomPrizeMoney();
                break;
        }

        usedBoxes.add(NumberOfBox);
        TotalPrize += RoundPrize;
        return RoundPrize;
    }

    public int getTotalPrize() {
        return TotalPrize;
    }


}
