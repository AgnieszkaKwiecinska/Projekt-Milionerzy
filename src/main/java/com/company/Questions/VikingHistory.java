package com.company.Questions;

import com.company.Log;

public class VikingHistory extends Questions {
    private void question1() {
        Log.info("Rzecznicy Teorii, że osiedla w dawnej Rusi były zasadniczo słowiańskie zwani są: \n");
        Log.info("1) Antynormanistami\n         2) Heretykami\n");
        Log.info("3) Słowianistami\n   4) Normanistami\n");
    }

    public int answer1() {
        return 1;
    }

    private void question2() {
        Log.info("Haraldowi Sinozębnemu przypisuje się ulepszenie urządzeń obronnych w: \n");
        Log.info("1) Bornholm, Gokstad i Tendheim\n           2) Hedeby, Olso i Trondhein\n");
        Log.info("3) Hedeby, Ribe i Århus\n    4) Tedheim ,Århus i Kattegat \n");
    }

    public int answer2() {
        return 3;
    }

    private void question3() {
        Log.info("Kto w 943 roku pretendował do miana króla Yorku?\n");
        Log.info("1) Harald Srogi\n           2) Edmund\n");
        Log.info("3) Rognvald Guthrotgsson\n           4) Wulfstan\n");
    }

    public int answer3() {
        return 3;
    }

    private void question4() {
        Log.info("Kto ok.975 roku, złożył Sigtunę - siedzibę Szwedzkich Królów?\n");
        Log.info("1) Grundtvig\n           2) Hardegon Sveinsson\n");
        Log.info("3) Eryk Segersall Zwycięski\n           4) Olaf II Haraldsson\n");
    }

    public int answer4() {
        return 3;
    }

    public String toString() {
        return "Viking History";
    }
}
