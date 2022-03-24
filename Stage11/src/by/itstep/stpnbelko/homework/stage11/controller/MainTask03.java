package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask03Solution.isPrime;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class MainTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMain Task 03. Prime number\n");

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String msg = String.format("Number %d is prime? - %b\n", number, isPrime(number));
        printMsg(msg);
    }
}
