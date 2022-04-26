package by.itstep.stpnbelko.homework.stage15.control;

import static by.itstep.stpnbelko.homework.stage15.model.logic.LevelALogic.*;
import static by.itstep.stpnbelko.homework.stage15.model.util.Matrix.createMatrix;
import static by.itstep.stpnbelko.homework.stage15.view.Printer.printMatrix;
import static by.itstep.stpnbelko.homework.stage15.view.Printer.printMsg;

public class LevelA {
/*
Найти сумму элементов матрицы, расположенных между первым и вторым
положительными элементами каждой строки.
*/
    public static void main(String[] args) {

    int[][] matrix = createMatrix(3,10);
        printMatrix("Main matrix:", matrix);
        int totalSum = countSumBetweenPositiveElements(matrix);
        printMsg(String.format("Total sum = %d\n", totalSum));
    }
}
