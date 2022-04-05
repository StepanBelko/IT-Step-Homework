package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class MainTask04Solution {
    public static long findFactorial(int number) {
        if (number <= 0) {
            return -1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
