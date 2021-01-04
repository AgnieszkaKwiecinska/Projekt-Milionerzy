package com.company.Questions;

import com.company.Log;

public class WordWarI extends Questions {
    private void question1() {
        Log.info("Ile trwała Ofensywa Nivelle'a?\n");
        Log.info("1) Ofensywa Nivelle'a miała miejsce w 1916r.\n     2) od 16 maja do 9 czerwca 1917r.\n");
        Log.info("3) Od 16 marca do 9 kwietnia 1917r.\n   4) od 16 kwietnia do 9 maja 1917r.\n");
    }

    public int answer1() {
        return 4;
    }

    private void question2() {
        Log.info("Jak nazywał się niemiecki lekki karabin maszynowy odpowiedz na brytyjskiego Lewic guna?\n");
        Log.info("1) Selbstlader 1916\n           2) MG14 Parabellum\n");
        Log.info("3) MG15 n.A \n    4) Selbstlader 1906\n");
    }

    public int answer2() {
        return 3;
    }

    private void question3() {
        Log.info("Jacy władcy ogłosili 'Akt 5 listopada'?\n");
        Log.info("1) Karol I i Wilhelm I\n           2) Franciszek Ferdynand i Wilhelm II\n");
        Log.info("3) Mikołaj II i Wilhelm II\n           4) Franciszek Józef I i Wilhelm II\n");
    }

    public int answer3() {
        return 4;
    }

    private void question4() {
        Log.info("Jak nazywano niemieckie jednostki szturmowe?\n");
        Log.info("1) Hutiertruppe\n           2) Stormtruppe\n");
        Log.info("3) Stoßtruppen\n           4) Schutztruppe \n");
    }

    public int answer4() {
        return 3;
    }
    public String toString() {
        return "Word War I";
    }
}
