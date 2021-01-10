package com.company.Questions;

import com.company.Log;

public class Army extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Browning Hi-Power został skonstruowany przez: \n");
                Log.info("1) Sudajewa\n2) Szpagina\n3) Johna Browninga\n4) D.Saive'a\n");
                answer = 4;
                break;
            }
            case 2: {
                Log.info("Wojskowe Powiedzenie: łyżka składa się z: \n");
                Log.info("1) Żołnierza\n2) Trzaskiem\n3) Stopu metali\n4) Trzymaka i komory zupnej \n");
                answer = 4;
                break;
            }

            case 3: {
                Log.info("7ATP to: \n");
                Log.info("1) Czołg ciężki\n2) Niszczyciel czołgów\n3) Czołg lekki\n4) Czołg średni\n");
                answer = 3;
                break;
            }

            case 4:
                Log.info("Bełt jest amunicją używaną w której broni?\n");
                Log.info("1) Kuszy\n2) Procy\n3) Haubicy\n4) Łuku \n");
                answer = 1;

        }
    }

    public int getAnswer() {
        return answer;
    }
}
