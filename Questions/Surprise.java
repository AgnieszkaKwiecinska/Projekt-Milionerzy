package milionerzy.Questions;

import milionerzy.Log;

public class Surprise extends Questions {
    private void question1() {
        Log.info("Kto wcielił się w rolę Hansa Klossa w serialu \" Stawka większa niż życie \" ? \n");
        Log.info("1) Tadeusz Fijewski\n            2) Marian Kociniak\n");
        Log.info("3) Stanisław Mikulski\n   4) Emil Karewicz\n");
    }

    public int answer1() {
        return 3;
    }

    private void question2() {
        Log.info("Na którym roku w Hogwarcie zdaje sie SUM-y?\n");
        Log.info("1) Piątym\n           2) Siódmym\n");
        Log.info("3) Czwartym \n        4) Trzecim \n");
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
