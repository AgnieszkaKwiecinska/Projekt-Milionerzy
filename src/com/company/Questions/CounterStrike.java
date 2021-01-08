package com.company.Questions;

import com.company.Log;

public class CounterStrike extends Questions {
    private int answer;
    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1:
                Log.info("Które miejsce wśród 20 najlepszych graczy 2016 zajął Magiskb0Y?\n");
                Log.info("1) 2\n2) 14\n3) 19\n4) 15\n");
                answer = 2;
            case 2:
                Log.info("Który z podanych granatów jest najtańszy?\n");
                Log.info("1) Granat zapalający\n2) Mołotov\n3) Granat dymny \n4) Granat błyskowo-hukowy \n");
                answer = 4;

            case 3:
                Log.info("Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?\n");
                Log.info("1) Cache\n2) Inferno\n3) Mirage\n4) Cobblestone \n");
                answer = 1;

            case 4:
                Log.info("Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?\n");
                Log.info("1) Cache\n2) Inferno\n3) Mirage\n4) Cobblestone \n");
                answer = 4;

        }
    }
    public void question1() {
        Log.info("Które miejsce wśród 20 najlepszych graczy 2016 zajął Magiskb0Y?\n");
        Log.info("1) 2\n            2) 14\n");
        Log.info("3) 19\n   4) 15\n");
    }

    public int answer1() {
        return 2;
    }

    public void question2() {
        Log.info("Który z podanych granatów jest najtańszy?\n");
        Log.info("1) Granat zapalający\n           2) Mołotov\n");
        Log.info("3) Granat dymny \n    4) Granat błyskowo-hukowy \n");
    }

    public int answer2() {
        return 4;
    }

    public void question3() {
        Log.info("Który z podanych graczy jest francuzem?\n");
        Log.info("1) fxy0\n           2) ScreaM\n");
        Log.info("3) fox\n           4) ropz\n");
    }

    public int answer3() {
        return 1;
    }

    public void question4() {
        Log.info("Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?\n");
        Log.info("1) Cache\n           2) Inferno\n");
        Log.info("3) Mirage\n           4) Cobblestone \n");
    }

    public int answer4() {
        return 4;
    }

    public String toString() {
        return "Counter Strike";
    }
}
