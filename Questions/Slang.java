package com.company.Questions;

import com.company.Log;

public class Slang extends Questions {

    private void question1() {
        Log.info("Jakie słowo w 2019 roku wygrało w konkursie PWN?\n");
        Log.info("1) Jesieniara\n  2) Eluwina\n");
        Log.info("3) Dzban\n      4) Alternatywka\n");
    }

    public int answer1() {
        return 4;
    }

    private void question2() {
        Log.info("Co znaczy słowo 'masny'?\n");
        Log.info("1) osoba głupia, robiąca coś głupiego \n2) coś bardzo dobrego, grubego \n");
        Log.info("3) osoba ubierająca się specyficznie \n4) osoba bogata, próżna \n");
    }

    public int answer2() {
        return 2;
    }

    private void question3() {
        Log.info("Co znaczy słowo 'boomer'?\n");
        Log.info("1) ironiczna nazwa osoby starszej \n2) śmieszna sytuacja  \n");
        Log.info("3) impreze \n4) modny, ciekawy  \n");
    }

    public int answer3() {
        return 1;
    }

    private void question4() {
        Log.info("Co znaczy słowo 'sztywniutko'?\n");
        Log.info("1) bez sensu \n2) zgodnie z planem  \n");
        Log.info("3) za póżno \n4) coś sztywnego, nudnego  \n");
    }

    public int answer4() {
        return 2;
    }

    public String toString() {
        return "Slang";
    }

}
