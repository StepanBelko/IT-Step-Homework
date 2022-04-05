package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask03Solution.findEven;
import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask03Solution.findOdd;

//Написать программу, которая подсчитывает
//количество только чётных (или нечётных) цифр заданного натурального числа.
public class AdditionalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        String msg = String.format("Even = %d\nOdd = %d\n",findEven(number), findOdd(number));
        Printer.printMsg(msg);
    }
}

