package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask02Logic.isMirrorSequence;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTask02LogicTest {

    @Test
    public void testIsMirrorSequenceWithZeroLength() {
        assertFalse(isMirrorSequence(new int[0]));
    }

    @Test
    public void testIsMirrorSequenceWithNull() {
        assertFalse(isMirrorSequence(null));
    }

    @Test
    public void testIsMirrorSequenceWithOneElement() {
        assertTrue(isMirrorSequence(new int[]{2}));
    }

    @Test
    public void testIsMirrorSequenceWithThreeElementTrue() {
        assertTrue(isMirrorSequence(new int[]{2, 3, 2}));
    }

    @Test
    public void testIsMirrorSequenceWithThreeElementFalse() {
        assertFalse(isMirrorSequence(new int[]{2, 3, 1}));
    }

    @Test
    public void testIsMirrorSequenceWithFourElementTrue() {
        assertTrue(isMirrorSequence(new int[]{2, 3, 3, 2}));
    }

    @Test
    public void testIsMirrorSequenceWithFourElementFalse() {
        assertFalse(isMirrorSequence(new int[]{2, 3, 3, 3}));
    }
}
