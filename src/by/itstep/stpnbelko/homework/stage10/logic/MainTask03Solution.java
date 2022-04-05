package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask03Solution {
    public static boolean isAscendingSequence(int number) {
        if (number == 0)
            return false;
        while (number / 10 != 0) {
            if (number % 10 > (number / 10) % 10) {
                number /= 10;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescendingSequence(int number) {
        if (number == 0)
            return false;
        while (number / 10 != 0) {
            if (number % 10 < (number / 10) % 10) {
                number /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}
