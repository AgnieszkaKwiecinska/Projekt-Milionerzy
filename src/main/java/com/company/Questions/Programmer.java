package com.company.Questions;

import com.company.Log;

public class Programmer extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("W języku programowania Python poprzez wyrażenie, 'def' definiuje się  jedynie: \n");
                Log.info("1) Listy\n2) Procedury\n");
                Log.info("3) Słowniki\n4) Mechanimzy\n");
                answer = 2;
                break;
            }
            case 2: {
                Log.info("Czym jest <iostream> w jezyku programowania w C++?\n");
                Log.info("1) Zakończenie funkcji głównej\n2) Biblioteka strumieni wejścia i wyjścia \n3) Zmienna \n4) Funkcja główna  \n");
                answer = 2;
                break;
            }

            case 3: {
                Log.info("Zbiór reguł komunikacji między programami nazwiemy?\n");
                Log.info("1) USO\n2) OS \n3) API \n4) ISSSO \n");
                answer = 3;
                break;
            }

            case 4: {
                Log.info("Jaka jest najnowsza dystybucja systemu Linux Ubuntu?\n");
                Log.info("1) 18.05\n2) 17.05 \n3) 18.06 \n4) 17.11 \n");
                answer = 1;
                break;
            }
        }
    }

    public int getAnswer() {
        return answer;
    }

}

