package com.company.Questions;

import com.company.Log;

public class CyberPunk extends Questions {
    private void question1() {
        Log.info("Który z regionów gry jest podmiejski?\n");
        Log.info("1) Heywood\n            2) Westbrook\n");
        Log.info("3) Watson\n   4) Pacyfika\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Kiedy wyszedł pierwszy numer komiksu Cyberpunk 2077: Trauma Team?\n");
        Log.info("1) We wrześniu 2020 roku\n           2) W styczniu 2013 roku \n");
        Log.info("3) W kwietniu 2020 roku \n    4) W maju 2012 roku  \n");
    }

    public int answer2() {
        return 1;
    }

    private void question3() {
        Log.info("Kto był związany z Alt Cunningham i Rogue?\n");
        Log.info("1) Henry\n           2) Dexter DeShawn \n");
        Log.info("3) Narayan Isamu \n    4) Johnny Silverhand \n");
    }

    public int answer3() {
        return 4;
    }

    private void question4() {
        Log.info("W którym roku wyszła gra Cyberpunk 2020?\n");
        Log.info("1) 1988r.\n           2) 1990r. \n");
        Log.info("3) 1999r. \n    4) 1970r. \n");
    }

    public int answer4() {
        return 2;
    }

    public String toString() {
        return "Cyber Punk";
    }
}
