package com.company.Questions;

import com.company.Log;

public class WordWarI extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Ile trwała Ofensywa Nivelle'a?\n");
                Log.info("1) Ofensywa Nivelle'a miała miejsce w 1916r.\n2) od 16 maja do 9 czerwca 1917r.\n3) Od 16 marca do 9 kwietnia 1917r.\n4) od 16 kwietnia do 9 maja 1917r.\n");
                answer = 4;
                break;
            }
            case 2: {
                Log.info("Jak nazywał się niemiecki lekki karabin maszynowy odpowiedz na brytyjskiego Lewic guna?\n");
                Log.info("1) Selbstlader 1916\n2) MG14 Parabellum\n3) MG15 n.A \n4) Selbstlader 1906\n");
                answer = 3;
                break;
            }

            case 3: {
                Log.info("Jacy władcy ogłosili 'Akt 5 listopada'?\n");
                Log.info("1) Karol I i Wilhelm I\n2) Franciszek Ferdynand i Wilhelm II\n3) Mikołaj II i Wilhelm II\n4) Franciszek Józef I i Wilhelm II\n");
                answer = 4;
                break;
            }

            case 4: {
                Log.info("Jak nazywano niemieckie jednostki szturmowe?\n");
                Log.info("1) Hutiertruppe\n2) Stormtruppe\n3) Stoßtruppen\n4) Schutztruppe \n");
                answer = 3;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }

}
