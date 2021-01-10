package milionerzy.Questions;

import milionerzy.Log;

public class TheWitcher extends Questions {
    private void question1() {
        Log.info("Kim jest 'Kwarteronka'?\n");
        Log.info("1) Pół-elfka\n            2) Niziołek\n");
        Log.info("3) Ćwierć-elfka\n   4) Elfka\n");
    }

    public int answer1() {
        return 3;
    }

    private void question2() {
        Log.info("W Jakim kraju znajdowało się siedlisko wiedźminów Kaer Morhen?\n");
        Log.info("1) Redanii\n           2) Aedrin\n");
        Log.info("3) Temerii \n    4) Kaedwen \n");
    }

    public int answer2() {
        return 4;
    }

    private void question3() {
        Log.info("Jakie królewska krew płynie w Ciri?\n");
        Log.info("1) Cintryjska\n           2) Redańska\n");
        Log.info("3) Kovirska\n           4) Temerska\n");
    }

    public int answer3() {
        return 1;
    }

    private void question4() {
        Log.info("Co znaczy Milva w Starszej Mowie?\n");
        Log.info("1) Łania\n           2) Kania\n");
        Log.info("3) Matka\n           4) Maria \n");
    }

    public int answer4() {
        return 2;
    }
    public String toString() {
        return "The Witcher";
    }
}
