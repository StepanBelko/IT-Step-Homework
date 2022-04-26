package by.itstep.stpnbelko.homework.stage14.control;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelBLogic.countElementAbsMoreThanN;
import static by.itstep.stpnbelko.homework.stage14.model.logic.LevelBLogic.countItemsMoreThanN;
import static by.itstep.stpnbelko.homework.stage14.view.Printer.print;

public class LevelB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, -23, -8,  0, 6, 5, -5, -3, -22};
        System.out.println("B1.  Find items greater than N");
        System.out.println("Enter N");
        int N = scanner.nextInt();

        String msg = String.format("How many items more than %d? - %d", N, countItemsMoreThanN(array, N));
        print(msg);

        System.out.println("B7.  Find |element| greater than N");
        System.out.println("Enter N");
        N = scanner.nextInt();
        msg = String.format("%d abs elements more than %d", countElementAbsMoreThanN(array, N), N);
        print(msg);
    }
}
