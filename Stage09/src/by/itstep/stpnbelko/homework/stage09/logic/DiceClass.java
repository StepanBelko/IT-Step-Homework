package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.Random;

public class DiceClass {

    public static int countSumTwoRandomNumbers() {
        Random random = new Random();
        return random.nextInt(6) + random.nextInt(6) + 2;
    }
}
