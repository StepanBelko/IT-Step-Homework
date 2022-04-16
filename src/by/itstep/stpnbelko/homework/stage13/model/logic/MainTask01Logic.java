package by.itstep.stpnbelko.homework.stage13.model.logic;

public class MainTask01Logic {
    public static boolean isAscendingCondition(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescendingCondition(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
