package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class Weapons extends Questions {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Karabinek wz. 88 'Tantal'", "Karabinek wz. 96 'Beryl'", "MSBS", "PM 06 'Glauberyt'");
                return new Question("Pierwszym polskim karabinem na amunicję 5.45x39mm był: ",
                        answers,
                        1);
            }
            case 2: {
                List<String> answers = Arrays.asList("H&K", "Beretta", "Remington", "FN");
                return new Question("Który z tych frim podjęła się modyfikacji karabinku L85A1?",
                        answers,
                        1);
            }

            case 3: {
                List<String> answers = Arrays.asList("Mała Strzelecka Broń Samoczynna", "Możliwe Samoodpalenie Bomby Samolotowej", "Modułowa Stzrelba Bio Selektywna)", " Modułowy System Broni Strzeleckiej");
                return new Question("Skrót MSBS jest od: ",
                        answers,
                        4);
            }

            case 4: {
                List<String> answers = Arrays.asList("3.17HMR", "5,7x28mm", "7,92x33mm", "7,62x25mm ");
                return new Question("Jaką amunicją strzela STG 44?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
