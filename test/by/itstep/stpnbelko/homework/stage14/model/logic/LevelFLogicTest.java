package by.itstep.stpnbelko.homework.stage14.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class LevelFLogicTest {
    private final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};

    @Test
    public void testSortBeforeFirstZeroElement() throws ExceptionArrayIsNull {
        int[] expectedArray = {2, 4, 5, 9, 0, 7, 5, 1, 0, 8};
        LevelFLogic.sortBeforeFirstZero(ARRAY);

        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElement() {
        int[] expectedArray = {0, 1, 2, 4, 5, 5, 7, 9, 0, 8};

        LevelFLogic.sortBeforeLastZero(ARRAY);

        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElementWithoutZeroElements() {
        int[] array = {5, 9, 2, 4, 7, 5, 1, 8};
        int[] expectedArray = {5, 9, 2, 4, 7, 5, 1, 8};

        LevelFLogic.sortBeforeLastZero(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortBeforeFirstZeroElementOnlyZero() throws ExceptionArrayIsNull {
        int[] array = {0};
        int[] expectedArray = {0};

        LevelFLogic.sortBeforeFirstZero(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortBeforeLastZeroElementOnlyZero() {
        int[] array = {0};
        int[] expectedArray = {0};

        LevelFLogic.sortBeforeLastZero(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test(expected = ExceptionArrayIsNull.class)
    public void testSortBeforeFirstElementWithNull() throws ExceptionArrayIsNull {
        LevelFLogic.sortBeforeFirstZero(null);
    }

    @Test
    public void testSortBeforeLastElementWithNull() {
        assertFalse(LevelFLogic.sortBeforeLastZero(null));
    }
}