package com.company.Questions;

import com.company.Log;

public class CounterStrike extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Które miejsce wśród 20 najlepszych graczy 2016 zajął Magiskb0Y?\n");
                Log.info("1) 2\n2) 14\n3) 19\n4) 15\n");
                answer = 2;
                break;
            }
            case 2: {
                Log.info("Który z podanych granatów jest najtańszy?\n");
                Log.info("1) Granat zapalający\n2) Mołotov\n3) Granat dymny \n4) Granat błyskowo-hukowy \n");
                answer = 4;
                break;
            }
            case 3: {
                Log.info("Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?\n");
                Log.info("1) Cache\n2) Inferno\n3) Mirage\n4) Cobblestone \n");
                answer = 1;
                break;
            }
            case 4: {
                Log.info("Na której mapie możemy spotkać takie miejscówki jak Rondo, Drop albo Matrix?\n");
                Log.info("1) Cache\n2) Inferno\n3) Mirage\n4) Cobblestone \n");
                answer = 4;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }
}
