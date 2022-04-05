package by.itstep.stpnbelko.homework.stage10.logic;

public class AdditionalTask05Solution {

    public static int searchCountDigit(int number, int digitToSearch) {
        number = number > 0 ? number : -number;
        int counter = 0;
        while (number != 0) {
            if (number % 10 == digitToSearch) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
