package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask01Solution {
    public static boolean checkNumbers(int number) {
        if (number <= 0) {
            System.out.println("invalid number");
            return false;
        }
        while (number / 10 != 0) {
            int lastNum = number % 10;
            number /= 10;
            if (number % 10 != lastNum) {
                return false;
            }
        }
        return true;

    }
}
