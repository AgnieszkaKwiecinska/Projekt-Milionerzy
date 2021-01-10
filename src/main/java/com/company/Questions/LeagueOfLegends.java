package com.company.Questions;

import com.company.Log;

public class LeagueOfLegends extends Questions {
    private void question1() {
        Log.info("Co wyrasta Poro gdy nakarmi go Braum?\n");
        Log.info("1) Wąsy\n            2) dodatkowa stopa\n");
        Log.info("3) rogi\n   4) tarcza\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Która z umiejętności to umiejętności mierzona (skill shot)?\n");
        Log.info("1) Nimbus Strike ( Cios Nimbu )\n           2) Transfusion ( Transfuzja)\n");
        Log.info("3) Prey Seeker ( Drapieżnica) \n    4) Sweeoing Blade ( Zamaszyste Cięcie) \n");
    }

    public int answer2() {
        return 3;
    }

    private void question3() {
        Log.info("Kto został wybrany MVP letniego splitu LCS 2017?\n");
        Log.info("1) Rekkles\n           2) Soaz\n");
        Log.info("3) Nukeduck\n           4) Broxah\n");
    }

    public int answer3() {
        return 1;
    }

    private void question4() {
        Log.info("Który z graczy LCS jest znany z najlepszych zagrań Anivią?\n");
        Log.info("1) Froogen\n           2) Febiven\n");
        Log.info("3) Faker\n           4) Bjergsen \n");
    }

    public int answer4() {
        return 1;
    }
    public String toString() {
        return "League of Legends";
    }
}
