package by.itstep.stpnbelko.homework.stage10.logic;

import org.junit.Assert;
import org.junit.Test;

public class MainTask01Test {
    @Test
    public void checkNumbersTest() {
        int number = 111;
        if (!MainTask01Solution.checkNumbers(number)) {
            Assert.fail();
        }
    }
    @Test
    public void checkNumbersTest2() {
        int[] number = {-12, 2323, 1457, 123456, -543};
        for (int num : number) {
            if (MainTask01Solution.checkNumbers(num)) {
                Assert.fail();
            }
        }
    }
}
