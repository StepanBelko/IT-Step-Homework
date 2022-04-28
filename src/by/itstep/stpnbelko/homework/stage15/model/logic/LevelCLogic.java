package by.itstep.stpnbelko.homework.stage15.model.logic;

import java.util.Arrays;

public class LevelCLogic {
    private static int maxElementIIndex = 0;
    private static int maxElementJIndex = 0;
    private static int minElementIIndex = 0;
    private static int minElementJIndex = 0;

    public static int[][] createNewArray(int[][] arrayA, int[][] arrayB) {
        int[][] newMatrix = new int[arrayA.length][arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            int maxElementInLine = findMaxElementInLine(arrayB[i]);
            for (int j = 0; j < arrayA.length; j++) {
                newMatrix[i][j] = arrayA[i][j] * maxElementInLine;
            }
        }
        return newMatrix;
    }

    private static int findMaxElementInLine(int[] array) {
        System.out.println(Arrays.toString(array));
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static void swapMaxAndMinLines(int[][] array) {
        findMaxAndMinIndexes(array);

        int[] temp = array[maxElementIIndex];
        array[maxElementIIndex] = array[minElementIIndex];
        array[minElementJIndex] = temp;

    }
    private static void findMaxAndMinIndexes(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[maxElementIIndex][maxElementJIndex]) {
                    maxElementIIndex = i;
                    maxElementJIndex = j;
                }
                if (array[i][j] < array[minElementIIndex][minElementJIndex]) {
                    minElementIIndex = i;
                    minElementJIndex = j;
                }
            }
        }
    }

    public static String mainDiagonalZeroInformation(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == 0) {
                int maxElementInLine = findMaxElementInLine(array[i]);
                 stringBuilder.append(String.format("\nLine %d\nMax element = %d", i+1, maxElementInLine));
            }
        }
        if (stringBuilder.toString().equals("")) {
            return "No zeros on main diagonal.";
        }
        return stringBuilder.toString();
    }
}
