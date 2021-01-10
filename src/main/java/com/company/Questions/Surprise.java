package com.company.Questions;

import com.company.Log;

public class Surprise extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Kto wcielił się w rolę Hansa Klossa w serialu \" Stawka większa niż życie \" ? \n");
                Log.info("1) Tadeusz Fijewski\n2) Marian Kociniak\n3) Stanisław Mikulski\n4) Emil Karewicz\n");
                answer = 3;
                break;
            }
            case 2: {
                Log.info("Na którym roku w Hogwarcie zdaje sie SUM-y?\n");
                Log.info("1) Piątym\n2) Siódmym\n3) Czwartym\n4) Trzecim \n");
                answer = 1;
                break;
            }

            case 3: {
                Log.info("Jak miał na imię ojciec Jacka w serialu 'Tygrysy Europy'?\n");
                Log.info("1) Ignacy\n2) Jan\n3) Jerzy\n4) Henryk\n");
                answer = 4;
                break;
            }

            case 4: {
                Log.info("Kto wciela sie w role Zuzy w 'Na Wspólnej'?\n");
                Log.info("1) Małgorzata Foremniak\n2) Małgorzata Pieczyńska\n3) Małgorzata Socha\n4) Małgorzata Kożuchowska \n");
                answer = 3;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }

}
