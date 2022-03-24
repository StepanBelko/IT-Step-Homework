package by.itstep.stpnbelko.homework.stage11.controller;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask03Solution.countHappyTicket;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class AdditionalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAdditional Task03. Counting happy tickets\n");

        System.out.print("Input count of digit in bus ticket number: ");
        int ticketCount = scanner.nextInt();
        String msg = String.format("Count of happy tickets: %d", countHappyTicket(ticketCount));
        printMsg(msg);
    }
}
