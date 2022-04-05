package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask01Solution.countHead;
import static org.junit.Assert.fail;

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
