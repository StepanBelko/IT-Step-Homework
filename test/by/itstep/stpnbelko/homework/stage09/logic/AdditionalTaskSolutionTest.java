package by.itstep.stpnbelko.homework.stage09.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage09.logic.AdditionalTaskSolution.findNextDayCycle;
import static org.junit.Assert.assertEquals;

public class AdditionalTaskSolutionTest {
    @Test
    public void testCycle29February() {
        assertEquals("1.3.2000", findNextDayCycle(2000,2,29));
    }

    @Test
    public void testCycleNewYear() {
        assertEquals("1.1.2001", findNextDayCycle(2000,12,31));
    }

    @Test
    public void testHashMap29February() {
        assertEquals("1.3.2000", findNextDayCycle(2000,2,29));
    }

    @Test
    public void testHashMapNewYear() {
        assertEquals("1.1.2001", findNextDayCycle(2000,12,31));
    }
}
