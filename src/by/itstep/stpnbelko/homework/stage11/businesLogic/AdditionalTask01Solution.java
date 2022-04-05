package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class AdditionalTask01Solution {
    public static int findGreatestCommonDivisor(int a, int b) {
//      Euclid's algorithm:
        if (a <= 0 || b <= 0)
            return -404;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static int findLeastCommonMultiple(int a, int b) {
        if (a <= 0 || b <= 0)
            return -404;
        return (a * b) / findGreatestCommonDivisor(a, b);
    }
}
