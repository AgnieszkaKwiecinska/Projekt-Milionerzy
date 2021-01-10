package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class TheWitcher {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {

                List<String> answers = Arrays.asList("Pół-elfka", "Niziołek", "Ćwierć-elfka", "Elfka");
                return new Question("Kim jest 'Kwarteronka'?",
                        answers,
                        3);
            }
            case 2: {

                List<String> answers = Arrays.asList("Redanii", "Aedrin", "Temerii ", "Kaedwen ");
                return new Question("W Jakim kraju znajdowało się siedlisko wiedźminów Kaer Morhen?",
                        answers,
                        4);
            }

            case 3: {

                List<String> answers = Arrays.asList("Cintryjska", "Redańska", "Kovirska", "Temerska");
                return new Question("Jakie królewska krew płynie w Ciri?",
                        answers,
                        1);
            }

            case 4: {

                List<String> answers = Arrays.asList("Łania", "Kania", "Matka", "Maria ");
                return new Question("Co znaczy Milva w Starszej Mowie?",
                        answers,
                        2);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
