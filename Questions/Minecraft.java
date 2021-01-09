package milionerzy.Questions;

import milionerzy.Log;

public class Minecraft extends Questions {
    private void question1() {
        Log.info("Jaki kilof jest wymagany aby wydobyć rudę złota?\n");
        Log.info("1) Żelazny\n            2) Kamienny\n");
        Log.info("3) Złoty\n   4) Diamentowy\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Jaki producent wydał Minecrafta?\n");
        Log.info("1) Ubisoft\n           2) Mojang\n");
        Log.info("3) Microsoft \n    4) Electronic Arts \n");
    }

    public int answer2() {
        return 2;
    }

    private void question3() {
        Log.info("Płomyki stzrelają seriami po ile kul ognia?\n");
        Log.info("1) 5\n           2) 3\n");
        Log.info("3) 4\n           4) 2\n");
    }

    public int answer3() {
        return 2;
    }

    private void question4() {
        Log.info(" W jakiej wersji gry chwilowo pojawiły sie barwione deski?\n");
        Log.info("1) 1.3.1\n           2) 1.3.2 \n");
        Log.info("3) 1.2.5\n           4) 1.2 \n");
    }

    public int answer4() {
        return 3;
    }

    public String toString() {
        return "Minecraft";
    }
}
