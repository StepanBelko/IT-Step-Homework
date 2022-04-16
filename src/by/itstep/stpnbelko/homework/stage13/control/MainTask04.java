package by.itstep.stpnbelko.homework.stage13.control;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask04Logic.countEvenElements;
import static by.itstep.stpnbelko.homework.stage13.model.logic.MainTask04Logic.countOddElements;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class MainTask04 {
    //    Написать программу, которая подсчитывает количество
//    только чётных/нечётных элементов вектора.
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

        int evenElementCounter = countEvenElements(array);
        int oddElementCounter = countOddElements(array);

        String msg = String.format("Even elements - %d\nOdd elements - %d",
                evenElementCounter, oddElementCounter);
        print(msg);
    }
}
