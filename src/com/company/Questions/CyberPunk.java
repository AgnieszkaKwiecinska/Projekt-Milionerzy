package com.company.Questions;

import com.company.Log;

public class CyberPunk extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Który z regionów gry jest podmiejski?\n");
                Log.info("1) Heywood\n2) Westbrook\n3) Watson\n4) Pacyfika\n");
                answer = 1;
                break;
            }
            case 2: {
                Log.info("Kiedy wyszedł pierwszy numer komiksu Cyberpunk 2077: Trauma Team?\n");
                Log.info("1) We wrześniu 2020 roku\n2) W styczniu 2013 roku \n3) W kwietniu 2020 roku \n4) W maju 2012 roku  \n");
                answer = 1;
                break;
            }

            case 3: {
                Log.info("Kto był związany z Alt Cunningham i Rogue?\n");
                Log.info("1) Henry\n2) Dexter DeShawn \n3) Narayan Isamu \n4) Johnny Silverhand \n");
                answer = 4;
                break;
            }

            case 4: {
                Log.info("W którym roku wyszła gra Cyberpunk 2020?\n");
                Log.info("1) 1988r.\n2) 1990r. \n3) 1999r. \n4) 1970r. \n");
                answer = 2;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }
}
