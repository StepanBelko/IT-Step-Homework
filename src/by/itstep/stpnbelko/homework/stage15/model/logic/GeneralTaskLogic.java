package by.itstep.stpnbelko.homework.stage15.model.logic;

import java.util.ArrayList;

public class GeneralTaskLogic {
    private static final int MAX_POINT = 10;

    public static int findMaxAverageMarkLine(int[][] markArray) {
        int averageMarkIndex = 0;
        double averageMarkInLine = countAverageMarkInLine(markArray[0]);
        for (int i = 1; i < markArray.length; i++) {
/*
        Далее вместо averageMarkInLine можно было бы подставить
        countAverageMarkInLine(averageMarkIndex),
        но каждый раз для сравнения вызывать метод мне показалось
        нерациональным, хотя от переменной averageMarkInLine можно
        было бы избавиться и сделать так:

        if (countAverageMarkInLine(markArray[i]) > countAverageMarkInLine(markArray[averageMarkIndex]) {
                averageMarkIndex = i;
            }

        Как лучше?
*/
            if (countAverageMarkInLine(markArray[i]) > averageMarkInLine) {
                averageMarkIndex = i;
                averageMarkInLine = countAverageMarkInLine(markArray[i]);
            }
        }
        return averageMarkIndex + 1;
    }

    public static int findMinAverageMarkLine(int[][] markArray) {
        int averageMarkIndex = 0;
        double averageMarkInLine = countAverageMarkInLine(markArray[0]);
        for (int i = 1; i < markArray.length; i++) {

            if (countAverageMarkInLine(markArray[i]) < averageMarkInLine) {
                averageMarkIndex = i;
                averageMarkInLine = countAverageMarkInLine(markArray[i]);
            }
        }
        return averageMarkIndex + 1;
    }

    public static double countAverageMarkInLine(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public static int findMaxMark10Line(int[][] markArray, int mark) {
        int marks = 0;
        int maxMarkLine = 0;
        for (int i = 0; i < markArray.length; i++) {
            if (countMarks(markArray[i], mark) > marks) {
                marks = countMarks(markArray[i], mark);
                maxMarkLine = i;
            }
        }
        return maxMarkLine + 1;
    }

    private static int countMarks(int[] array, int mark) {
        int markCount = 0;
        for (int j : array) {
            if (j == mark) {
                markCount++;
            }
        }
        return markCount;
    }

    public static ArrayList<Integer> findGroupsWithUnsatisfactoryMarks(int[][] markArray) {
        ArrayList<Integer> groupList = new ArrayList<>();
//        int[] badGroupArray = new int[0];
        for (int i = 0; i < markArray.length; i++) {
            for (int j = 0; j < markArray[i].length; j++) {
                if (markArray[i][j] < 5) {
                    groupList.add(i + 1);
                    break;
//            или вариант без ArrayList:
            /*
            int[] temp = new int[badGroupArray.length + 1];
            int k = 0;
            for (; k < badGroupArray.length; k++) {
            temp[k] = badGroupArray[k];
            }
            temp[k] = i + 1;
            badGroupArray = temp;
            break;
            */
                }
            }
        }
        return groupList;
    }

    private static double countTotalAcademyAverageMark(int[][] markArray) {
        double sum = 0;

        for (int[] ints : markArray) {
            sum += countAverageMarkInLine(ints);
        }

        System.out.println("TotalAcademyAverageMark = " + sum / markArray.length);
        return sum / markArray.length;
    }

    public static void improveGradesForGoodStudents(int[][] markArray) {
        double totalAcademyAverageMark = countTotalAcademyAverageMark(markArray);
        for (int[] ints : markArray) {
            if (countAverageMarkInLine(ints) > totalAcademyAverageMark) {
                plusPoints(ints);
            }
        }
    }

    private static void plusPoints(int[] markLine) {
        for (int i = 0; i < markLine.length; i++) {
            if (markLine[i] < MAX_POINT) {
                markLine[i] += 1;
            }
        }
    }

    public static void groupSort(int[][] markArray) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < markArray.length; i++) {
                if (countAverageMarkInLine(markArray[i]) > countAverageMarkInLine(markArray[i - 1])) {
                    swap(markArray, i);
                    needIteration = true;
                }
            }
        }
    }

    private static void swap(int[][] markArray, int i) {
        int[] temp = markArray[i];
        markArray[i] = markArray[i - 1];
        markArray[i - 1] = temp;
    }
}
