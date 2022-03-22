import java.util.Scanner;

//Разработайте программу, которая проверяет, что все цифры заданного
//натурального числа различны (или одинаковы).
public class MainTask02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = scanner.nextInt();
        System.out.println("All numbers the same = " + MainTask02Solution.checkSameNumbers(number));
        System.out.println("All numbers are different(Array) = " + MainTask02Solution.checkDifferentNumbers(number));
        System.out.println("All numbers are different(Cycle) = " + MainTask02Solution.checkDiffNumCycle(number));
    }
}

class MainTask02Solution {

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
