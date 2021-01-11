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
        return rand.nextInt(4) + 1;
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
                numberQuestion = getRandomQuestion();
                return counterStrike.getQuestion(numberQuestion);
            }
            case "Cyber Punk": {
                CyberPunk cyberPunk = new CyberPunk();
                numberQuestion = getRandomQuestion();
                return cyberPunk.getQuestion(numberQuestion);
            }
            case "Trudne Słowa": {
                HardWord hardWord = new HardWord();
                numberQuestion = getRandomQuestion();
               return hardWord.getQuestion(numberQuestion);
            }
            case "League of Legends": {
                LeagueOfLegends leagueOfLegends = new LeagueOfLegends();
                numberQuestion = getRandomQuestion();
                return leagueOfLegends.getQuestion(numberQuestion);
            }
            case "Minecraft": {
                Minecraft minecraft = new Minecraft();
                numberQuestion = getRandomQuestion();
                return minecraft.getQuestion(numberQuestion);
            }
            case "Programista": {
                Programmer programmer = new Programmer();
                numberQuestion = getRandomQuestion();
                return programmer.getQuestion(numberQuestion);
            }
            case "Przysłowia":{
                Proverb proverb = new Proverb();
                numberQuestion = getRandomQuestion();
                return proverb.getQuestion(numberQuestion);
            }
            case "Slang":{
                Slang slang = new Slang();
                numberQuestion = getRandomQuestion();
                return slang.getQuestion(numberQuestion);
            }
            case "Star Wars":{
                StarWars starWars = new StarWars();
                numberQuestion = getRandomQuestion();
                return starWars.getQuestion(numberQuestion);
            }
            case "Niespodzianka":{
                Surprise surprise = new Surprise();
                numberQuestion = getRandomQuestion();
                return surprise.getQuestion(numberQuestion);
            }
            case "Wiedźmin":{
                TheWitcher theWitcher = new TheWitcher();
                numberQuestion = getRandomQuestion();
                return theWitcher.getQuestion(numberQuestion);
            }
            case "Historia Wikingów":{
                VikingHistory vikingHistory = new VikingHistory();
                numberQuestion = getRandomQuestion();
                return vikingHistory.getQuestion(numberQuestion);
            }
            case "Bronie":{
                Weapons weapons = new Weapons();
                numberQuestion = getRandomQuestion();
                return weapons.getQuestion(numberQuestion);
            }
            case "I Wojna Światowa":{
                WordWarI wordWarI = new WordWarI();
                numberQuestion = getRandomQuestion();
                return wordWarI.getQuestion(numberQuestion);
            }
            case "II Wojna Światowa":{
                WordWarII wordWarII = new WordWarII();
                numberQuestion = getRandomQuestion();
                return wordWarII.getQuestion(numberQuestion);
            }
            default:
                throw new IllegalArgumentException("Unsupported question number=");
        }

    }
}
