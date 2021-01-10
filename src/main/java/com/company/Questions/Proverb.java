package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Proverb {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("to niezdrowo", "To z żołądka", "To z serca", "To niechlujnie");
                return new Question("Co za dużo ...",
                        answers,
                        1);
            }
            case 2: {
                List<String> answers = Arrays.asList("Nie pod włos", "Ostrożnie", "Kija z ręki nie puszczaj ", "Nie obcego ");
                return new Question("Psa głaskaj, ale...",
                        answers,
                        3);
            }

            case 3: {
                List<String> answers = Arrays.asList("Jest łaskawością", "Uśmierza ból", "Dobroci całość", "To absolutność");
                return new Question("łagodność...",
                        answers,
                        2);
            }

            case 4: {
                List<String> answers = Arrays.asList("Impreza", "Zdrowie", "Radość", "Zabawa ");
                return new Question("Śmiech to...",
                        answers,
                        2);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}



