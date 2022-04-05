package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class GeneralTask01Solution {

    public static long countDigitSum(long number) {
        number = number > 0 ? number : -number;
        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

