package by.itstep.stpnbelko.homework.stage11.businesLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask03Solution.*;
import static org.junit.Assert.*;

public class MainTask03Test {
    @Test
    public void testZero() {
        assertFalse(isPrime(0));
    }

    @Test
    public void testOneNumber() {
        assertFalse(isPrime(1));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(isPrime(-1));
    }
}
