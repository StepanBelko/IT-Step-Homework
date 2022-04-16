package by.itstep.stpnbelko.homework.stage13.control;

import by.itstep.stpnbelko.homework.stage13.model.util.Array;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage13.model.logic.GeneralTaskLogic.*;
import static by.itstep.stpnbelko.homework.stage13.view.Printer.print;

public class GeneralTask {
    /*
    Дана некоторая последовательность вещественных чисел. Необходимо:

    - найти экстремальные элементы заданной последовательности
      (наибольший и наименьший элементы, а также среднеарифметическое);

    -поменять местами экстремальные элементы
    (если их несколько, то первые из найденных);

    - найти сумму всех элементов последовательности, абсолютная величина
    которых меньше среднего арифметического всех элементов последовательности;

 - найти произведение всех положительных элементов последовательности,
    которые стоят на чётных местах.
    */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        print("Enter number of elements in array");
        int numbersOfElement = scanner.nextInt();
        int[] array = new int[numbersOfElement];
        Array.createArray(array);
        print(Arrays.toString(array));

        print("Find extreme elements");
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        String msg = String.format("Max value = %d\nMin value = %d", maxValue, minValue);
        print(msg);

        print("Swap first max and first min elements");
        swapMaxAndMinElements(array);
        msg = Arrays.toString(array);
        print(msg);

        print("Find sum of elements more than arithmetic mean");
        msg = String.format("Sum = %d", countSumOfElementsMoreThanArithmeticMean(array));
        print(msg);

        print("Sum of all positive elements, who standing one even places");
        msg = String.format("Sum = %d", countSumOfPositiveElementsInEvenPlaces(array));
        print(msg);
    }
}
