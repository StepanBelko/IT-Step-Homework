package by.itstep.stpnbelko.homework.stage12.logic;

public class ChessPiecesLogic {
    public static boolean checkRockStep(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2);
    }

}