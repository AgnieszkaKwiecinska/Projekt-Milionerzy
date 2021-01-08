package milionerzy.Boxes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BoxFive implements Pool {
    Random rand = new Random();

    private int RandomPrize;
    private List<Integer> cash = Arrays.asList(60000, 100000, 170000);

    public List<Integer> money() {
        return this.cash;
    }

    public int randomPrizeMoney() {
        RandomPrize = cash.get(rand.nextInt(cash.size()));
        return RandomPrize;
    }
}
