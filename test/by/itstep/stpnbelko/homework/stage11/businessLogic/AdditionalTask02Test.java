package by.itstep.stpnbelko.homework.stage11.businessLogic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask02Solution.findArmstrongNumber;
import static org.junit.Assert.assertEquals;

public class AdditionalTask02Test {
    @Test
    public void testNegativeMeaning() {
        assertEquals(new ArrayList<>(), findArmstrongNumber(-1));
    }

    @Test
    public void testOneDigit() {
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertEquals(expected, findArmstrongNumber(1));
    }

    @Test
    public void testTwoDigit() {
        assertEquals(new ArrayList<>(), findArmstrongNumber(2));
    }

    @Test
    public void testThreeDigit() {
        List<Integer> expected = Arrays.asList(153, 370, 371, 407);
        assertEquals(expected,findArmstrongNumber(3));
    }
}
