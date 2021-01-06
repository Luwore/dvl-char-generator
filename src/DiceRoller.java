import java.util.Random;

public class DiceRoller {
    private static int diceResult = 0;

    public static int d6(int diceAmount){
        Random r = new Random();
        return r.nextInt(diceAmount * 6) + 1;
    }

    public static int d66(){
        Random r = new Random();
        int result = (10 * (r.nextInt(6) + 1)) + r.nextInt(6) + 1;
        return result;
    }

    public static int d8(int diceAmount){
        Random r = new Random();
        return r.nextInt(diceAmount * 8) + 1;
    }
}
