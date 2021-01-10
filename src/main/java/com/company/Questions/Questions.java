package com.company.Questions;


import java.util.Random;

public class Questions {
    int numberQuestionArmy, numberQuestionCounterStrike, numberQuestionCyberPunk, numberQuestionHardWord, numberQuestionLeague,
            numberQuestionMinecraft, numberQuestionProgrammer, numberQuestionProverb, numberQuestionSlang, numberQuestionStarWars,
            numberQuestionSurprise, numberQuestionTheWitcher, numberQuestionVikingHistory, numberQuestionWeapons, numberQuestionWordWarI, numberQuestionWordWarII;

    public String getRandomCategory() {
        String[] name =
                new String[]{"Armia", "Counter Strike", "Cyber Punk", "Trudne Słowa", "League of Legends", "Minecraft",
                        "Programista", "Przysłowia", "Slang", "Star Wars", "Niespodzianka", "Wiedźmin", "Historia Wikingów",
                        "Bronie", "I Wojna Światowa", "II Wojna Światowa"};
        Random random = new Random();
        return name[random.nextInt(16)];
    }


    public Question getQuestion(String category) {
        switch (category) {
            case "Armia": {
                Army army = new Army();
                numberQuestionArmy++;
                return army.getQuestion(numberQuestionArmy);
            }
            case "Counter Strike": {
                CounterStrike counterStrike = new CounterStrike();
                numberQuestionCounterStrike++;
                return counterStrike.getQuestion(numberQuestionCounterStrike);
            }
            case "Cyber Punk": {
                CyberPunk cyberPunk = new CyberPunk();
                numberQuestionCyberPunk++;
                return cyberPunk.getQuestion(numberQuestionCyberPunk);
            }
            case "Trudne Słowa": {
                HardWord hardWord = new HardWord();
                numberQuestionHardWord++;
               return hardWord.getQuestion(numberQuestionHardWord);
            }
            case "League of Legends": {
                LeagueOfLegends leagueOfLegends = new LeagueOfLegends();
                numberQuestionLeague++;
                return leagueOfLegends.getQuestion(numberQuestionLeague);
            }
            case "Minecraft": {
                Minecraft minecraft = new Minecraft();
                numberQuestionMinecraft++;
                return minecraft.getQuestion(numberQuestionMinecraft);
            }
            case "Programista": {
                Programmer programmer = new Programmer();
                numberQuestionProgrammer++;
                return programmer.getQuestion(numberQuestionProgrammer);
            }
            case "Przysłowia":{
                Proverb proverb = new Proverb();
                numberQuestionProverb++;
                return proverb.getQuestion(numberQuestionProverb);
            }
            case "Slang":{
                Slang slang = new Slang();
                numberQuestionSlang++;
                return slang.getQuestion(numberQuestionSlang);
            }
            case "Star Wars":{
                StarWars starWars = new StarWars();
                numberQuestionStarWars++;
                return starWars.getQuestion(numberQuestionStarWars);
            }
            case "Niespodzianka":{
                Surprise surprise = new Surprise();
                numberQuestionSurprise++;
                return surprise.getQuestion(numberQuestionSurprise);
            }
            case "Wiedźmin":{
                TheWitcher theWitcher = new TheWitcher();
                numberQuestionTheWitcher++;
                return theWitcher.getQuestion(numberQuestionTheWitcher);
            }
            case "Historia Wikingów":{
                VikingHistory vikingHistory = new VikingHistory();
                numberQuestionVikingHistory++;
                return vikingHistory.getQuestion(numberQuestionVikingHistory);
            }
            case "Bronie":{
                Weapons weapons = new Weapons();
                numberQuestionWeapons++;
                return weapons.getQuestion(numberQuestionWeapons);
            }
            case "I Wojna Światowa":{
                WordWarI wordWarI = new WordWarI();
                numberQuestionWordWarI++;
                return wordWarI.getQuestion(numberQuestionWordWarI);
            }
            case "II Wojna Światowa":{
                WordWarII wordWarII = new WordWarII();
                numberQuestionWordWarII++;
                return wordWarII.getQuestion(numberQuestionWordWarII);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=");
        }

    }
}
