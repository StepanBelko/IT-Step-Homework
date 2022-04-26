package by.itstep.stpnbelko.homework.stage15.model.logic;

public class LevelBLogic {
    public static int[][] rotateMatrix90(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] rotateMatrix180(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[matrix.length - 1 - i][matrix[i].length - 1 - j] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] rotateMatrix270(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[matrix[i].length - j - 1][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
