package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class VikingHistory {
    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Antynormanistami", "Heretykami", "Słowianistami", "Normanistami");
                return new Question("Rzecznicy Teorii, że osiedla w dawnej Rusi były zasadniczo słowiańskie zwani są: ",
                        answers,
                        1);
            }
            case 2: {
                List<String> answers = Arrays.asList("Bornholm, Gokstad i Tendheim", "Hedeby, Olso i Trondhein", "Hedeby, Ribe i Århus", "Tedheim ,Århus i Kattegat ");
                return new Question("Haraldowi Sinozębnemu przypisuje się ulepszenie urządzeń obronnych w: ",
                        answers,
                        3);
            }

            case 3: {
                List<String> answers = Arrays.asList("Harald Srogi", "Edmund", "Rognvald Guthrotgsson", "Wulfstan");
                return new Question("Kto w 943 roku pretendował do miana króla Yorku?",
                        answers,
                        3);
            }

            case 4: {
                List<String> answers = Arrays.asList("Grundtvig", "Hardegon Sveinsson", "Eryk Segersall Zwycięski", "Olaf II Haraldsson");
                return new Question("Kto ok.975 roku, złożył Sigtunę - siedzibę Szwedzkich Królów?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
