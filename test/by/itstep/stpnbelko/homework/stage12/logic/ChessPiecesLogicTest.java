package by.itstep.stpnbelko.homework.stage12.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic.checkRockStep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChessPiecesLogicTest {

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

    @Test
    public void testCheckRockStepReturnFalse() {
        int x1 = 4;
        int y1 = 4;

        int[][] points = {{5, 5}, {3, 3}, {3, 5}, {5, 3}, {1, 1}, {1, 7}, {7, 1}, {7, 7}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertFalse(error, checkRockStep(x1, y1, x2, y2));

        }
    }

    //invalid values tests
    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroX1() {
        checkRockStep(0, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroX1andY1() {
        checkRockStep(0, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroY1() {
        checkRockStep(2, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeX1() {
        checkRockStep(-1, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeX1andY1() {
        checkRockStep(-1, -2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeY1() {
        checkRockStep(2, -1, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroX2() {
        checkRockStep(3, 2, 0, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroX2andY2() {
        checkRockStep(2, 2, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepZeroY2() {
        checkRockStep(2, 4, 2, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeX2() {
        checkRockStep(1, 2, 2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeX2andY2() {
        checkRockStep(1, 2, -2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckRockStepNegativeY2() {
        checkRockStep(2, 1, 2, -2);
    }

}

