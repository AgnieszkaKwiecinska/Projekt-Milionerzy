package com.company.Questions;

import com.company.Log;

public class Minecraft extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Jaki kilof jest wymagany aby wydobyć rudę złota?\n");
                Log.info("1) Żelazny\n2) Kamienny\n3) Złoty\n4) Diamentowy\n");
                answer = 1;
                break;
            }
            case 2: {
                Log.info("Jaki producent wydał Minecrafta?\n");
                Log.info("1) Ubisoft\n2) Mojang\n3) Microsoft \n4) Electronic Arts \n");
                answer = 2;
                break;
            }
            case 3: {
                Log.info("Płomyki stzrelają seriami po ile kul ognia?\n");
                Log.info("1) 5\n2) 3\n3) 4\n4) 2\n");
                answer = 2;
                break;
            }
            case 4: {
                Log.info(" W jakiej wersji gry chwilowo pojawiły sie barwione deski?\n");
                Log.info("1) 1.3.1\n2) 1.3.2 \n3) 1.2.5\n4) 1.2 \n");
                answer = 3;
                break;
            }
        }
    }

    public int getAnswer() {
        return answer;
    }

}
