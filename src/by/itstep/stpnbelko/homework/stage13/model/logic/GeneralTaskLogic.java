package by.itstep.stpnbelko.homework.stage13.model.logic;

public class GeneralTaskLogic {

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int maxValue = array[0];
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    public static int findMinValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int minValue = array[0];
        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }

    public static void swapMaxAndMinElements(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int maxElementIndex = 0;
        int minElementIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxElementIndex]) {
                maxElementIndex = i;
            }
            if (array[i] < array[minElementIndex]) {
                minElementIndex = i;
            }
        }

        int temp = array[minElementIndex];
        array[minElementIndex] = array[maxElementIndex];
        array[maxElementIndex] = temp;
    }

    private static double findArithmeticMean(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static int countSumOfElementsMoreThanArithmeticMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        double arithmeticMean = findArithmeticMean(array);
        int sum = 0;
        for (int j : array) {
            if (j > arithmeticMean) {
                sum += j;
            }
        }
        return sum;
    }

    public static int countSumOfPositiveElementsInEvenPlaces(int[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int sum = 0;
        for (int i = 1; i <= array.length - 1; i += 2) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

}
