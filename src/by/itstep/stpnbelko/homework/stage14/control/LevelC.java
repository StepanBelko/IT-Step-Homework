package by.itstep.stpnbelko.homework.stage14.control;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelCLogic.countElementMoreArithmeticMean;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelC {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -23, -8,  0, 6, 5, -5, -3, -22};

        System.out.println("C1");
        String msg = String.format("%d elements more arithmetic mean", countElementMoreArithmeticMean(array));
        print(msg);
    }
}
