import java.util.Scanner;

//Разработайте программу,которая проверяет,что заданное натуральное число
//читается одинаково слева направо и справа налево (т.е. является палиндромом).
//К примеру, числа 1235321, 112211, 7 и 1221 – удовлетворяют условию, а числа 12345321, 1000 и 12 – нет.
public class MainTask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.printf("Array method\nNumber is palindrome = %s\n", MainTask04Solution.isPalindrome(number));
        System.out.printf("Cycle method\nNumber is palindrome = %s\n", MainTask04Solution.isPalindromeCycle(number));
    }
}

class MainTask04Solution {
    public static boolean isPalindrome(int number) {
        boolean isPalindrome = true;
        String numStr = number + "";
        char[] array = numStr.toCharArray();
        for (int i = 0; i < (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i])
                isPalindrome = false;
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
