package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask01Solution.countDigitSum;
import static org.junit.Assert.assertEquals;

public class GeneralTask01Test {
    @Test
    public void testZero() {
        assertEquals(0, countDigitSum(0));
    }

    @Test
    public void testNegativeMeaning() {
        assertEquals(2, countDigitSum(-10001));
    }

    @Test
    public void testOneZeroZeroZeroOne() {
        assertEquals(2, countDigitSum(10001));
    }
}
