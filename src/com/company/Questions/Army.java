package com.company.Questions;

import com.company.Log;

public class Army extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1:
                Log.info("Browning Hi-Power został skonstruowany przez: \n");
                Log.info("1) Sudajewa\n2) Szpagina\n3) Johna Browninga\n4) D.Saive'a\n");
                answer = 4;
            case 2:
                Log.info("Wojskowe Powiedzenie: łyżka składa się z: \n");
                Log.info("1) Żołnierza\n2) Trzaskiem\n3) Stopu metali\n4) Trzymaka i komory zupnej \n");
                answer = 4;

            case 3:
                Log.info("7ATP to: \n");
                Log.info("1) Czołg ciężki\n2) Niszczyciel czołgów\n3) Czołg lekki\n4) Czołg średni\n");
                answer = 3;

            case 4:
                Log.info("Bełt jest amunicją używaną w której broni?\n");
                Log.info("1) Kuszy\n2) Procy\n3) Haubicy\n4) Łuku \n");
                answer = 1;

        }
    }

    public String toString() {
        return "Army";
    }

    public void question1() {
        Log.info("Browning Hi-Power został skonstruowany przez: \n");
        Log.info("1) Sudajewa\n            2) Szpagina\n");
        Log.info("3) Johna Browninga\n     4) D.Saive'a\n");
    }

    public int answer1() {
        return 4;
    }

    public void question2() {
        Log.info("Wojskowe Powiedzenie: łyżka składa się z: \n");
        Log.info("1) Żołnierza\n           2) Trzaskiem\n");
        Log.info("3) Stopu metali \n       4) Trzymaka i komory zupnej \n");
    }

    public int answer2() {
        return 4;
    }

    public void question3() {
        Log.info("7ATP to: \n");
        Log.info("1) Czołg ciężki\n        2) Niszczyciel czołgów\n");
        Log.info("3) Czołg lekki\n         4) Czołg średni\n");
    }

    public int answer3() {
        return 3;
    }

    public void question4() {
        Log.info("Bełt jest amunicją używaną w której broni?\n");
        Log.info("1) Kuszy\n               2) Procy\n");
        Log.info("3) Haubicy\n             4) Łuku \n");
    }

    public int answer4() {
        return 1;
    }


    public int getAnswer() {
        return answer;
    }
}
