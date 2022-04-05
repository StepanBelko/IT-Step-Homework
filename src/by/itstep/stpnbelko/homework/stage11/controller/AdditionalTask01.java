package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask01Solution.findGreatestCommonDivisor;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask01Solution.findLeastCommonMultiple;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class AdditionalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdditional Task01. Greatest common divisor\n");

        System.out.print("Input number a: ");
        int a = scanner.nextInt();
        System.out.print("Input number b : ");
        int b = scanner.nextInt();
        String msg = String.format("Greatest common divisor numbers %d and %d is %d",
                a, b, findGreatestCommonDivisor(a, b));
        printMsg(msg);
        msg = String.format("\nLeast common multiple numbers %d and %d is %d",
                a, b, findLeastCommonMultiple(a, b));
        printMsg(msg);
    }
}
