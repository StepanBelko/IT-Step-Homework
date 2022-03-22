package by.itstep.stpnbelko.homework.stage10.logic;

public class AdditionalTask04Solution {
    public static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number != 0 && maxDigit != 9) {
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
            number /= 10;
        }
        return maxDigit;
    }
}
