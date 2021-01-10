package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class HardWord {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("szeroki ozdobny pasek góralski z kieszeniami", "rodzaj elastycznej jenoczęściowej i obcisłej kobiecej bielizny", "bogato wyszywana sukmana krakowska z haftowanym kołnierzem", "szkocka spódnica zrobiona z tartanu");
                return new Question("Jaką częścią garderoby są body?",
                        answers,
                        2);
            }
            case 2: {
                List<String> answers = Arrays.asList("Animalizacja", "Inwokacja", "Eufemizm ", "Pleonazm ");
                return new Question("Rodzaj metafory polegającej na przypisywaniu przedmiotom, zjawiskom przyrody lub pojęciem abstrakcyjnym właściwości istot żywych to: ",
                        answers,
                        1);
            }

            case 3: {
                List<String> answers = Arrays.asList("Rodzaj obrazu w głębokim obramowaniu", "Portrety pięknych kobiet w japońskiej sztuce", "Naturralność, swoista noszalancja dzieła sztuk", "Dzieło przedstawiające ogólny widok miasta");
                return new Question("Co oznacza, związane ze sztuką, pojecie weduta?",
                        answers,
                        4);
            }

            case 4: {
                List<String> answers = Arrays.asList("Colcannon", "Ceylon", "Panettone", "Brioche");
                return new Question("Jak nazywa się francuskie lekko słodkie przeczywo drożdżowe?",
                        answers,
                        4);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
