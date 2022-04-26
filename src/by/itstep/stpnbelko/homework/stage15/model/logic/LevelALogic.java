package by.itstep.stpnbelko.homework.stage15.model.logic;

public class LevelALogic {
    public static int countSumBetweenPositiveElements(int[][] array) {
/*
Дикие костыли, но по-другому вообще не представляю как это решить,
хотя уверен, что есть более короткий способ.
В моём решении я сначала проверяю есть ли в строке два не соседних,
и не последних положительных числа и, если истинно, то складываю
все значения между ними.
*/
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            if (isTwoPositiveNonAdjacentIndices(array[i])) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > 0) {
                        j++;
                        while (array[i][j] <= 0 && j < array[i].length) {
                            sum += array[i][j];
                            j++;
                        }
                        break;
                    }
                }
            }
            System.out.printf("Sum string %d = %d\n", i + 1, sum);
            totalSum += sum;
        }
        return totalSum;
    }

    private static boolean isTwoPositiveNonAdjacentIndices(int[] array) {
        int firstPositiveIndex = -1;
        int secondPositiveIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }

        if (firstPositiveIndex >= 0) {
            for (int i = firstPositiveIndex + 1; i < array.length; i++) {
                if (array[i] > 0) {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }

        return firstPositiveIndex >= 0 && secondPositiveIndex > 0 && secondPositiveIndex != firstPositiveIndex + 1;
    }
}
