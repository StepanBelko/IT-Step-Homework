package by.itstep.stpnbelko.homework.stage12.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic.checkRockStep;
import static org.junit.Assert.assertTrue;

public class ChessPiecesLogicTest {

//    @Test
//    public void testCheckRockStepReturnFalse() {
//        assertFalse(checkRockStep(4, 4, 5, 5));
//    }

    @Test
    public void testCheckRockStepReturnTrue() {
        int x1 = 4;
        int y1 = 4;

        int[][] points = {{1, 4}, {2, 4}, {3, 4}, {5, 4}, {6, 4}, {7, 4}, {8, 4},
                {4, 1}, {4, 2}, {4, 3}, {4, 5}, {4, 6}, {4, 7}, {4, 8}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertTrue(error, checkRockStep(x1, y1, x2, y2));
        }
    }

//    @Test
//    public void testSameCell() {
//        assertFalse(checkRockStep(4, 4, 4, 4));
//    }
}