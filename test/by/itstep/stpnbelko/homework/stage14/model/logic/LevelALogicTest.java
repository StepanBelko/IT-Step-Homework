package by.itstep.stpnbelko.homework.stage14.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class LevelALogicTest {
    @Test
    public void testCountNonZeroElementsBasic(){
        int[] array = {2, 3, -4, 5, 0, 6, 0, -2};
        int expected = 6;

        int actual = LevelALogic.countNonZeroElements(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithoutZeroElements(){
        int[] array = {2, 3, -4, 5, 6, -2};
        int expected = array.length;

        int actual = LevelALogic.countNonZeroElements(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithAllZeroElements(){
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;

        int actual = LevelALogic.countNonZeroElements(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsOneZero(){
        int[] array = {0};
        int expected = 0;

        int actual = LevelALogic.countNonZeroElements(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsOneNoZero(){
        int[] array = {5};
        int expected = 1;

        int actual = LevelALogic.countNonZeroElements(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithNull(){
        int expected = -1;
        int actual = LevelALogic.countNonZeroElements(null);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithEmptyObject(){
        int expected = -1;
        int actual = LevelALogic.countNonZeroElements(new int[0]);

        assertEquals(expected, actual);
    }

}