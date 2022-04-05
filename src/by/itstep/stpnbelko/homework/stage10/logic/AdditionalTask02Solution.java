package by.itstep.stpnbelko.homework.stage10.logic;

public class AdditionalTask02Solution {
    public static boolean isAllNumOdd(int number) {
        boolean isOdd = true;
        while (number != 0) {
            if (number % 2 == 0) {
                isOdd = false;
                break;
            }
            number /= 10;
        }
        return isOdd;
    }
}
