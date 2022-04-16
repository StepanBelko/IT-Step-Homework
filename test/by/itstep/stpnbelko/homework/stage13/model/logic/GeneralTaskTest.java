package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.GeneralTaskLogic.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneralTaskTest {

    //    findMaxValue() test
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMaxValueWithNull() {
        findMaxValue(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMaxValueWithZeroLength() {
        findMaxValue(new int[0]);
    }

    @Test
    public void testFindMaxValueWithOneElement() {
        assertEquals(2, findMaxValue(new int[]{2}));
    }

    @Test
    public void testFindMaxValueWithAllElementsSame() {
        assertEquals(2, findMaxValue(new int[]{2, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void testFindMaxValueWithAllExceptOneAreMax() {
        assertEquals(9, findMaxValue(new int[]{9, 9, 9, 9, 8}));
    }

    @Test
    public void testFindMaxValueWithAllExceptOneAreMin() {
        assertEquals(3, findMaxValue(new int[]{1, 1, 1, 1, 3}));
    }

    //    findMinValue() test
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMinValueWithNull() {
        findMinValue(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testFindMinValueWithZeroLength() {
        findMinValue(new int[0]);
    }

    @Test
    public void testFindMinValueWithOneElement() {
        assertEquals(2, findMinValue(new int[]{2}));
    }

    @Test
    public void testFindMinValueWithAllElementsSame() {
        assertEquals(2, findMinValue(new int[]{2, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void testFindMinValueWithAllExceptOneAreMax() {
        assertEquals(8, findMinValue(new int[]{9, 9, 9, 9, 8}));
    }

    @Test
    public void testFindMinValueWithAllExceptOneAreMin() {
        assertEquals(1, findMinValue(new int[]{1, 1, 1, 1, 3}));
    }

    //    swapMaxAndMinElements() test
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSwapMaxAndMinElementsWithZero() {
        swapMaxAndMinElements(new int[0]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSwapMaxAndMinElementsWithNull() {
        swapMaxAndMinElements(null);
    }

    @Test
    public void testSwapMaxAndMinElementsWithOneElement() {
        int[] actual = {2};
        int[] expected = {2};
        swapMaxAndMinElements(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSwapMaxAndMinElementsWithAllSame() {
        int[] actual = {2, 2, 2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2, 2, 2};
        swapMaxAndMinElements(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSwapMaxAndMinElementsWithAllExceptOneMax() {
        int[] actual = {2, 2, 2, 2, 2, 1};
        int[] expected = {1, 2, 2, 2, 2, 2};
        swapMaxAndMinElements(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSwapMaxAndMinElementsWithAllExceptOneMin() {
        int[] actual = {1, 1, 1, 1, 1, 2};
        int[] expected = {2, 1, 1, 1, 1, 1};
        swapMaxAndMinElements(actual);
        assertArrayEquals(expected, actual);
    }

    //    countSumOfElementsMoreThanArithmeticMean() test
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCountSumOfElementsMoreThanArithmeticMeanWithNull() {
        countSumOfElementsMoreThanArithmeticMean(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCountSumOfElementsMoreThanArithmeticMeanWithZeroLength() {
        countSumOfElementsMoreThanArithmeticMean(new int[0]);
    }

    @Test
    public void testCountSumOfElementsMoreThanArithmeticMeanWithOneElement() {
        int[] actual = {1};
        assertEquals(0, countSumOfElementsMoreThanArithmeticMean(actual));
    }

    @Test
    public void testCountSumOfElementsMoreThanArithmeticMeanWithAllSame() {
        int[] actual = {1, 1, 1, 1, 1};
        assertEquals(0, countSumOfElementsMoreThanArithmeticMean(actual));
    }

    @Test
    public void testCountSumOfElementsMoreThanArithmeticMeanWithAllZero() {
        int[] actual = {0, 0, 0, 0, 0};
        assertEquals(0, countSumOfElementsMoreThanArithmeticMean(actual));
    }

    //    countSumOfPositiveElementsInEvenPlaces() test
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCountSumOfPositiveElementsInEvenPlacesWithNull() {
        countSumOfPositiveElementsInEvenPlaces(null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testCountSumOfPositiveElementsInEvenPlacesWithZeroLength() {
        countSumOfPositiveElementsInEvenPlaces(new int[0]);
    }

    @Test
    public void testCountSumOfPositiveElementsInEvenPlacesWithOneElement() {
        assertEquals(0, countSumOfPositiveElementsInEvenPlaces(new int[]{1}));
    }

    @Test
    public void testCountSumOfPositiveElementsInEvenPlacesWithTwoElements() {
        int[] actual = {1, 3};
        assertEquals(3, countSumOfPositiveElementsInEvenPlaces(actual));
    }

    @Test
    public void testCountSumOfPositiveElementsInEvenPlacesWithThreeElements() {
        int[] actual = {1, 3, 2};
        assertEquals(3, countSumOfPositiveElementsInEvenPlaces(actual));
    }

    @Test
    public void testCountSumOfPositiveElementsInEvenPlacesWithFourElements() {
        int[] actual = {1, 3, 2, 3};
        assertEquals(6, countSumOfPositiveElementsInEvenPlaces(actual));
    }

    @Test
    public void testCountSumOfPositiveElementsInEvenPlacesWithNoPositive() {
        int[] actual = {-3, -2};
        assertEquals(0, countSumOfPositiveElementsInEvenPlaces(actual));
    }
}
