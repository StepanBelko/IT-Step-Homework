package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask04Solution.findFactorial;
import static org.junit.Assert.assertEquals;

public class MainTask04Test {
    @Test
    public void testZero() {
        assertEquals(-1, findFactorial(0));
    }

    @Test
    public void testNegativeMeaning() {
        assertEquals(-1, findFactorial(-555));
    }
}
