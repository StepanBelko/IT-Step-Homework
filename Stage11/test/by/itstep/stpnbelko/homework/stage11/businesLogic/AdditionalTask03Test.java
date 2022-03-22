package by.itstep.stpnbelko.homework.stage11.businesLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask03Solution.*;
import static org.junit.Assert.*;

public class AdditionalTask03Test {
    @Test
    public void testZero() {
        assertEquals(-1, countHappyTicket(0));
    }

    @Test
    public void testNegativeMeaning() {
        assertEquals(-1, countHappyTicket(-2));
    }

    @Test
    public void testSixNumber() {
        assertEquals(55252, countHappyTicket(6));
    }
}
