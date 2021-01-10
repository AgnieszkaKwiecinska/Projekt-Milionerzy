package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class WordWarII {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Związek Walki Zbrojnej", "Szare Szeregi", "Służba Zwycięstwu Polski", "Armia Krajowa");
                return new Question("Jak nazywała się pierwsza organizacja Polskiego Panśtwa Podziemnego?",
                        answers,
                        3);
            }
            case 2: {
                List<String> answers = Arrays.asList("199", "98", "303 ", "414");
                return new Question("Ile samolotów japońskich wzieło udział w nalocie na Pearl Harbor?",
                        answers,
                        4);
            }

            case 3: {
                List<String> answers = Arrays.asList("W kwietniu", "W lipcu", "We wrześniu", "W maju");
                return new Question("W Którym miesiącu Japonia podpisała kapitulację?",
                        answers,
                        3);
            }

            case 4: {
                List<String> answers = Arrays.asList("7 sierpnia 1939", "1 października 1939 ", "1 września 1939 ", "17 września 1939");
                return new Question("Kiedy wybuchła II wojna światowa?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
