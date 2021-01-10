package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Slang {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {

                List<String> answers = Arrays.asList("Jesieniara", "Eluwina", "Dzban", "Alternatywka");
                return new Question("Jakie słowo w 2019 roku wygrało w konkursie PWN?",
                        answers,
                        4);
            }
            case 2: {

                List<String> answers = Arrays.asList("osoba głupia, robiąca coś głupiego", "coś bardzo dobrego, grubego ", "osoba ubierająca się specyficznie", "osoba bogata, próżna ");
                return new Question("Co znaczy słowo 'masny'?",
                        answers,
                        2);
            }

            case 3: {

                List<String> answers = Arrays.asList("ironiczna nazwa osoby starszej ", "śmieszna sytuacja", "impreze ", "modny, ciekawy");
                return new Question("Co znaczy słowo 'boomer'?",
                        answers,
                        1);
            }

            case 4: {

                List<String> answers = Arrays.asList("bez sensu ", "zgodnie z planem", "za póżno ", "coś sztywnego, nudnego");
                return new Question("Co znaczy słowo 'sztywniutko'?",
                        answers,
                        2);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
