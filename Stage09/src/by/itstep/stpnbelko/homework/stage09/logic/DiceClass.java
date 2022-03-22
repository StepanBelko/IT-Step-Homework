package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.Random;

public class DiceClass {

    public static int countRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
