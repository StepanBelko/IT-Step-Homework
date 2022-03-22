package by.itstep.stpnbelko.homework.stage09.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.stpnbelko.homework.stage09.logic.AdditionalTaskSolution.*;

public class AdditionalTaskSolutionTest {
    @Test
    public void test29February() {
        String expected = String.format("Current date is %02d.%02d.%d\n", 29, 2, 2000) +
                String.format("    New date is %02d.%02d.%d\n", 1, 3, 2000);
        assertEquals(expected, findNextDayCycle(2000,2,29));
    }
}
