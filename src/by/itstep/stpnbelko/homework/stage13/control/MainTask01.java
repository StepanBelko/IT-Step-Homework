package by.itstep.stpnbelko.homework.stage13.control;

import by.itstep.stpnbelko.homework.stage13.model.util.Array;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask01Logic.isAscendingCondition;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask01Logic.isDescendingCondition;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class MainTask01 {
    /*
    Необходимо разработать программу, которая проверяет,
    что все элементы вектора находятся в упорядоченном виде,
    т.е. отсортированы по возрастанию или убыванию.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Enter number of elements in array");

        int numbersOfElement = scanner.nextInt();
        int[] array = new int[numbersOfElement];
        Array.createArray(array);
        print(Arrays.toString(array));

        boolean arrayAscendingCondition = isAscendingCondition(array);
        boolean arrayDescendingCondition = isDescendingCondition(array);

        String msg = String.format("Is ascending sequence? - %s\nIs descending sequence? - %s",
                arrayAscendingCondition, arrayDescendingCondition);
        print(msg);
    }
}
