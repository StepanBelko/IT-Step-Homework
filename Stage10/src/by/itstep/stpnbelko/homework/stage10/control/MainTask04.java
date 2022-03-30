package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.MainTask04Solution.isPalindrome;
import static by.itstep.stpnbelko.homework.stage10.logic.MainTask04Solution.isPalindromeCycle;

//Разработайте программу, которая проверяет, что заданное натуральное число
//читается одинаково слева направо и справа налево (т.е. является палиндромом).
//К примеру, числа 1235321, 112211, 7 и 1221 – удовлетворяют условию, а числа 12345321, 1000 и 12 – нет.
public class MainTask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        String msg = String.format("Array method\nNumber is palindrome? - %s\n",
                isPalindrome(number) ? "Yes" : "No");
        Printer.printMsg(msg);

        msg = String.format("Cycle method\nNumber is palindrome? - %s\n",
                isPalindromeCycle(number) ? "Yes" : "No");
        Printer.printMsg(msg);
    }
}

