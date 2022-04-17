package by.itstep.stpnbelko.homework.stage14.control;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelELogic.countSumOfElementsBeforeLastPositive;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelE {
    //    3) В векторе, состоящем из вещественных элементов,
//    вычислить сумму элементов, расположенных до последнего положительного элемента.
    public static void main(String[] args) {
        int[] array = {-1, -2, -3, -4, 23, 12, 6, -8, -4, -3, 0};
        print("" + countSumOfElementsBeforeLastPositive(array));
    }
}
