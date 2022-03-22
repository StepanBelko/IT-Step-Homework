package by.itstep.stpnbelko.homework.stage11.businesLogic;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask01Solution.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTask01Test {
    @Test
    public void countHeadTest() {
        if (countHead() < 0) {
            fail();
        }
    }

    @Test
    public void testNegativeCountHead() {
        if (countHead() <= 0) {
            fail();
        }
    }
}
