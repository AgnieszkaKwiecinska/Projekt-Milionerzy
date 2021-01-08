package com.company.Questions;

import com.company.Log;

public class Programmer extends Questions {
    private int answer;
    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1:
                Log.info("W języku programowania Python poprzez wyrażenie, 'def' definiuje się  jedynie: \n");
                Log.info("1) Listy\n2) Procedury\n");
                Log.info("3) Słowniki\n4) Mechanimzy\n");
                answer = 2;
            case 2:
                Log.info("Czym jest <iostream> w jezyku programowania w C++?\n");
                Log.info("1) Zakończenie funkcji głównej\n2) Biblioteka strumieni wejścia i wyjścia \n3) Zmienna \n4) Funkcja główna  \n");
                answer = 2;

            case 3:
                Log.info("Zbiór reguł komunikacji między programami nazwiemy?\n");
                Log.info("1) USO\n2) OS \n3) API \n4) ISSSO \n");
                answer = 3;

            case 4:
                Log.info("Jaka jest najnowsza dystybucja systemu Linux Ubuntu?\n");
                Log.info("1) 18.05\n2) 17.05 \n3) 18.06 \n4) 17.11 \n");
                answer = 1;

        }
    }
    private void question1() {
        Log.info("W języku programowania Python poprzez wyrażenie, 'def' definiuje się  jedynie: \n");
        Log.info("1) Listy\n            2) Procedury\n");
        Log.info("3) Słowniki\n   4) Mechanimzy\n");
    }

    public int answer1() {
        return 2;
    }

    private void question2() {
        Log.info("Czym jest <iostream> w jezyku programowania w C++?\n");
        Log.info("1) Zakończenie funkcji głównej\n           2) Biblioteka strumieni wejścia i wyjścia \n");
        Log.info("3) Zmienna \n    4) Funkcja główna  \n");
    }

    public int answer2() {
        return 2;
    }

    private void question3() {
        Log.info("Zbiór reguł komunikacji między programami nazwiemy?\n");
        Log.info("1) USO\n           2) OS \n");
        Log.info("3) API \n    4) ISSSO \n");
    }

    public int answer3() {
        return 3;
    }

    private void question4() {
        Log.info("Jaka jest najnowsza dystybucja systemu Linux Ubuntu?\n");
        Log.info("1) 18.05\n           2) 17.05 \n");
        Log.info("3) 18.06 \n    4) 17.11 \n");
    }

    public int answer4() {
        return 1;
    }

    public String toString() {
        return "Programmer";
    }
}

