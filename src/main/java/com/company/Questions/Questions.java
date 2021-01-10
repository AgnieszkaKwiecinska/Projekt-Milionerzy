package com.company.Questions;


import java.util.Random;

public class Questions {
    int numberQuestion = getRandomQuestion();

    public String getRandomCategory() {
        String[] name =
                new String[]{"Armia", "Counter Strike", "Cyber Punk", "Trudne Słowa", "League of Legends", "Minecraft",
                        "Programista", "Przysłowia", "Slang", "Star Wars", "Niespodzianka", "Wiedźmin", "Historia Wikingów",
                        "Bronie", "I Wojna Światowa", "II Wojna Światowa"};
        Random random = new Random();
        return name[random.nextInt(16)];
    }
    public int getRandomQuestion(){
        Random rand = new Random();
        return rand.nextInt(5) + 1;
    }

    public Question getQuestion(String category) {
        switch (category) {
            case "Armia": {
                Army army = new Army();
                numberQuestion = getRandomQuestion();
                return army.getQuestion(numberQuestion);
            }
            case "Counter Strike": {
                CounterStrike counterStrike = new CounterStrike();
                return counterStrike.getQuestion(numberQuestion);
            }
            case "Cyber Punk": {
                CyberPunk cyberPunk = new CyberPunk();
                return cyberPunk.getQuestion(numberQuestion);
            }
            case "Trudne Słowa": {
                HardWord hardWord = new HardWord();
               return hardWord.getQuestion(numberQuestion);
            }
            case "League of Legends": {
                LeagueOfLegends leagueOfLegends = new LeagueOfLegends();
                return leagueOfLegends.getQuestion(numberQuestion);
            }
            case "Minecraft": {
                Minecraft minecraft = new Minecraft();
                return minecraft.getQuestion(numberQuestion);
            }
            case "Programista": {
                Programmer programmer = new Programmer();
                return programmer.getQuestion(numberQuestion);
            }
            case "Przysłowia":{
                Proverb proverb = new Proverb();
                return proverb.getQuestion(numberQuestion);
            }
            case "Slang":{
                Slang slang = new Slang();
                return slang.getQuestion(numberQuestion);
            }
            case "Star Wars":{
                StarWars starWars = new StarWars();
                return starWars.getQuestion(numberQuestion);
            }
            case "Niespodzianka":{
                Surprise surprise = new Surprise();
                return surprise.getQuestion(numberQuestion);
            }
            case "Wiedźmin":{
                TheWitcher theWitcher = new TheWitcher();
                return theWitcher.getQuestion(numberQuestion);
            }
            case "Historia Wikingów":{
                VikingHistory vikingHistory = new VikingHistory();
                return vikingHistory.getQuestion(numberQuestion);
            }
            case "Bronie":{
                Weapons weapons = new Weapons();
                return weapons.getQuestion(numberQuestion);
            }
            case "I Wojna Światowa":{
                WordWarI wordWarI = new WordWarI();
                return wordWarI.getQuestion(numberQuestion);
            }
            case "II Wojna Światowa":{
                WordWarII wordWarII = new WordWarII();
                return wordWarII.getQuestion(numberQuestion);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=");
        }

    }
}
