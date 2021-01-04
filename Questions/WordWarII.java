package com.company.Questions;

import com.company.Log;

public class WordWarII extends Questions {
    private void question1() {
        Log.info("Jak nazywała się pierwsza organizacja Polskiego Panśtwa Podziemnego?\n");
        Log.info("1) Związek Walki Zbrojnej\n            2) Szare Szeregi\n");
        Log.info("3) Służba Zwycięstwu Polski\n   4) Armia Krajowa\n");
    }

    public int answer1() {
        return 3;
    }

    private void question2() {
        Log.info("Ile samolotów japońskich wzieło udział w nalocie na Pearl Harbor?\n");
        Log.info("1) 199\n           2) 98\n");
        Log.info("3) 303 \n    4) 414 \n");
    }

    public int answer2() {
        return 4;
    }

    private void question3() {
        Log.info("W Którym miesiącu Japonia podpisała kapitulację?\n");
        Log.info("1) W kwietniu\n           2) W lipcu\n");
        Log.info("3) We wrześniu\n    4) W maju \n");
    }

    public int answer3() {
        return 3;
    }

    private void question4() {
        Log.info("Kiedy wybuchła II wojna światowa?\n");
        Log.info("1) 7 sierpnia 1939\n           2) 1 października 1939 \n");
        Log.info("3) 1 września 1939 \n    4) 17 września 1939 \n");
    }

    public int answer4() {
        return 3;
    }

    public String toString() {
        return "Word War II";
    }
}
