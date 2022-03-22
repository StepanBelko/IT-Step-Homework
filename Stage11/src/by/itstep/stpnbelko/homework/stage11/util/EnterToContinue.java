package by.itstep.stpnbelko.homework.stage11.util;

import java.util.Scanner;

public class EnterToContinue {
    public static void pressEnterToContinue() {
        System.out.println("Press Enter to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
