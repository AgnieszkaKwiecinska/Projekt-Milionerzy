package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Army {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Sudajewa", "Szpagina", "Johna Browninga", "D.Saive'a");
                return new Question("Browning Hi-Power został skonstruowany przez:",
                        answers,
                        4);
            }
            case 2: {
                List<String> answers = Arrays.asList("Żołnierza", "Trzaskiem", "Stopu metali", "Trzymaka i komory zupnej");
                return new Question(
                        "Wojskowe Powiedzenie: łyżka składa się z: ",
                        answers,
                        4
                );
            }
            case 3: {
                List<String> answers = Arrays.asList("Czołg ciężki", "Niszczyciel czołgów", "Czołg lekki", "Czołg średni");
                return new Question("7ATP to: ",
                        answers,
                        3
                );
            }
            case 4:
                List<String> answers = Arrays.asList("Kuszy", "Procy", "Haubicy", "łuku");
                return new Question(
                        "Bełt jest amunicją używaną w której broni?",
                        answers,
                        1
                );

            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
