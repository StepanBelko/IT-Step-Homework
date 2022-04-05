package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask05Solution.findPrimeDividers;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class MainTask05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMain Task 05. Prime dividers\n");

        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String msg = String.format("Prime dividers %d is %s", number, findPrimeDividers(number));
        printMsg(msg);
    }
}
