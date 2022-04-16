package by.itstep.stpnbelko.homework.stage13.view;

import java.util.Arrays;

public class Printer {
    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void printMarkTable(double[][] markTable, int[] array) {
        System.out.println("First Version:");
        System.out.print("Exam Result Handling\n" + "Marks:\n" + Arrays.toString(array) + "\n");
        System.out.printf("%5s %4.1f%% (%.0f)\n", "Zero", markTable[0][0], markTable[0][1]);
        System.out.printf("%5s %4.1f%% (%.0f)\n", "One", markTable[1][0], markTable[1][1]);
        System.out.printf("%5s %4.1f%% (%.0f)\n", "Two", markTable[2][0], markTable[2][1]);
        System.out.printf("%5s %4.1f%% (%.0f)\n", "Three", markTable[3][0], markTable[3][1]);
        System.out.printf("%5s %4.1f%% (%.0f)\n", "Four", markTable[4][0], markTable[4][1]);
        System.out.printf("%5s %4.1f%% (%.0f)\n\n", "Five", markTable[5][0], markTable[5][1]);
    }
}
