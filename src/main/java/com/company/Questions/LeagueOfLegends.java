package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class LeagueOfLegends {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Wąsy", "dodatkowa stopa", "rogi", "tarcza");
                return new Question("Co wyrasta Poro gdy nakarmi go Braum?",
                        answers,
                        1);
            }
            case 2: {
                List<String> answers = Arrays.asList("Nimbus Strike ( Cios Nimbu )", "Transfusion ( Transfuzja)", "Prey Seeker ( Drapieżnica) ", "Sweeoing Blade ( Zamaszyste Cięcie) ");
                return new Question("Która z umiejętności to umiejętności mierzona (skill shot)?",
                        answers,
                        3);
            }

            case 3: {
                List<String> answers = Arrays.asList("Rekkles", "Soaz", "Nukeduck", "Broxah");
                return new Question("Kto został wybrany MVP letniego splitu LCS 2017?",
                        answers,
                        1);
            }

            case 4: {
                List<String> answers = Arrays.asList("Froogen", "Febiven", "Faker", "Bjergsen ");
                return new Question("Który z graczy LCS jest znany z najlepszych zagrań Anivią?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
