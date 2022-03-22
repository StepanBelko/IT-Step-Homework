package by.itstep.stpnbelko.homework.stage09.control;

import by.itstep.stpnbelko.homework.stage09.logic.CakeSimulator;
import by.itstep.stpnbelko.homework.stage09.view.Printer;

public class GeneralTask {

    public static void main(String[] args) {

        String msg = (CakeSimulator.takeCake());
        Printer.printMsg(msg);

    }
}
