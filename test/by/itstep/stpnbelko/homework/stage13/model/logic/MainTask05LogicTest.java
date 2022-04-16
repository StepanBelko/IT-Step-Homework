package by.itstep.stpnbelko.homework.stage13.model.logic;

import org.junit.Test;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask05Logic.countMarkPercentTableFirstVersion;
import static org.junit.Assert.assertEquals;

public class MainTask05LogicTest {
    @Test
    public void testCountMarkPercentTableFirstVersion() {
        int[] markList = {5, 4, 4, 5, 3, 4, 3, 4, 5, 3, 4, 4, 3, 4, 4, 3, 5, 3, 3, 4, 5, 5, 5, 5, 4, 5, 5, 5, 2, 5};
        double[][] expected = {{0.0, 0.0},
                {0.0, 0.0},
                {3.3, 1.0},
                {23.3, 7.0},
                {33.3, 10.0},
                {40.0, 12.0}};
        double[][] actual = countMarkPercentTableFirstVersion(markList);

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j], 0.1);
            }
        }
    }
}
