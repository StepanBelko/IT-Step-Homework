package by.itstep.stpnbelko.homework.stage11.businesLogic;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask03Solution.isPrime;

public class MainTask05Solution {
    public static StringBuilder findPrimeDividers(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number < -1) {
            stringBuilder.append("-");
            number = -number;
        }
        if (number >= -1 && number <= 1) {
            stringBuilder.append("NO ");
        }
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && number % i == 0) {
                while (number % i == 0) {
                    stringBuilder.append(i).append(" ");
                    number /= i;
                }
            }
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder;
    }
}
