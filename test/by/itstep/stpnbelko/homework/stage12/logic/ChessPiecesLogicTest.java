package by.itstep.stpnbelko.homework.stage12.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChessPiecesLogicTest {

    //    checkRockStep() Tests
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

        int[][] points = {{4, 4}, {5, 5}, {3, 3}, {3, 5}, {5, 3}, {1, 1}, {1, 7}, {7, 1}, {7, 7}};

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


    //    checkKingStep() Tests
    @Test
    public void testCheckKingStepReturnTrue() {
        int x1 = 5;
        int y1 = 3;

        int[][] points = {{5, 2}, {5, 4}, {4, 3}, {6, 3}, {4, 2}, {4, 4}, {6, 2}, {6, 4}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertTrue(error, checkKingStep(x1, y1, x2, y2));

        }
    }

    @Test
    public void testCheckKingStepReturnFalse() {
        int x1 = 5;
        int y1 = 3;

        int[][] points = {{5, 3}, {5, 5}, {3, 3}, {3, 5}, {7, 1}, {3, 1}, {1, 7}, {7, 5}, {7, 3}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertFalse(error, checkKingStep(x1, y1, x2, y2));

        }
    }

    //invalid values tests
    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroX1() {
        checkKingStep(0, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroX1andY1() {
        checkKingStep(0, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroY1() {
        checkKingStep(2, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeX1() {
        checkKingStep(-1, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeX1andY1() {
        checkKingStep(-1, -2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeY1() {
        checkKingStep(2, -1, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroX2() {
        checkKingStep(3, 2, 0, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroX2andY2() {
        checkKingStep(2, 2, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepZeroY2() {
        checkKingStep(2, 4, 2, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeX2() {
        checkKingStep(1, 2, 2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeX2andY2() {
        checkKingStep(1, 2, -2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckKingStepNegativeY2() {
        checkKingStep(2, 1, 2, -2);
    }


    //    checkElephantStep() Tests
    @Test
    public void testCheckElephantStepReturnTrue() {
        int x1 = 6;
        int y1 = 4;

        int[][] points = {{8, 2}, {7, 3}, {5, 5}, {4, 6}, {3, 7},
                {2, 8}, {3, 1}, {4, 2}, {5, 3}, {7, 5}, {8, 6}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertTrue(error, checkElephantStep(x1, y1, x2, y2));

        }
    }

    @Test
    public void testCheckElephantStepReturnFalse() {
        int x1 = 6;
        int y1 = 4;

        int[][] points = {{6, 4}, {5, 4}, {7, 4}, {6, 3}, {6, 5}, {2, 4}, {3, 8}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertFalse(error, checkElephantStep(x1, y1, x2, y2));

        }
    }

    //invalid values tests
    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroX1() {
        checkElephantStep(0, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroX1andY1() {
        checkElephantStep(0, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroY1() {
        checkElephantStep(2, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeX1() {
        checkElephantStep(-1, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeX1andY1() {
        checkElephantStep(-1, -2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeY1() {
        checkElephantStep(2, -1, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroX2() {
        checkElephantStep(3, 2, 0, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroX2andY2() {
        checkElephantStep(2, 2, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepZeroY2() {
        checkElephantStep(2, 4, 2, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeX2() {
        checkElephantStep(1, 2, 2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeX2andY2() {
        checkElephantStep(1, 2, -2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckElephantStepNegativeY2() {
        checkElephantStep(2, 1, 2, -2);
    }


    //    checkQueenStep() Tests
    @Test
    public void testCheckQueenStepReturnTrue() {
        int x1 = 6;
        int y1 = 4;

        int[][] points = {{8, 2}, {7, 3}, {5, 5}, {4, 6}, {3, 7},
                {2, 8}, {3, 1}, {4, 2}, {5, 3}, {7, 5}, {8, 6},
                {5, 4}, {4, 4}, {3, 4}, {2, 4}, {1, 4}, {7, 4},
                {8, 4}, {6, 3}, {6, 2}, {6, 1}, {6, 5}, {6, 6},
                {6, 7}, {6, 8}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertTrue(error, checkQueenStep(x1, y1, x2, y2));

        }
    }

    @Test
    public void testCheckQueenStepReturnFalse() {
        int x1 = 6;
        int y1 = 4;

        int[][] points = {{6, 4}, {5, 2}, {2, 6}, {1, 1}, {8, 8}, {4, 5}, {5, 7}, {8, 3}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertFalse(error, checkQueenStep(x1, y1, x2, y2));

        }
    }

    //invalid values tests
    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroX1() {
        checkQueenStep(0, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroX1andY1() {
        checkQueenStep(0, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroY1() {
        checkQueenStep(2, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeX1() {
        checkQueenStep(-1, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeX1andY1() {
        checkQueenStep(-1, -2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeY1() {
        checkQueenStep(2, -1, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroX2() {
        checkQueenStep(3, 2, 0, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroX2andY2() {
        checkQueenStep(2, 2, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepZeroY2() {
        checkQueenStep(2, 4, 2, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeX2() {
        checkQueenStep(1, 2, 2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeX2andY2() {
        checkQueenStep(1, 2, -2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckQueenStepNegativeY2() {
        checkQueenStep(2, 1, 2, -2);
    }


    //    checkHorseStep() Tests
    @Test
    public void testCheckHorseStepReturnTrue() {
        int x1 = 3;
        int y1 = 6;

        int[][] points = {{1, 5}, {2, 4}, {4, 4}, {5, 5},
                {5, 7}, {4, 8}, {2, 8}, {1, 7}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertTrue(error, checkHorseStep(x1, y1, x2, y2));

        }
    }

    @Test
    public void testCheckHorseStepReturnFalse() {
        int x1 = 3;
        int y1 = 6;

        int[][] points = {{3, 6}, {5, 3}, {7, 5}, {8, 6}, {5, 4}, {7, 4}, {6, 3}, {7, 5}};

        for (int[] point : points) {
            int x2 = point[0];
            int y2 = point[1];
            String error = String.format("Error with chess cell: (%d, %d)\n", x2, y2);
            assertFalse(error, checkHorseStep(x1, y1, x2, y2));

        }
    }

    //invalid values tests
    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroX1() {
        checkHorseStep(0, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroX1andY1() {
        checkHorseStep(0, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroY1() {
        checkHorseStep(2, 0, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeX1() {
        checkHorseStep(-1, 2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeX1andY1() {
        checkHorseStep(-1, -2, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeY1() {
        checkHorseStep(2, -1, 2, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroX2() {
        checkHorseStep(3, 2, 0, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroX2andY2() {
        checkHorseStep(2, 2, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepZeroY2() {
        checkHorseStep(2, 4, 2, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeX2() {
        checkHorseStep(1, 2, 2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeX2andY2() {
        checkHorseStep(1, 2, -2, -2);
    }

    @Test(expected = RuntimeException.class)
    public void testCheckHorseStepNegativeY2() {
        checkHorseStep(2, 1, 2, -2);
    }

}

