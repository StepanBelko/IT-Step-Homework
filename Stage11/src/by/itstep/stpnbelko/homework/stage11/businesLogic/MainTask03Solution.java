package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class MainTask03Solution {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        int devisor = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                devisor++;
            }
            if (devisor > 0) {
                return false;
            }
        }
        return true;
    }
}
