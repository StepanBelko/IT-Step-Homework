package by.itstep.stpnbelko.homework.stage13.control;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask03Logic.isAllElementsDifferent;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask03Logic.isAllElementsSame;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class MainTask03 {
    /*
    Необходимо разработать программу, которая проверяет,
    что все элементы вектора различны/одинаковы.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Enter number of elements in array");
        int numbersOfElement = scanner.nextInt();
        int[] array = new int[numbersOfElement];
        print("Enter your array");
        for (int i = 0; i < numbersOfElement; i++) {
            array[i] = scanner.nextInt();
        }

        print(Arrays.toString(array));

        String isElementsDifferent = isAllElementsDifferent(array) ? "Yes" : "No";
        String isElementsSame = isAllElementsSame(array) ? "Yes" : "No";

        String msg = String.format("Is all elements are different? - %s\nIs all elements are same? - %s",
                isElementsDifferent, isElementsSame);
        print(msg);
    }
}
