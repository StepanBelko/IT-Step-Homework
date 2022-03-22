package by.itstep.stpnbelko.homework.stage10.logic;

public class MainTask04Solution {

    public static boolean isPalindrome(int number) {
        boolean isPalindrome = true;
        String numStr = number + "";
        char[] array = numStr.toCharArray();
        for (int i = 0; i < (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static boolean isPalindromeCycle(int number) {
        int newNumber = 0;
        int numberSave = number;
        while (number != 0) {
            newNumber = newNumber * 10 + number % 10;
            number /= 10;
        }
        return newNumber == numberSave;
    }
}
