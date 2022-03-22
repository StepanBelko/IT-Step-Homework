package by.itstep.stpnbelko.homework.stage11.businesLogic;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask04Solution.*;
import static org.junit.Assert.*;

import org.junit.Test;

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
