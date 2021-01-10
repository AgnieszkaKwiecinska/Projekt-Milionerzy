package com.company.Questions;

import java.util.Arrays;
import java.util.List;

public class WordWarI {

    public Question getQuestion(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                List<String> answers = Arrays.asList("Ofensywa Nivelle'a miała miejsce w 1916r.", "od 16 maja do 9 czerwca 1917r.", "Od 16 marca do 9 kwietnia 1917r.", "4) od 16 kwietnia do 9 maja 1917r.");
                return new Question("Ile trwała Ofensywa Nivelle'a?",
                        answers,
                        4);
            }
            case 2: {
                List<String> answers = Arrays.asList("Selbstlader 1916", "MG14 Parabellum", "MG15 n.A ", "4) Selbstlader 1906");
                return new Question("Jak nazywał się niemiecki lekki karabin maszynowy odpowiedz na brytyjskiego Lewic guna?",
                        answers,
                        3);
            }

            case 3: {
                List<String> answers = Arrays.asList("Karol I i Wilhelm I", "Franciszek Ferdynand i Wilhelm II", "Mikołaj II i Wilhelm II", "4) Franciszek Józef I i Wilhelm II");
                return new Question("Jacy władcy ogłosili 'Akt 5 listopada'?",
                        answers,
                        4);
            }

            case 4: {
                List<String> answers = Arrays.asList("Hutiertruppe", "Stormtruppe", "Stoßtruppen", "4) Schutztruppe ");
                return new Question("Jak nazywano niemieckie jednostki szturmowe?",
                        answers,
                        3);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=" + numberQuestion);
        }
    }
}
