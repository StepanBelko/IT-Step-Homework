package by.itstep.stpnbelko.homework.stage15.control;

import static by.itstep.stpnbelko.homework.stage15.model.logic.LevelCLogic.*;
import static by.itstep.stpnbelko.homework.stage15.view.Printer.*;

public class LevelC {
    /*
    C1. Даны две действительные квадратные матрицы порядка n.
    Получить новую матрицу умножением элементов каждой строки первой матрицы
    на наибольшее из значений элементов соответствующей строки второй матрицы.
    */
    public static void main(String[] args) {
        int[][] arrayA = {{1,2,3}, {4,0,6}, {7,8,9}};
        int[][] arrayB = {{9,8,7}, {6,5,4}, {3,2,1}};

        int[][] newMatrix = createNewArray(arrayA,arrayB);
        printMatrix("Matrix A ", arrayA);
        printMatrix("Matrix B ", arrayB);
        printMatrix("New matrix", newMatrix);

        /*
        C17. Поменять местами строку, содержащую элемент с наибольшим значением в матрице
        со строкой, содержащей элемент с наименьшим значением. Вывести на экран полученную матрицу.
        Для каждой строки с нулевым элементом на главной диагонали вывести ее номер и значение
        наибольшего из элементов этой строки.
        */
        swapMaxAndMinLines(arrayA);
        printMatrix("Swapped matrix", newMatrix);
        printMsg(mainDiagonalZeroInformation(newMatrix));
    }
}
