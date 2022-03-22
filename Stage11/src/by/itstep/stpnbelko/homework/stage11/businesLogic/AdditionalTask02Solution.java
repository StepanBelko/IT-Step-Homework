package by.itstep.stpnbelko.homework.stage11.businesLogic;

import java.util.ArrayList;
import java.util.List;

public class AdditionalTask02Solution {
    public static List<Integer> findArmstrongNumber(int digitCount) {
        List <Integer> arrayList = new ArrayList<>();
        if (digitCount <=0)
            return arrayList;
        for (int i = (int) Math.pow(10, digitCount - 1); i < Math.pow(10, digitCount); i++) {
            int number = i;
            int sumOfDigit = 0;
            while (number != 0) {
                sumOfDigit += (int) Math.pow(number % 10, digitCount);
                number /= 10;
            }
            if (sumOfDigit == i) {
                arrayList.add(sumOfDigit);
            }
        }
        return arrayList;
    }
}
