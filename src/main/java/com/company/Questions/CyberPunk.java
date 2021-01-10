package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class CyberPunk {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Heywood", "Westbrook", "Watson", "Pacyfika");
                return new Question(
                        "Który z regionów gry jest podmiejski?",
                        answers,
                        1
                );
            }
            case 2: {
                List<String> answers = Arrays.asList("We wrześniu 2020 roku", "W styczniu 2013 roku ", "W kwietniu 2020 roku ", "W maju 2012 roku  ");
                return new Question(
                        "Kiedy wyszedł pierwszy numer komiksu Cyberpunk 2077: Trauma Team?",
                        answers,
                        1
                );
            }

            case 3: {
                List<String> answers = Arrays.asList("Henry", "Dexter DeShawn ", "Narayan Isamu ", "Johnny Silverhand ");
                return new Question(
                        "Kto był związany z Alt Cunningham i Rogue?",
                        answers,
                        4
                );
            }

            case 4: {
                List<String> answers = Arrays.asList("1988r.", "1990r. ", "1999r. ", "1970r. ");
                return new Question(
                        "W którym roku wyszła gra Cyberpunk 2020?",
                        answers,
                        2
                );
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }

}
