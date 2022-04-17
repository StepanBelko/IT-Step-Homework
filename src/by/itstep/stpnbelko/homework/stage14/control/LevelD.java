package by.itstep.stpnbelko.homework.stage14.control;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelDLogic.isAllElementsDifferent;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelD {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -23, -8,  0, 6, 5, -5, -3, -22};

        System.out.println("D1. Is All elements are different?");
        String msg = isAllElementsDifferent(array) ? "Yes, all elements are different" : "No. Elements are no different";
        print(msg);
    }
}
