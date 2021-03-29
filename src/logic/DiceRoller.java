package logic;

import java.util.Random;

public class DiceRoller {

    public static int d6(final int diceAmount){
        final Random r = new Random();
        return r.nextInt(diceAmount * 6) + 1;
    }

    public static int d66(){
        final Random r = new Random();
        final int result = (10 * (r.nextInt(6) + 1)) + r.nextInt(6) + 1;
        return result;
    }

    public static int d8(final int diceAmount){
        final Random r = new Random();
        return r.nextInt(diceAmount * 8) + 1;
    }

    public static int d4(final int diceAmount){
        final Random r = new Random();
        return r.nextInt(diceAmount * 4) + 1;
    }

    public static int d3(final int diceAmount){
        final Random r = new Random();
        return r.nextInt(diceAmount * 3) + 1;
    }
}
