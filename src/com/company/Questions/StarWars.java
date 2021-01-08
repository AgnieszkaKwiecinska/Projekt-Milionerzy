package com.company.Questions;

import com.company.Log;

public class StarWars extends Questions {
    private int answer;
    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1:
                Log.info("Co mówi Leia po tym jak całuje Luke'a na Gwieździe Śmierci?\n");
                Log.info("1) 'Ty wieśniaku'\n2) 'Kocham cię'\n3) 'Nie mów przemytnikowi'\n4) 'Na szczęście'\n");
                answer = 4;
            case 2:
                Log.info("Jak nazywają się wojownicy ubierrający takie pancerze jak Boba Fett?\n");
                Log.info("1) Sithowie\n2) Mandalorianie\n3) Yuuzhan Vongowie \n4) Lasaci \n");
                answer = 2;

            case 3:
                Log.info("Gdzie Anakin i Palpatine spotykają się po raz pierwszy?\n");
                Log.info("1) Na Tatooine\n2) Na Coruscant \n3) Na Naboo \n4) Nie spotykają się \n");
                answer = 2;

            case 4:
                Log.info("Jak nazywa się obcy, który próbuje ukraść BB-8 na Jakku?\n");
                Log.info("1) Teedo\n2) Tusken \n3) Jawa \n4) Wookiee \n");
                answer = 1;

        }
    }
    private void question1() {
        Log.info("Co mówi Leia po tym jak całuje Luke'a na Gwieździe Śmierci?\n");
        Log.info("1) 'Ty wieśniaku'\n            2) 'Kocham cię'\n");
        Log.info("3) 'Nie mów przemytnikowi'\n   4) 'Na szczęście'\n");
    }

    public int answer1() {
        return 4;
    }

    private void question2() {
        Log.info("Jak nazywają się wojownicy ubierrający takie pancerze jak Boba Fett?\n");
        Log.info("1) Sithowie\n           2) Mandalorianie\n");
        Log.info("3) Yuuzhan Vongowie \n    4) Lasaci \n");
    }

    public int answer2() {
        return 2;
    }

    private void question3() {
        Log.info("Gdzie Anakin i Palpatine spotykają się po raz pierwszy?\n");
        Log.info("1) Na Tatooine\n           2) Na Coruscant \n");
        Log.info("3) Na Naboo \n    4) Nie spotykają się \n");
    }

    public int answer3() {
        return 2;
    }

    private void question4() {
        Log.info("Jak nazywa się obcy, który próbuje ukraść BB-8 na Jakku?\n");
        Log.info("1) Teedo\n           2) Tusken \n");
        Log.info("3) Jawa \n    4) Wookiee \n");
    }

    public int answer4() {
        return 1;
    }

    public String toString() {
        return "Star Wars";
    }
}
