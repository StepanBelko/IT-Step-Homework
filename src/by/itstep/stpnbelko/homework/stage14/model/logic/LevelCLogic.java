package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelCLogic {
    public static int countElementMoreArithmeticMean(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        int count = 0;
        for (int element : array) {
            if (element > ((double) sum / array.length)) {
                count++;
            }
        }
        return count;
    }
}
