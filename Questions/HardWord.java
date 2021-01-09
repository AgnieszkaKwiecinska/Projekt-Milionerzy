package milionerzy.Questions;

import milionerzy.Log;

public class HardWord extends Questions {
    private void question1() {
        Log.info("Jaką częścią garderoby są body?\n");
        Log.info("1) szeroki ozdobny pasek góralski z kieszeniami\n");
        Log.info("2) rodzaj elastycznej jenoczęściowej i obcisłej kobiecej bielizny\n");
        Log.info("3) bogato wyszywana sukmana krakowska z haftowanym kołnierzem\n");
        Log.info("4) szkocka spódnica zrobiona z tartanu\n");
    }

    public int answer1() {
        return 2;
    }

    private void question2() {
        Log.info("Rodzaj metafory polegającej na przypisywaniu przedmiotom, zjawiskom przyrody lub pojęciem abstrakcyjnym właściwości istot żywych to: \n");
        Log.info("1) Animalizacja\n           2) Inwokacja\n");
        Log.info("3) Eufemizm \n    4) Pleonazm \n");
    }

    public int answer2() {
        return 1;
    }

    private void question3() {
        Log.info("Co oznacza, związane ze sztuką, pojecie weduta?\n");
        Log.info("1) Rodzaj obrazu w głębokim obramowaniu\n           2) Portrety pięknych kobiet w japońskiej sztuce\n");
        Log.info("3) Naturralność, swoista noszalancja dzieła sztuk\n           4) Dzieło przedstawiające ogólny widok miasta\n");
    }

    public int answer3() {
        return 4;
    }

    private void question4() {
        Log.info("Jak nazywa się francuskie lekko słodkie przeczywo drożdżowe?\n");
        Log.info("1) Colcannon\n           2) Ceylon\n");
        Log.info("3) Panettone\n           4) Brioche\n");
    }

    public int answer4() {
        return 4;
    }
    public String toString() {
        return "Hard Word";
    }
}
