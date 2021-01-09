package com.company.Questions;

import com.company.Log;

public class StarWars extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Co mówi Leia po tym jak całuje Luke'a na Gwieździe Śmierci?\n");
                Log.info("1) 'Ty wieśniaku'\n2) 'Kocham cię'\n3) 'Nie mów przemytnikowi'\n4) 'Na szczęście'\n");
                answer = 4;
                break;
            }
            case 2: {
                Log.info("Jak nazywają się wojownicy ubierrający takie pancerze jak Boba Fett?\n");
                Log.info("1) Sithowie\n2) Mandalorianie\n3) Yuuzhan Vongowie \n4) Lasaci \n");
                answer = 2;
                break;
            }

            case 3: {
                Log.info("Gdzie Anakin i Palpatine spotykają się po raz pierwszy?\n");
                Log.info("1) Na Tatooine\n2) Na Coruscant \n3) Na Naboo \n4) Nie spotykają się \n");
                answer = 2;
                break;
            }

            case 4: {
                Log.info("Jak nazywa się obcy, który próbuje ukraść BB-8 na Jakku?\n");
                Log.info("1) Teedo\n2) Tusken \n3) Jawa \n4) Wookiee \n");
                answer = 1;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }

}
