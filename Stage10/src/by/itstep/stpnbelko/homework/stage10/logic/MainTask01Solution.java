package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask01Solution {

    public static boolean checkNumbers(int number) {

        for (; number / 10 != 0; number /= 10) {
            if ((number / 10) % 10 != number % 10) {
                return false;
            }
        }
        return true;
    }

}
