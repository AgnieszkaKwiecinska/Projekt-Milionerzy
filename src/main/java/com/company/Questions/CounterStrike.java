package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class CounterStrike {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("2", "14", "19", "15");
                return new Question(
                        "Które miejsce wśród 20 najlepszych graczy 2016 zajął Magiskb0Y?",
                        answers,
                        2
                );
            }
            case 2: {
                List<String> answers = Arrays.asList("Granat zapalający", "Mołotov", "Granat dymny ", "Granat błyskowo-hukowy ");
                return new Question(
                        "Który z podanych granatów jest najtańszy?",
                        answers,
                        4
                );
            }
            case 3: {
                List<String> answers = Arrays.asList("fxy0", "ScreaM", "fox", "ropz");
                return new Question(
                        "Który z podanych graczy jest francuzem?",
                        answers,
                        1
                );
            }
            case 4: {
                List<String> answers = Arrays.asList("Cache", "Inferno", "Mirage", "Cobblestone ");
                return new Question(
                        "Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?",
                        answers,
                        4
                );
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }

}
