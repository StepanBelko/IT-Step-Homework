package by.itstep.stpnbelko.homework.stage13.model.logic;

public class MainTask02Logic {
    public static boolean isMirrorSequence(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
