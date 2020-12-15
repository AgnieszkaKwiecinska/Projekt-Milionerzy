package com.company.Questions;

import com.company.Log;

public class Slang implements Questions{
    private int answer;

    private void question1(){
        Log.info("What word won the competition in 2019?\n");
        Log.info("1) Jesieniara      2) Eluwina\n");
        Log.info("3) Dzban           4) Alternatywka\n");
    }

    public int answer1() {
        return 4;
    }

    private void question2(){
        Log.info("What does the word 'masny' mean?\n");
        Log.info("1) a stupid person\n2) Something really good\n");
        Log.info("3) a person who dresses specifically\n4) a rich person\n");
    }

    public int answer2() {
        return 2;
    }

}
