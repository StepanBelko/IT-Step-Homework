package by.itstep.stpnbelko.homework.stage12.control;

import by.itstep.stpnbelko.homework.stage12.view.Printer;
import static by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongCoordinateException {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input 4 numbers");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = checkRockStep(x1, y1, x2, y2);
        System.out.print("Rock ");
        String msg = result ? "YES" : "NO";
        Printer.print(msg);

        result = checkKingStep(x1, y1, x2, y2);
        System.out.print("King ");
        msg = result ? "YES" : "NO";
        Printer.print(msg);

        result = checkElephantStep(x1, y1, x2, y2);
        System.out.print("Elephant ");
        msg = result ? "YES" : "NO";
        Printer.print(msg);

        result = checkQueenStep(x1, y1, x2, y2);
        System.out.print("Queen ");
        msg = result ? "YES" : "NO";
        Printer.print(msg);

        result = checkHorseStep(x1, y1, x2, y2);
        System.out.print("Horse ");
        msg = result ? "YES" : "NO";
        Printer.print(msg);
    }
}