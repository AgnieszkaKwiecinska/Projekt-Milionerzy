package com.company.Questions;

import com.company.Log;

public class Army extends Questions {
    private void question1() {
        Log.info("Browning Hi-Power został skonstruowany przez: \n");
        Log.info("1) Sudajewa\n            2) Szpagina\n");
        Log.info("3) Johna Browninga\n   4) D.Saive'a\n");
    }

    public int answer1() {
        return 4;
    }

    private void question2() {
        Log.info("Wojskowe Powiedzenie: łyżka składa się z: \n");
        Log.info("1) Żołnierza\n           2) Trzaskiem\n");
        Log.info("3) Stopu metali \n    4) Trzymaka i komory zupnej \n");
    }

    public int answer2() {
        return 4;
    }

    private void question3() {
        Log.info("7ATP to: \n");
        Log.info("1) Czołg ciężki\n           2) Niszczyciel czołgów\n");
        Log.info("3) Czołg lekki\n           4) Czołg średni\n");
    }

    public int answer3() {
        return 3;
    }

    private void question4() {
        Log.info("Bełt jest amunicją używaną w której broni?\n");
        Log.info("1) Kuszy\n           2) Procy\n");
        Log.info("3) Haubicy\n           4) Łuku \n");
    }

    public int answer4() {
        return 1;
    }

    public String toString() {
        return "Army";
    }
}
