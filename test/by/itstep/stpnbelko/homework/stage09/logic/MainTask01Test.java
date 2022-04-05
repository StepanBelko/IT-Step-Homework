package by.itstep.stpnbelko.homework.stage09.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage09.logic.DiceClass.countSumTwoRandomNumbers;
import static org.junit.Assert.fail;

public class MainTask01Test {
    @Test
    public void testInvalidRandomValue() {
        if (countSumTwoRandomNumbers() > 12 || countSumTwoRandomNumbers() < 2 ) {
            fail();
        }
    }
}
