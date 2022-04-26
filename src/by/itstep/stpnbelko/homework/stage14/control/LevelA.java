package by.itstep.stpnbelko.homework.stage14.control;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelALogic.countNonZeroElements;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, -23, -8,  0, 6, 5, -5, -3, -22};
        System.out.println("A1.  Find not zero");

        String msg = String.format("how much non-zero elements are in the array? - %d", countNonZeroElements(array));
        print(msg);
    }
}
