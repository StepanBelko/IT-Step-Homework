package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask01Solution.countDigitSum;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class GeneralTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("General Task 01. Count sum of digit\n Enter number N ");

        long longNumber = scanner.nextLong();
        String msg = String.format("Number = %d, sum of all digit = %d\n",
                longNumber, countDigitSum(longNumber));
        printMsg(msg);
    }
}
