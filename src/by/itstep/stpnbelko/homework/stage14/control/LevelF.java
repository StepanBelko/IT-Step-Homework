package by.itstep.stpnbelko.homework.stage14.control;
import by.itstep.stpnbelko.homework.stage14.model.logic.ExceptionArrayIsNull;

import java.util.Arrays;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelFLogic.*;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelF {
    //    Отсортировать элементы вектора по убыванию до первого/последнего элемента, равного нулю.
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 4, 9, 8, 0, 5, 4, 3, 6, 8, 2, 1, 0, 7, 7, 5};
        try {
            sortBeforeFirstZero(array);
        } catch (ExceptionArrayIsNull e) {
            System.out.println(e.getMessage());
        }
        sortBeforeLastZero(array);
        print(Arrays.toString(array));
    }
}
