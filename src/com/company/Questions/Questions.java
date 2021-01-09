package com.company.Questions;


import java.util.Random;

public class Questions {
    int numberQuestionArmy, numberQuestionCounterStrike, numberQuestionCyberPunk, numberQuestionHardWord, numberQuestionLeague,
    numberQuestionMinecraft, numberQuestionProgrammer,numberQuestionProverb, numberQuestionSlang, numberQuestionStarWars,
    numberQuestionSurprise, numberQuestionTheWitcher, numberQuestionVikingHistory, numberQuestionWeapons, numberQuestionWordWarI, numberQuestionWordWarII;

    public String getRandomCategory() {
        String[] name =
                new String[]{"Armia", "Counter Strike", "Cyber Punk", "Trudne Słowa", "League of Legends", "Minecraft",
                        "Programista", "Przysłowia", "Slang", "Star Wars", "Niespodzianka", "Wiedźmin", "Historia Wikingów",
                        "Bronie", "I Wojna Światowa", "II Wojna Światowa"};
        Random random = new Random();
        return name[random.nextInt(16)];
    }


    public void getQuestion(String category) {
        switch (category) {
            case "Armia": {
                Army army = new Army();
                numberQuestionArmy++;
                army.questions(numberQuestionArmy);
                break;
            }
            case "Counter Strike": {
                CounterStrike counterStrike = new CounterStrike();
                numberQuestionCounterStrike++;
                counterStrike.questions(numberQuestionCounterStrike);
                break;
            }
            case "Cyber Punk": {
                CyberPunk cyberPunk = new CyberPunk();
                numberQuestionCyberPunk++;
                cyberPunk.questions(numberQuestionCyberPunk);
                break;
            }
            case "Trudne Słowa": {
                HardWord hardWord = new HardWord();
                numberQuestionHardWord++;
                hardWord.questions(numberQuestionHardWord);
                break;
            }
            case "League of Legends": {
                LeagueOfLegends leagueOfLegends = new LeagueOfLegends();
                numberQuestionLeague++;
                leagueOfLegends.questions(numberQuestionLeague);
                break;
            }
            case "Minecraft": {
                Minecraft minecraft = new Minecraft();
                numberQuestionMinecraft++;
                minecraft.questions(numberQuestionMinecraft);
                break;
            }
            case "Programista": {
                Programmer programmer = new Programmer();
                numberQuestionProgrammer++;
                programmer.questions(numberQuestionProgrammer);
                break;
            }
            case "Przysłowia":{
                Proverb proverb = new Proverb();
                numberQuestionProverb++;
                proverb.questions(numberQuestionProverb);
                break;
            }
            case "Slang":{
                Slang slang = new Slang();
                numberQuestionSlang++;
                slang.questions(numberQuestionSlang);
                break;
            }
            case "Star Wars":{
                StarWars starWars = new StarWars();
                numberQuestionStarWars++;
                starWars.questions(numberQuestionStarWars);
                break;
            }
            case "Niespodzianka":{
                Surprise surprise = new Surprise();
                numberQuestionSurprise++;
                surprise.questions(numberQuestionSurprise);
                break;
            }
            case "Wiedźmin":{
                TheWitcher theWitcher = new TheWitcher();
                numberQuestionTheWitcher++;
                theWitcher.questions(numberQuestionTheWitcher);
                break;
            }
            case "Historia Wikingów":{
                VikingHistory vikingHistory = new VikingHistory();
                numberQuestionVikingHistory++;
                vikingHistory.questions(numberQuestionVikingHistory);
                break;
            }
            case "Bronie":{
                Weapons weapons = new Weapons();
                numberQuestionWeapons++;
                weapons.questions(numberQuestionWeapons);
                break;
            }
            case "I Wojna Światowa":{
                WordWarI wordWarI = new WordWarI();
                numberQuestionWordWarI++;
                wordWarI.questions(numberQuestionWordWarI);
                break;
            }
            case "II Wojna Światowa":{
                WordWarII wordWarII = new WordWarII();
                numberQuestionWordWarII++;
                wordWarII.questions(numberQuestionWordWarII);
                break;
            }
        }
    }
}
