package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask02Solution {

    public static boolean checkSameNumbers(int number) {
        while (number / 10 != 0) {
            if (number / 10 % 10 != number % 10) {
                return false;
            }
            number /= 10;
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
        if (number > -10 && number < 10) {
            return false;
        } else {
            for (int numberSave = number; numberSave != 0; numberSave /= 10) {
                for (number = numberSave / 10; number != 0; number /= 10) {
                    if (number % 10 == numberSave % 10) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
