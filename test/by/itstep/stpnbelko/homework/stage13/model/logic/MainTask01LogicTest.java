package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask01Logic.isAscendingCondition;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask01Logic.isDescendingCondition;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTask01LogicTest {

    //    isAscendingCondition() test
    @Test()
    public void testIsAscendingConditionNull() {
        assertFalse(isAscendingCondition(null));
    }

    @Test()
    public void testIsAscendingConditionZeroLength() {
        assertFalse(isAscendingCondition(new int[0]));
    }

    @Test()
    public void testIsAscendingConditionOneElement() {
//        массив из одного элемента это тоже упорядоченная последовательность поэтому true
        assertTrue(isAscendingCondition(new int[]{5}));
    }

    @Test()
    public void testIsAscendingConditionTwoSameElement() {
        assertTrue(isAscendingCondition(new int[]{5, 5}));
    }

    @Test()
    public void testIsAscendingConditionTwoSameElementOneNo() {
        assertTrue(isAscendingCondition(new int[]{-5, 5, 6, 7, 7}));
    }

    @Test()
    public void testIsAscendingConditionTwoSameElementFalse() {
        assertFalse(isAscendingCondition(new int[]{-5, 5, -6, 7, 7}));
    }

    //    isDescendingCondition() test
    @Test()
    public void testIsDescendingConditionNull() {
        assertFalse(isDescendingCondition(null));
    }

    @Test()
    public void testIsDescendingConditionZeroLength() {
        assertFalse(isDescendingCondition(new int[0]));
    }

    @Test()
    public void testIsDescendingConditionOneElement() {
        assertTrue(isDescendingCondition(new int[]{5}));
    }

    @Test()
    public void testIsDescendingConditionTwoSameElement() {
        assertTrue(isDescendingCondition(new int[]{5, 5}));
    }

    @Test()
    public void testIsDescendingConditionTwoSameElementOneNo() {
        assertTrue(isDescendingCondition(new int[]{7, 6, 6, 5, -3}));
    }

    @Test()
    public void testIsDescendingConditionTwoSameElementFalse() {
        assertFalse(isDescendingCondition(new int[]{-5, 5, -6, 7, 7}));
    }
}
