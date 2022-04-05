package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask02Solution.countDifferentDigit;
import static org.junit.Assert.assertEquals;
public class GeneralTask02Test {
    @Test
    public void testZero() {
        assertEquals(1, countDifferentDigit(0));
    }

    @Test
    public void testNegativeMeaning() {
        assertEquals(2, countDifferentDigit(-10000));
    }

    @Test
    public void testBigNegativeNumber() {
        assertEquals(10, countDifferentDigit(-239845678901234L));
    }
}
