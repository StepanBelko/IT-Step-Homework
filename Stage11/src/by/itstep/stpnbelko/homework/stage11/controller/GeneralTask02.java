package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask02Solution.countDifferentDigit;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class GeneralTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("General Task 02. Found different digit\n Enter number N: ");

        long longNumber = scanner.nextLong();
        String msg = String.format("Number %d have %d different digit\n", longNumber, countDifferentDigit(longNumber));
        printMsg(msg);
    }
}
