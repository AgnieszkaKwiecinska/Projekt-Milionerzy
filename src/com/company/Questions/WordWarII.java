package com.company.Questions;

import com.company.Log;

public class WordWarII extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Jak nazywała się pierwsza organizacja Polskiego Panśtwa Podziemnego?\n");
                Log.info("1) Związek Walki Zbrojnej\n2) Szare Szeregi\n3) Służba Zwycięstwu Polski\n4) Armia Krajowa\n");
                answer = 3;
                break;
            }
            case 2: {
                Log.info("Ile samolotów japońskich wzieło udział w nalocie na Pearl Harbor?\n");
                Log.info("1) 199\n2) 98\n3) 303 \n4) 414 \n");
                answer = 4;
                break;
            }

            case 3: {
                Log.info("W Którym miesiącu Japonia podpisała kapitulację?\n");
                Log.info("1) W kwietniu\n2) W lipcu\n3) We wrześniu\n4) W maju \n");
                answer = 3;
                break;
            }

            case 4: {
                Log.info("Kiedy wybuchła II wojna światowa?\n");
                Log.info("1) 7 sierpnia 1939\n2) 1 października 1939 \n3) 1 września 1939 \n4) 17 września 1939 \n");
                answer = 3;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }
}
