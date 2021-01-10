package com.company.Questions;

import com.company.Log;

public class Proverb extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Co za dużo ...\n");
                Log.info("1) to niezdrowo\n2) To z żołądka\n3) To z serca\n4) To niechlujnie\n");
                answer = 1;
                break;
            }
            case 2: {
                Log.info("Psa głaskaj, ale...\n");
                Log.info("1) Nie pod włos\n2) Ostrożnie\n3) Kija z ręki nie puszczaj \n4) Nie obcego \n");
                answer = 3;
                break;
            }

            case 3: {
                Log.info("Łagodność...\n");
                Log.info("1) Jest łaskawością\n2) Uśmierza ból\n3) Dobroci całość\n4) To absolutność\n");
                answer = 2;
                break;
            }

            case 4: {
                Log.info("Śmiech to...\n");
                Log.info("1) Impreza\n2) Zdrowie\n3) Radość\n4) Zabawa \n");
                answer = 2;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }
}



