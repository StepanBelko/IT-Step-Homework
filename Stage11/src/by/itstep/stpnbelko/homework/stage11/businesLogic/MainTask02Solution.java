package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class MainTask02Solution {
    public static int writeReverseNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }
}
