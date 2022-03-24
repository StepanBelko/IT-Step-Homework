package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask04Solution.findFactorial;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class MainTask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMain Task 04. Find factorial\n");

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String msg = String.format("%d! = %d\n", number, findFactorial(number));
        printMsg(msg);
    }
}
