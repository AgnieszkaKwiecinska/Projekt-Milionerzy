package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class StarWars extends Questions {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("'Ty wieśniaku'", "'Kocham cię'", "'Nie mów przemytnikowi'", "'Na szczęście'");
                return new Question("Co mówi Leia po tym jak całuje Luke'a na Gwieździe Śmierci?",
                        answers,
                        4);
            }
            case 2: {
                List<String> answers = Arrays.asList("Sithowie", "Mandalorianie", "Yuuzhan Vongowie ", "Lasaci");
                return new Question("Jak nazywają się wojownicy ubierrający takie pancerze jak Boba Fett?",
                        answers,
                        2);
            }

            case 3: {
                List<String> answers = Arrays.asList("Na Tatooine", "Na Coruscant ", "Na Naboo ", "Nie spotykają się");
                return new Question("Gdzie Anakin i Palpatine spotykają się po raz pierwszy?",
                        answers,
                        2);
            }

            case 4: {
                List<String> answers = Arrays.asList("Teedo", "Tusken ", "Jawa ", "Wookiee ");
                return new Question("Jak nazywa się obcy, który próbuje ukraść BB-8 na Jakku?",
                        answers,
                        1);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
