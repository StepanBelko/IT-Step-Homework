package by.itstep.stpnbelko.homework.stage12.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage12.logic.ChessPiecesLogic.*;
import static org.junit.Assert.*;

public class ChessPiecesLogicTest {
    private final int[][] EXCEPTION_POINTS = {
            {0, 2, 2, 2}, {2, 0, 2, 2}, {0, 0, 2, 4},
            {2, 2, 0, 2}, {2, 2, 2, 0}, {2, 2, 0, 0},
            {-1, 1, 2, 2}, {1, -1, 2, 2}, {-1, -1, 2, 2},
            {2, 2, -1, 1}, {2, 2, 1, -1}, {2, 2, -1, -1}
    };


    //    checkRockStep() Tests
    @Test
    public void testCheckRockStepReturnTrue() throws WrongCoordinateException {
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
    public void testCheckRockStepReturnFalse() throws WrongCoordinateException {
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

    /*
    Изменил подход к тестированию некорректных данных.
    Теперь если хоть один набор x1,y1,x2,y2 НЕ выбрасывает исключение,
    то тестовый метод фейлится, иначе - всё в порядке.
    Получилось сильно короче.

    Массив с некорректными точками инициализировал в поле тестового класса,
    он будет один для всех методов.
    */

    //invalid values tests
    @Test
    public void invalidPointRockStepTest() {

        for (int[] point : EXCEPTION_POINTS) {
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            try {
                checkRockStep(x1, y1, x2, y2);
                System.out.printf("%d.%d %d.%d - must be exception\n", x1, y1, x2, y2);
                fail();
            } catch (WrongCoordinateException e) {
                e.printStackTrace();
            }
        }
    }

    //    checkKingStep() Tests
    @Test
    public void testCheckKingStepReturnTrue() throws WrongCoordinateException {
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
    public void testCheckKingStepReturnFalse() throws WrongCoordinateException {
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
    @Test
    public void invalidPointKingStepTest() {

        for (int[] point : EXCEPTION_POINTS) {
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            try {
                checkKingStep(x1, y1, x2, y2);
                System.out.printf("%d.%d %d.%d - must be exception\n", x1, y1, x2, y2);
                fail();
            } catch (WrongCoordinateException e) {
                e.printStackTrace();
            }
        }
    }


    //    checkElephantStep() Tests
    @Test
    public void testCheckElephantStepReturnTrue() throws WrongCoordinateException {
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
    public void testCheckElephantStepReturnFalse() throws WrongCoordinateException {
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
    @Test
    public void invalidPointElephantStepTest() {

        for (int[] point : EXCEPTION_POINTS) {
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            try {
                checkElephantStep(x1, y1, x2, y2);
                System.out.printf("%d.%d %d.%d - must be exception\n", x1, y1, x2, y2);
                fail();
            } catch (WrongCoordinateException e) {
                e.printStackTrace();
            }
        }
    }


    //    checkQueenStep() Tests
    @Test
    public void testCheckQueenStepReturnTrue() throws WrongCoordinateException {
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
    public void testCheckQueenStepReturnFalse() throws WrongCoordinateException {
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
    @Test
    public void invalidPointQueenStepTest() {

        for (int[] point : EXCEPTION_POINTS) {
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            try {
                checkQueenStep(x1, y1, x2, y2);
                System.out.printf("%d.%d %d.%d - must be exception\n", x1, y1, x2, y2);
                fail();
            } catch (WrongCoordinateException e) {
                e.printStackTrace();
            }
        }
    }


    //    checkHorseStep() Tests
    @Test
    public void testCheckHorseStepReturnTrue() throws WrongCoordinateException {
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
    public void testCheckHorseStepReturnFalse() throws WrongCoordinateException {
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
    @Test
    public void invalidPointHorseStepTest() {

        for (int[] point : EXCEPTION_POINTS) {
            int x1 = point[0];
            int y1 = point[1];
            int x2 = point[2];
            int y2 = point[3];
            try {
                checkHorseStep(x1, y1, x2, y2);
                System.out.printf("%d.%d %d.%d - must be exception\n", x1, y1, x2, y2);
                fail();
            } catch (WrongCoordinateException e) {
                e.printStackTrace();
            }
        }
    }

}