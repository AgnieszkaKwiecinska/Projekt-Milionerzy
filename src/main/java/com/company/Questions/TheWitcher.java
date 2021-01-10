package com.company.Questions;

import com.company.Log;

public class TheWitcher extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Kim jest 'Kwarteronka'?\n");
                Log.info("1) Pół-elfka\n2) Niziołek\n3) Ćwierć-elfka\n4) Elfka\n");
                answer = 3;
                break;
            }
            case 2: {
                Log.info("W Jakim kraju znajdowało się siedlisko wiedźminów Kaer Morhen?\n");
                Log.info("1) Redanii\n2) Aedrin\n3) Temerii \n4) Kaedwen \n");
                answer = 4;
                break;
            }

            case 3: {
                Log.info("Jakie królewska krew płynie w Ciri?\n");
                Log.info("1) Cintryjska\n2) Redańska\n3) Kovirska\n4) Temerska\n");
                answer = 1;
                break;
            }

            case 4: {
                Log.info("Co znaczy Milva w Starszej Mowie?\n");
                Log.info("1) Łania\n2) Kania\n3) Matka\n4) Maria \n");
                answer = 2;
                break;
            }
        }
    }

    public int getAnswer() {
        return answer;
    }
}
