package by.itstep.stpnbelko.homework.stage12.logic;

public class ChessPiecesLogic {
    final static int DECK_SIZE = 8;

    private static boolean isInvalidValue(int x1, int y1, int x2, int y2) {
        return x1 <= 0 || x2 <= 0 || y1 <= 0 || y2 <= 0 ||
                x1 > DECK_SIZE || x2 > DECK_SIZE ||
                y1 > DECK_SIZE || y2 > DECK_SIZE;
    }

    public static boolean checkRockStep(int x1, int y1, int x2, int y2) {
        if (isInvalidValue(x1, y1, x2, y2)) throw new RuntimeException();

        return (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2);
    }

}