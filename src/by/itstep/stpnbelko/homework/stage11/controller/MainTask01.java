package by.itstep.stpnbelko.homework.stage11.controller;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask01Solution.NUMBER_OF_THROWS;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask01Solution.countHead;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class MainTask01 {
    public static void main(String[] args) {
        System.out.print("\nMain Task 01. Heads or tails?\n");

        int heads = countHead();
        String msg = String.format("Number of throws = %d\nHeads = %d, tails = %d\n", NUMBER_OF_THROWS,
                heads, NUMBER_OF_THROWS - heads);
        printMsg(msg);
    }
}
