package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask02Solution.findArmstrongNumber;
import static by.itstep.stpnbelko.homework.stage11.util.StringBuilder.buildMessage;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class AdditionalTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdditional Task02. Armstrong number\nInput count of digit\n");

        String msg;
        int digitCount = scanner.nextInt();
        if (findArmstrongNumber(digitCount).isEmpty()) {
            msg = "There is not Armstrong numbers\n";
        } else {
            msg = buildMessage(findArmstrongNumber(digitCount));
        }
        printMsg(msg);
    }
}
