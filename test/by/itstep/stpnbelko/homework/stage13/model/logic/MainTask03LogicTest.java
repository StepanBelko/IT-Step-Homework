package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask03Logic.isAllElementsDifferent;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask03Logic.isAllElementsSame;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTask03LogicTest {

    //    isAllElementsSame() test
    @Test
    public void testIsAllElementsSameNull() {
        assertFalse(isAllElementsSame(null));
    }

    @Test
    public void testIsAllElementsSameZeroLength() {
        assertFalse(isAllElementsSame(new int[0]));
    }

    @Test
    public void testIsAllElementsSameOneElement() {
        assertTrue(isAllElementsSame(new int[]{9}));
    }

    @Test
    public void testIsAllElementsSameTwoSameElements() {
        assertTrue(isAllElementsSame(new int[]{9, 9}));
    }

    @Test
    public void testIsAllElementsSameTwoDifferentElements() {
        assertFalse(isAllElementsSame(new int[]{9, 1}));
    }

    @Test
    public void testIsAllElementsSameThreeSameElement() {
        assertFalse(isAllElementsSame(new int[]{9, 9, 1}));
    }

    @Test
    public void testIsAllElementsSameThreeDifferentElement() {
        assertFalse(isAllElementsSame(new int[]{9, 6, 1}));
    }


    //    isAllElementsDifferent() test
    @Test
    public void testIsAllElementsDifferentNull() {
        assertFalse(isAllElementsSame(null));
    }

    @Test
    public void testIsAllElementsDifferentZeroLength() {
        assertFalse(isAllElementsDifferent(new int[0]));
    }

    @Test
    public void testIsAllElementsDifferentOneElement() {
        assertFalse(isAllElementsDifferent(new int[]{9}));
    }

    @Test
    public void testIsAllElementsDifferentTwoSameElements() {
        assertFalse(isAllElementsDifferent(new int[]{9, 9}));
    }

    @Test
    public void testIsAllElementsDifferentTwoDifferentElements() {
        assertTrue(isAllElementsDifferent(new int[]{9, 1}));
    }

    @Test
    public void testIsAllElementsDifferentThreeSameElement() {
        assertFalse(isAllElementsDifferent(new int[]{9, 9, 1}));
    }

    @Test
    public void testIsAllElementsDifferentThreeDifferentElement() {
        assertTrue(isAllElementsDifferent(new int[]{9, 6, 1}));
    }
}
