package com.company.Questions;

import com.company.Log;

public class Weapons extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Pierwszym polskim karabinem na amunicję 5.45x39mm był: \n");
                Log.info("1) Karabinek wz. 88 'Tantal'\n2) Karabinek wz. 96 'Beryl'\n3) MSBS\n4) PM 06 'Glauberyt'\n");
                answer = 1;
                break;
            }
            case 2: {
                Log.info("Który z tych frim podjęła się modyfikacji karabinku L85A1?\n");
                Log.info("1) H&K\n2) Beretta\n3) Remington\n4) FN\n");
                answer = 1;
                break;
            }

            case 3: {
                Log.info("Skrót MSBS jest od: \n");
                Log.info("1) Mała Strzelecka Broń Samoczynna\n2) Możliwe Samoodpalenie Bomby Samolotowej\n3) Modułowa Stzrelba Bio Selektywna\4) Modułowy System Broni Strzeleckiej\n");
                answer = 4;
                break;
            }

            case 4: {
                Log.info("Jaką amunicją strzela STG 44?\n");
                Log.info("1) 3.17HMR\n2) 5,7x28mm\n3) 7,92x33mm\n4) 7,62x25mm \n");
                answer = 3;
                break;
            }
        }
    }

    public int getAnswer() {
        return answer;
    }
}
