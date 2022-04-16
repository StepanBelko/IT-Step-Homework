package by.itstep.stpnbelko.homework.stage13.model.logic;

import by.itstep.stpnbelko.homework.stage13.model.util.Mark;

import static by.itstep.stpnbelko.homework.stage13.model.util.Mark.*;

public class MainTask05Logic {
/*
Можно было бы создать класс "Mark" с полями "value" и "percent",
но, я просто положу результаты в двумерный массив.
В каждой строке будет содержаться количество оценок и их процент
*/

    private static double[][] markTable = new double[6][2];
    private static Mark[] markTableObj = {zero, one, two, three, four, five};

    public static double[][] countMarkPercentTableFirstVersion(int[] array) {
        createMarkTable(array);
        calculatePercent(array);
        return markTable;
    }

    private static void createMarkTable(int[] array) {
        for (int j : array) {
            switch (j) {
                case 0 -> markTable[0][1]++;
                case 1 -> markTable[1][1]++;
                case 2 -> markTable[2][1]++;
                case 3 -> markTable[3][1]++;
                case 4 -> markTable[4][1]++;
                case 5 -> markTable[5][1]++;
                default -> throw new IllegalStateException("Unexpected value: " + j);
            }
        }
    }

    private static void calculatePercent(int[] array) {
        for (int i = 0; i < MainTask05Logic.markTable.length; i++) {
            MainTask05Logic.markTable[i][0] = MainTask05Logic.markTable[i][1] / ((double) array.length / 100.0);
        }
    }

    //    Всё-таки вариант с объектами мне кажется лучше:
    public static void countMarkPercentObjectVersion(int[] array) {
        fillInTheMArkTable(array);
        for (Mark mark : markTableObj) {
            double onePercent = ((double) array.length / 100);
            double percentCount = mark.getNumber() / onePercent;
            mark.setPercent(percentCount);
        }
    }

    private static void fillInTheMArkTable(int[] array) {
        for (int j : array) {
            switch (j) {
                case 0 -> zero.setNumber(zero.getNumber() + 1);
                case 1 -> one.setNumber(one.getNumber() + 1);
                case 2 -> two.setNumber(two.getNumber() + 1);
                case 3 -> three.setNumber(three.getNumber() + 1);
                case 4 -> four.setNumber(four.getNumber() + 1);
                case 5 -> five.setNumber(five.getNumber() + 1);
                default -> throw new IllegalStateException("Unexpected value: " + j);
            }
        }
    }

    public static Mark[] getMarkTableObj() {
        return markTableObj;
    }
}
