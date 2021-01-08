package com.company.Questions;


import java.util.Random;

public class Questions {
    int numberQuestionArmy, numberQuestionCounterStrike, numberQuestionCyberPunk, numberQuestionHardWord, numberQuestionLeague,
    numberQuestionMinecraft, numberQuestionProgrammer,numberQuestionProverb, numberQuestionSlang, numberQuestionStarWars,
    numberQuestionSurprise, numberQuestionTheWitcher, numberQuestionVikingHistory, numberQuestionWeapons, numberQuestionWordWarI, numberQuestionWordWarII;

    public String getRandomCategory() {
        String[] name =
                new String[]{"Army", "Counter Strike", "Cyber Punk", "Hard Word", "League of Legends", "Minecraft",
                        "Programmer", "Proverb", "Slang", "Star Wars", "Surprise", "The Witcher", "Viking History",
                        "Weapons", "Word War I", "Word War II"};
        Random random = new Random();
        return name[random.nextInt(16)];
    }


    public void getQuestion(String category) {
        switch (category) {
            case "Army": {
                Army army = new Army();
                numberQuestionArmy++;
                army.questions(numberQuestionArmy);
            }
            case "Counter Strike": {
                CounterStrike counterStrike = new CounterStrike();
                numberQuestionCounterStrike++;
                counterStrike.questions(numberQuestionCounterStrike);
            }
            case "Cyber Punk": {
                CyberPunk cyberPunk = new CyberPunk();
                numberQuestionCyberPunk++;
                cyberPunk.questions(numberQuestionCyberPunk);
            }
            case "Hard Word": {
                HardWord hardWord = new HardWord();
                numberQuestionHardWord++;
                hardWord.questions(numberQuestionHardWord);
            }
            case "League of Legends": {
                LeagueOfLegends leagueOfLegends = new LeagueOfLegends();
                numberQuestionLeague++;
                leagueOfLegends.questions(numberQuestionLeague);
            }
            case "Minecraft": {
                Minecraft minecraft = new Minecraft();
                numberQuestionMinecraft++;
                minecraft.questions(numberQuestionMinecraft);
            }
            case "Programmer": {
                Programmer programmer = new Programmer();
                numberQuestionProgrammer++;
                programmer.questions(numberQuestionProgrammer);
            }
            case "Proverb":{
                Proverb proverb = new Proverb();
                numberQuestionProverb++;
                proverb.questions(numberQuestionProverb);
            }
            case "Slang":{
                Slang slang = new Slang();
                numberQuestionSlang++;
                slang.questions(numberQuestionSlang);
            }
            case "Star Wars":{
                StarWars starWars = new StarWars();
                numberQuestionStarWars++;
                starWars.questions(numberQuestionStarWars);
            }
            case "Surprise":{
                Surprise surprise = new Surprise();
                numberQuestionSurprise++;
                surprise.questions(numberQuestionSurprise);
            }
            case "The Witcher":{
                TheWitcher theWitcher = new TheWitcher();
                numberQuestionTheWitcher++;
                theWitcher.questions(numberQuestionTheWitcher);
            }
            case "Viking History":{
                VikingHistory vikingHistory = new VikingHistory();
                numberQuestionVikingHistory++;
                vikingHistory.questions(numberQuestionVikingHistory);
            }
            case "Weapons":{
                Weapons weapons = new Weapons();
                numberQuestionWeapons++;
                weapons.questions(numberQuestionWeapons);
            }
            case "Word War I":{
                WordWarI wordWarI = new WordWarI();
                numberQuestionWordWarI++;
                wordWarI.questions(numberQuestionWordWarI);
            }
            case "Word War II":{
                WordWarII wordWarII = new WordWarII();
                numberQuestionWordWarII++;
                wordWarII.questions(numberQuestionWordWarII);
            }
        }
    }
}
