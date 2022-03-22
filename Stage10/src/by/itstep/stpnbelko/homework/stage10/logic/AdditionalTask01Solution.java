package by.itstep.stpnbelko.homework.stage10.logic;

public class AdditionalTask01Solution {

    public static boolean isAllNumEven(int number) {
        boolean isEven = true;
        while (number != 0) {
            if (number % 2 != 0) {
                isEven = false;
                break;
            }
            number /= 10;
        }
        return isEven;
    }
}
