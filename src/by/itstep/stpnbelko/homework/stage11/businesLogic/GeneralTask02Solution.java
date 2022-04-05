package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class GeneralTask02Solution {
    public static long countDifferentDigit(long number) {
        int lastDigitCounter = 0;
        int digitCount = (number == 0 ? 1 : 0);
        while ((number != 0) && (digitCount < 10)) {
            long tempNumber = number;
            long lastDigit = tempNumber % 10;

            while (tempNumber != 0) {
                if (tempNumber % 10 == lastDigit) {
                    lastDigitCounter++;
                }
                tempNumber /= 10;
            }

            if (lastDigitCounter == 1) {
                digitCount++;
            }

            number /= 10;
            lastDigitCounter = 0;
        }

        return digitCount;
    }
}
