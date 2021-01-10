package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Surprise {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Tadeusz Fijewski", "Marian Kociniak", "Stanisław Mikulski", "Emil Karewicz");
                return new Question("Kto wcielił się w rolę Hansa Klossa w serialu \" Stawka większa niż życie \" ? ",
                        answers,
                        3);
            }
            case 2: {
                List<String> answers = Arrays.asList("Piątym", "Siódmym", "Czwartym", "Trzecim ");
                return new Question("Na którym roku w Hogwarcie zdaje sie SUM-y?",
                        answers,
                        1);
            }

            case 3: {
                List<String> answers = Arrays.asList("Ignacy", "Jan", "Jerzy", "Henryk");
                return new Question("Jak miał na imię ojciec Jacka w serialu 'Tygrysy Europy'?",
                        answers,
                        4);
            }

            case 4: {
                List<String> answers = Arrays.asList("Małgorzata Foremniak", "Małgorzata Pieczyńska", "Małgorzata Socha", "Małgorzata Kożuchowska ");
                return new Question("Kto wciela sie w role Zuzy w 'Na Wspólnej'?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
