package by.itstep.stpnbelko.homework.stage11.businesLogic;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask05Solution.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTask05Test {
    @Test
    public void testNegativeMean() {
        String expected = "-2 3 11";
        assertEquals(expected, String.valueOf(findPrimeDividers(-66)));
    }

    @Test
    public void testZero() {
        String expected = "NO";
        assertEquals(expected, String.valueOf(findPrimeDividers(0)));
    }

    @Test
    public void testOne() {
        String expected = "NO";
        assertEquals(expected, String.valueOf(findPrimeDividers(1)));
    }

    @Test
    public void testPrimeNumberTwo() {
        String expected = "2";
        assertEquals(expected, String.valueOf(findPrimeDividers(2)));
    }

    @Test
    public void testPrimeNumber() {
        String expected = "19";
        assertEquals(expected, String.valueOf(findPrimeDividers(19)));
    }

    @Test
    public void testPrimeDivisors() {
        String expected = "17 19";
        assertEquals(expected, String.valueOf(findPrimeDividers(323)));
    }

    @Test
    public void testRegularNumber() {
        String expected = "2 2 2 2 3 5";
        assertEquals(expected, String.valueOf(findPrimeDividers(240)));
    }
}
