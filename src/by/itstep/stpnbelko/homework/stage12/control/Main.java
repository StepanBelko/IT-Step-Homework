package by.itstep.stpnbelko.homework.stage12.control;

import by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic;
import by.itstep.stpnbelko.homework.stage12.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input 4 numbers");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = ChessPiecesLogic.checkRockStep(x1, y1, x2, y2);

        String msg = result ? "YES" : "NO";

        Printer.print(msg);
    }
}