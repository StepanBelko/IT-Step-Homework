package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelDLogic {
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
}
