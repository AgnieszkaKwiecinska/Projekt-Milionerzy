package com.company.Questions;

import com.company.Log;

public class VikingHistory extends Questions {
    private int answer;

    public void questions(int numberQuestion) {
        switch (numberQuestion) {
            case 1: {
                Log.info("Rzecznicy Teorii, że osiedla w dawnej Rusi były zasadniczo słowiańskie zwani są: \n");
                Log.info("1) Antynormanistami\n2) Heretykami\n3) Słowianistami\n4) Normanistami\n");
                answer = 1;
                break;
            }
            case 2: {
                Log.info("Haraldowi Sinozębnemu przypisuje się ulepszenie urządzeń obronnych w: \n");
                Log.info("1) Bornholm, Gokstad i Tendheim\n2) Hedeby, Olso i Trondhein\n3) Hedeby, Ribe i Århus\n4) Tedheim ,Århus i Kattegat \n");
                answer = 3;
                break;
            }

            case 3: {
                Log.info("Kto w 943 roku pretendował do miana króla Yorku?\n");
                Log.info("1) Harald Srogi\n2) Edmund\n3) Rognvald Guthrotgsson\n4) Wulfstan\n");
                answer = 3;
                break;
            }

            case 4: {
                Log.info("Kto ok.975 roku, złożył Sigtunę - siedzibę Szwedzkich Królów?\n");
                Log.info("1) Grundtvig\n2) Hardegon Sveinsson\n3) Eryk Segersall Zwycięski\n4) Olaf II Haraldsson\n");
                answer = 3;
                break;
            }

        }
    }

    public int getAnswer() {
        return answer;
    }

}
