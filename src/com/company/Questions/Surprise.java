package com.company.Questions;

import com.company.Log;

public class Surprise extends Questions {
    private int answer;
    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1:
                Log.info("Kto wcielił się w rolę Hansa Klossa w serialu \" Stawka większa niż życie \" ? \n");
                Log.info("1) Tadeusz Fijewski\n2) Marian Kociniak\n3) Stanisław Mikulski\n4) Emil Karewicz\n");
                answer = 3;
            case 2:
                Log.info("Na którym roku w Hogwarcie zdaje sie SUM-y?\n");
                Log.info("1) Piątym\n2) Siódmym\n3) Czwartym\n4) Trzecim \n");
                answer = 1;

            case 3:
                Log.info("Jak miał na imię ojciec Jacka w serialu 'Tygrysy Europy'?\n");
                Log.info("1) Ignacy\n2) Jan\n3) Jerzy\n4) Henryk\n");
                answer = 4;

            case 4:
                Log.info("Kto wciela sie w role Zuzy w 'Na Wspólnej'?\n");
                Log.info("1) Małgorzata Foremniak\n2) Małgorzata Pieczyńska\n3) Małgorzata Socha\n4) Małgorzata Kożuchowska \n");
                answer = 3;

        }
    }
    private void question1() {
        Log.info("Kto wcielił się w rolę Hansa Klossa w serialu \" Stawka większa niż życie \" ? \n");
        Log.info("1) Tadeusz Fijewski\n2) Marian Kociniak\n");
        Log.info("3) Stanisław Mikulski\n4) Emil Karewicz\n");
    }

    public int answer1() {
        return 3;
    }

    private void question2() {
        Log.info("Na którym roku w Hogwarcie zdaje sie SUM-y?\n");
        Log.info("1) Piątym\n2) Siódmym\n");
        Log.info("3) Czwartym \n4) Trzecim \n");
    }

    public int answer2() {
        return 1;
    }

    private void question3() {
        Log.info("Jak miał na imię ojciec Jacka w serialu \" Tygrysy Europy \" ?\n");
        Log.info("1) Ignacy\n           2) Jan\n");
        Log.info("3) Jerzy\n            4) Henryk\n");
    }

    public int answer3() {
        return 4;
    }

    private void question4() {
        Log.info("Kto wciela sie w role Zuzy w 'Na Wsólnej' ?\n");
        Log.info("1) Małgorzata Foremniak\n           2) Małgorzata Pieczyńska\n");
        Log.info("3) Małgorzata Socha\n           4) Małgorzata Kożuchowska \n");
    }

    public int answer4() {
        return 3;
    }
    public String toString() {
        return "Surprise";
    }
}
