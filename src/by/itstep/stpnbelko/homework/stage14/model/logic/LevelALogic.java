package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelALogic {
    public static int countNonZeroElements(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;
        for (int element : array) {
            if (element != 0) {
                count++;
            }
        }
        return count;
    }
}
