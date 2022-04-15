package by.itstep.stpnbelko.homework.stage13.model.logic;

public class MainTask04Logic {

    public static int countEvenElements(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddElements(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
