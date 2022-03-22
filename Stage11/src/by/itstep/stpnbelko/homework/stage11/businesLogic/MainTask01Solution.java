package by.itstep.stpnbelko.homework.stage11.businesLogic;

import java.util.Random;

public class MainTask01Solution {
    public static final int NUMBER_OF_THROWS = 1000;

    public static int countHead() {
        Random random = new Random();
        int heads = 0;
        for (int i = 0; i < NUMBER_OF_THROWS; i++) {
            if (random.nextInt(2) == 1) {
                heads++;
            }
        }
        return heads;
    }
}
