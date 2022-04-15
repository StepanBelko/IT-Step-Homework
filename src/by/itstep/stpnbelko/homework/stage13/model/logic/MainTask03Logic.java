package by.itstep.stpnbelko.homework.stage13.model.logic;

public class MainTask03Logic {
    
    public static boolean isAllElementsDifferent(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAllElementsSame(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
