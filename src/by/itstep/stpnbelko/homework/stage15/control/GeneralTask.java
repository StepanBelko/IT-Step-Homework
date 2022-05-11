package by.itstep.stpnbelko.homework.stage15.control;

import static by.itstep.stpnbelko.homework.stage15.model.logic.GeneralTaskLogic.*;
import static by.itstep.stpnbelko.homework.stage15.view.Printer.*;

public class GeneralTask {
    /*
Даны итоговые (финальные) оценки студенческих выпускных групп IT Академии. Необходимо:

    - найти группы с максимальным/минимальным средним баллом;

    - найти группы с максимальным количеством оценок десять (или любой другой оценки);

    - найти группы, где есть хотя бы одна неудовлетворительная оценка (0, 1, 2 и 3);

    - в группах, где средняя успеваемость выше общей средней успеваемости
      по всей академии, увеличить оценки каждому студенту на один балл (или больше);

    - отсортировать группы по убыванию их средней успеваемости.
*/
    public static void main(String[] args) {
        int[][] markArray = {{9, 8, 9, 7, 6, 4, 4, 8, 5, 6},           //Group1
                {1,1},
                {9, 9, 8, 10, 7, 6},                                   //Group2
                {4, 4, 4, 3, 10, 10, 2, 6, 7, 10, 9, 9, 2, 4, 5, 6, 7},//Group3
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10}};              //Group4

//        - найти группы с максимальным/минимальным средним баллом;
        int maxAverageMarkLine = findMaxAverageMarkLine(markArray);
        int minAverageMarkLine = findMinAverageMarkLine(markArray);

        String msg = String.format("Group № %d has the highest average mark.", maxAverageMarkLine);
        printMsg(msg);
        msg = String.format("Group № %d has the lowest average mark.", minAverageMarkLine);
        printMsg(msg);

//        - найти группы с максимальным количеством оценок десять (или любой другой оценки);
        int mark = 10;
        int groupNumber = findMaxMark10Line(markArray, mark);
        msg = String.format("In group № %d, the largest number of ratings is %d.\n", groupNumber, mark);
        printMsg(msg);

//        - найти группы, где есть хотя бы одна неудовлетворительная оценка (0, 1, 2 и 3);
        msg = "Groups with unsatisfactory mark : " + findGroupsWithUnsatisfactoryMarks(markArray);
        printMsg(msg);

//        - в группах, где средняя успеваемость выше общей средней успеваемости
//        по всей академии, увеличить оценки каждому студенту на один балл (или больше);
        improveGradesForGoodStudents(markArray);
        printMatrix("Marks after promotion : ", markArray);

//        - отсортировать группы по убыванию их средней успеваемости.
        printMatrixWithAverageMarks("Marks before sort : ", markArray);
        groupSort(markArray);
        printMatrixWithAverageMarks("Marks after sort : ", markArray);
    }
}
