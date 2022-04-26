package by.itstep.stpnbelko.homework.stage15.control;

import static by.itstep.stpnbelko.homework.stage15.model.util.Matrix.*;
import static by.itstep.stpnbelko.homework.stage15.model.logic.LevelBLogic.*;
import static by.itstep.stpnbelko.homework.stage15.view.Printer.*;

public class LevelB {
    public static void main(String[] args) {
//        B3. Повернуть матрицу на 90 (180, 270) градусов против (по) часовой стрелки.
//        Заполняем матрицу

        int[][] matrix = createMatrix(2,3);

        printMatrix("Main matrix:", matrix);

        int[][] newMatrix = rotateMatrix90(matrix);
        printMatrix("Rotate 90:",newMatrix);

//        для поворота на 180 можно ещё раз повернуть на 90 уже повёрнутую матрицу
        printMatrix("Rotate 180",rotateMatrix90(newMatrix));

//        либо в новом методе
        int[][] newMatrix180 = rotateMatrix180(matrix);
        printMatrix("Rotate 180 version 2:",newMatrix180);


        int[][] newMatrix270 = rotateMatrix270(matrix);
        printMatrix("Rotate 270:", newMatrix270);
    }
}
