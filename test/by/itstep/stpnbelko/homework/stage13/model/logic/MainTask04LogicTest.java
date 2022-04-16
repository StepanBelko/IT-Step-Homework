package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask04Logic.countEvenElements;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask04Logic.countOddElements;
import static org.junit.Assert.assertEquals;

public class MainTask04LogicTest {

    //    countEvenElements() test
    @Test
    public void testCountEvenElementsNull() {
        assertEquals(-1, countEvenElements(null));
    }

    @Test
    public void testCountEvenElementsZeroLength() {
        assertEquals(-1, countEvenElements(new int[0]));
    }

    @Test
    public void testCountEvenElementsNoEven() {
        assertEquals(0, countEvenElements(new int[]{1, 3, 5}));
    }

    @Test
    public void testCountEvenElementsAllEven() {
        assertEquals(3, countEvenElements(new int[]{2, 2, 4}));
    }

    @Test
    public void testCountEvenElementsEvenAndOdd() {
        assertEquals(3, countEvenElements(new int[]{1, 0, 0, 2, 4, 2}));
    }

    @Test
    public void testCountEvenElementsOneEven() {
        assertEquals(1, countEvenElements(new int[]{0, 2, 0, 3, 3, 1}));
    }

    //    countOddElements() test
    @Test
    public void testCountOddElementsNull() {
        assertEquals(-1, countOddElements(null));
    }

    @Test
    public void testCountOddElementsZeroLength() {
        assertEquals(-1, countOddElements(new int[0]));
    }

    @Test
    public void testCountOddElementsNoEven() {
        assertEquals(3, countOddElements(new int[]{1, 3, 5}));
    }

    @Test
    public void testCountOddElementsAllEven() {
        assertEquals(0, countOddElements(new int[]{2, 2, 4}));
    }

    @Test
    public void testCountOddElementsEvenAndOdd() {
        assertEquals(1, countOddElements(new int[]{1, 0, 0, 2, 4, 2}));
    }

    @Test
    public void testCountOddElementsOneEven() {
        assertEquals(3, countOddElements(new int[]{0, 2, 0, 3, 3, 1}));
    }
}
