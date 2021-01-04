package com.company.Questions;

import com.company.Log;

public class Weapons extends Questions {
    private void question1() {
        Log.info("Pierwszym polskim karabinem na amunicję 5.45x39mm był: \n");
        Log.info("1) Karabinek wz. 88 'Tantal'\n            2) Karabinek wz. 96 'Beryl'\n");
        Log.info("3) MSBS\n   4) PM 06 'Glauberyt'\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Który z tych frim podjęła się modyfikacji karabinku L85A1?\n");
        Log.info("1) H&K\n           2) Beretta\n");
        Log.info("3) Remington\n    4) FN\n");
    }

    public int answer2() {
        return 1;
    }

    private void question3() {
        Log.info("Skrót MSBS jest od: \n");
        Log.info("1) Mała Strzelecka Broń Samoczynna\n           2) Możliwe Samoodpalenie Bomby Samolotowej\n");
        Log.info("3) Modułowa Stzrelba Bio Selektywna\n           4) Modułowy System Broni Strzeleckiej\n");
    }

    public int answer3() {
        return 4;
    }

    private void question4() {
        Log.info("Jaką amunicją strzela STG 44?\n");
        Log.info("1) 3.17HMR\n           2) 5,7x28mm\n");
        Log.info("3) 7,92x33mm\n           4) 7,62x25mm \n");
    }

    public int answer4() {
        return 3;
    }

    public String toString() {
        return "Weapons";
    }
}
