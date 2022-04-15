package by.itstep.stpnbelko.homework.stage13.model.logic;

public class GeneralTaskLogic {

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
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
            return -1;
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
        // написать здесь защиту
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        int maxElementIndex = 0;
        int minElementIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
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
        int sum = 0;
        /*
        Как быть в ситуации, когда нет элементов, удовлетворяющих условию?
        Ведь в таком случае сумма равняется не 0, а скорее null, её попросту не существует.
        Понятно, что 0 подходит т.к. такого результата не может быть в принципе, но всё же.
        */
        for (int i = 1; i <= array.length - 1; i += 2) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

}
