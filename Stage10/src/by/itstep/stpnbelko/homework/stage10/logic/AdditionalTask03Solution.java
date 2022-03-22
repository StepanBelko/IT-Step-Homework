package by.itstep.stpnbelko.homework.stage10.logic;

public class AdditionalTask03Solution {

    public static int findEven(int number) {
        int countEven = 0;
        while (number != 0) {
            if (number % 2 == 0)
                countEven++;
            number /= 10;
        }
        return countEven;
    }

    public static int findOdd(int number) {
        int countOdd = 0;
        while (number != 0) {
            if (number % 2 != 0)
                countOdd++;
            number /= 10;
        }
        return countOdd;
    }
}
