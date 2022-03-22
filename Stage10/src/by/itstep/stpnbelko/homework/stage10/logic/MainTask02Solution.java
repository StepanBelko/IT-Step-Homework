package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask02Solution {

    public static boolean checkSameNumbers(int number) {
        number = number > 0 ? number : -number;
        while (number / 10 != 0) {
            int lastNum = number % 10;
            number /= 10;
            if (number % 10 != lastNum) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkDifferentNumbers(int number) {
        if (number > -10 && number < 10)
            return false;
        String numStr = number + "";
        char[] array = numStr.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkDiffNumCycle(int number) {
        if (number > -10 && number < 10)
            return false;

        int numberSave = number;
        while (numberSave != 0) {
            int lastDigit = numberSave % 10;
            number = numberSave / 10;
            while (number != 0) {
                if (number % 10 == lastDigit) {
                    return false;
                }
                number /= 10;
            }
            numberSave /= 10;
        }
        return true;
    }
}
