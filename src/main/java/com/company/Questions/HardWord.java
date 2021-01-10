package com.company.Questions;

import com.company.Log;

public class HardWord extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Jaką częścią garderoby są body?\n");
                Log.info("1) szeroki ozdobny pasek góralski z kieszeniami\n2) rodzaj elastycznej jenoczęściowej i obcisłej kobiecej bielizny\n" +
                        "3) bogato wyszywana sukmana krakowska z haftowanym kołnierzem\n4) szkocka spódnica zrobiona z tartanu\n");
                answer = 2;
                break;
            }
            case 2: {
                Log.info("Rodzaj metafory polegającej na przypisywaniu przedmiotom, zjawiskom przyrody lub pojęciem abstrakcyjnym właściwości istot żywych to: \n");
                Log.info("1) Animalizacja\n2) Inwokacja\n3) Eufemizm \n4) Pleonazm \n");
                answer = 1;
                break;
            }

            case 3: {
                Log.info("Co oznacza, związane ze sztuką, pojecie weduta?\n");
                Log.info("1) Rodzaj obrazu w głębokim obramowaniu\n2) Portrety pięknych kobiet w japońskiej sztuce\n3) Naturralność, swoista noszalancja dzieła sztuk\n4) Dzieło przedstawiające ogólny widok miasta\n");
                answer = 4;
                break;
            }

            case 4: {
                Log.info("Jak nazywa się francuskie lekko słodkie przeczywo drożdżowe?\n");
                Log.info("1) Colcannon\n2) Ceylon\n3) Panettone\n4) Brioche\n");
                answer = 4;
                break;
            }

        }
    }
    public int getAnswer() {
        return answer;
    }

}
