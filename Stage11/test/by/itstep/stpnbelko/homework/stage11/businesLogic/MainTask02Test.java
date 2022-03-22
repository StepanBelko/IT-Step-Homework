package by.itstep.stpnbelko.homework.stage11.businesLogic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask02Solution.*;

public class MainTask02Test {
    @Test
    public void testNegativeNumber() {
        assertEquals(-123456, writeReverseNumber(-654321));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, writeReverseNumber(0));
    }

    @Test
    public void testOneDigit() {
        assertEquals(5, writeReverseNumber(5));
    }
}
