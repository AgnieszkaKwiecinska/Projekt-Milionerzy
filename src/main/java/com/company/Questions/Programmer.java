package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Programmer {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Listy", "Procedury", "Słowniki", "Mechanimzy");
                return new Question("W języku programowania Python poprzez wyrażenie, 'def' definiuje się  jedynie: ",
                        answers,
                        2);
            }
            case 2: {
                List<String> answers = Arrays.asList("Zakończenie funkcji głównej", "Biblioteka strumieni wejścia i wyjścia ", "Zmienna", "Funkcja główna");
                return new Question("Czym jest <iostream> w jezyku programowania w C++?",
                        answers,
                        2);
            }

            case 3: {
                List<String> answers = Arrays.asList("USO", "OS ", "API ", "ISSSO");
                return new Question("Zbiór reguł komunikacji między programami nazwiemy?",
                        answers,
                        3);
            }

            case 4: {
                List<String> answers = Arrays.asList("18.05", "17.05", "18.06", "17.11");
                return new Question("Jaka jest najnowsza dystybucja systemu Linux Ubuntu?",
                        answers,
                        1);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}

