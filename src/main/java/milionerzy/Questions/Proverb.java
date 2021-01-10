package milionerzy.Questions;

import milionerzy.Log;

public class Proverb extends Questions {
    private void question1() {
        Log.info("Co za dużo ...\n");
        Log.info("1) to niezdrowo\n            2) To z żołądka\n");
        Log.info("3) To z serca\n   4) To niechlujnie\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Psa głaskaj, ale...\n");
        Log.info("1) Nie pod włos\n           2) Ostrożnie\n");
        Log.info("3) Kija z ręki nie puszczaj \n    4) Nie obcego \n");
    }

    public int answer2() {
        return 3;
    }

    private void question3() {
        Log.info("Łagodność...\n");
        Log.info("1) Jest łaskawością\n           2) Uśmierza ból\n");
        Log.info("3) Dobroci całość\n           4) To absolutność\n");
    }

    public int answer3() {
        return 2;
    }

    private void question4() {
        Log.info("Śmiech to...\n");
        Log.info("1) Impreza\n           2) Zdrowie\n");
        Log.info("3) Radość\n           4) Zabawa \n");
    }

    public int answer4() {
        return 2;
    }
    public String toString() {

        return "Proverb";
    }
}



