package by.itstep.stpnbelko.homework.stage09.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.stpnbelko.homework.stage09.logic.DiceClass.*;

public class MainTask01Test {
    @Test
    public void testInvalidRandomValue() {
        if (countSumTwoRandomNumbers() > 12 || countSumTwoRandomNumbers() < 2 ) {
            fail();
        }
    }
}
