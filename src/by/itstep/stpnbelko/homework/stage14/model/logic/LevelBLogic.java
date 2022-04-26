package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelBLogic {
    public static int countItemsMoreThanN(int[] array, int N) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int element : array) {
            if (element > N) {
                count++;
            }
        }
        return count;
    }

    public static int countElementAbsMoreThanN(int[] array, int N) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int element : array) {
            if (element > N || element < -N) {
                count++;
            }
        }
        return count;
    }
}
