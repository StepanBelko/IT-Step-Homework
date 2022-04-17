package by.itstep.stpnbelko.homework.stage14.model.logic;

public class LevelELogic {
    private static int findLastPositiveElement(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return 0;
    }

    public static int countSumOfElementsBeforeLastPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int lastPositiveElementIndex = findLastPositiveElement(array);
        int sum = 0;
        for (int i = 0; i < lastPositiveElementIndex; i++) {
            sum += array[i];
        }
        return sum;
    }
}
