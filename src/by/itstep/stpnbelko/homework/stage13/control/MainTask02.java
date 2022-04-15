package by.itstep.stpnbelko.homework.stage13.control;

import by.itstep.stpnbelko.homework.stage13.model.util.Array;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask02Logic.isMirrorSequence;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class MainTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Enter number of elements in array");

        int numbersOfElement = scanner.nextInt();
        int[] array = new int[numbersOfElement];
        Array.createArray(array);
        print(Arrays.toString(array));
        boolean isMirrorSequence = isMirrorSequence(array);
        String msg = String.format("Is mirror sequence? - %s", isMirrorSequence ? "Yes" : "No");
        print(msg);
    }
}
