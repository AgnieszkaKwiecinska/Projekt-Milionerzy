package milionerzy.Questions;

import java.util.Random;

 public class Questions {
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(16);
    }

    public Questions category(int choice) {
        switch (choice) {
            case 0:
                return new Army();
            case 1:
                return new CounterStrike();
            case 2:
                return new CyberPunk();
            case 3:
                return new HardWord();
            case 4:
                return new LeagueOfLegends();
            case 5:
                return new Minecraft();
            case 6:
                return new Programmer();
            case 7:
                return new Proverb();
            case 8:
                return new Slang();
            case 9:
                return new StarWars();
            case 10:
                return new Surprise();
            case 11:
                return new TheWitcher();
            case 12:
                return new VikingHistory();
            case 13:
                return new Weapons();
            case 14:
                return new WordWarI();
            case 15:
                return new WordWarII();
            default:
                return null;
        }
    }

}
