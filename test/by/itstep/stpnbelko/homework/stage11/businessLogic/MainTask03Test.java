package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask03Solution.isPrime;
import static org.junit.Assert.assertFalse;

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
