package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Minecraft {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Żelazny", "Kamienny", "Złoty", "Diamentowy");
                return new Question("Jaki kilof jest wymagany aby wydobyć rudę złota?",
                        answers,
                        1);
            }
            case 2: {
                List<String> answers = Arrays.asList("Ubisoft", "Mojang", "Microsoft ", "Electronic Arts");
                return new Question("Jaki producent wydał Minecrafta?",
                        answers,
                        2);
            }
            case 3: {
                List<String> answers = Arrays.asList("5", "3", "4", "2");
                return new Question("Płomyki stzrelają seriami po ile kul ognia?",
                        answers,
                        2);
            }
            case 4: {
                List<String> answers = Arrays.asList("1.3.1", "1.3.2 ", "1.2.5", "1.2");
                return new Question(" W jakiej wersji gry chwilowo pojawiły sie barwione deski?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
