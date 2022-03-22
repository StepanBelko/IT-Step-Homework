package by.itstep.stpnbelko.homework.stage11.businesLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask01Solution.*;
import static org.junit.Assert.*;

public class AdditionalTask01Test {
    @Test
    public void testOneNegativeMeaning() {
        assertEquals(-404, findGreatestCommonDivisor( -1, 2));
    }

    @Test
    public void testTwoNegativeMeaning() {
        assertEquals(-404, findGreatestCommonDivisor( -1, -9));
    }

    @Test
    public void testZero() {
        assertEquals(-404, findGreatestCommonDivisor( 0, 0));
    }

    @Test
    public void testNoDivisor() {
        assertEquals(1, findGreatestCommonDivisor( 11, 17));
    }

    @Test
    public void testOnePrimeNumber() {
        assertEquals(1, findGreatestCommonDivisor( 2, 79));
    }
}
