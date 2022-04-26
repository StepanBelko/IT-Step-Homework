package by.itstep.stpnbelko.homework.stage15.view;

public class Printer {
    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void printMatrix(String msg, int[][] matrix) {
        System.out.printf("\n%s\n", msg);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
}
