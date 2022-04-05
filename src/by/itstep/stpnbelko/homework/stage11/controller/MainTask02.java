package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask02Solution.writeReverseNumber;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class MainTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMain Task 02. Reverse number\n");

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String msg = String.format("Number = %d, reverseNumber = %d\n", number, writeReverseNumber(number));
        printMsg(msg);
    }
}
