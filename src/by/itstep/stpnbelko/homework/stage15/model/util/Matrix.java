package by.itstep.stpnbelko.homework.stage15.model.util;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private static final int MIN_VALUE = -99;
    private static final int MAX_VALUE = 99;

    public static int[][] createMatrix(int height, int length) {
        Random random = new Random();
        int[][] matrix = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j]  =  random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
        return matrix;
    }
}
