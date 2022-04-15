package by.itstep.stpnbelko.homework.stage13.model.util;

import java.util.Random;

public class Array {
    static final int MAX_VALUE = 10;
    static final int MIN_VALUE = -10;
    static Random random = new Random();

    public static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
    }
}
