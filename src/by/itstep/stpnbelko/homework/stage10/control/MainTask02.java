package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.MainTask02Solution.*;

//Разработайте программу, которая проверяет, что все цифры заданного
//натурального числа различны (или одинаковы).
public class MainTask02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int number = scanner.nextInt();
        String msg = "All numbers the same? - " +
                (checkSameNumbers(number) ? "Yes" : "No");
        Printer.printMsg(msg);

        msg = "All numbers are different?(Array) - " +
                (checkDifferentNumbers(number) ? "Yes" : "No");
        Printer.printMsg(msg);

        msg = "All numbers are different?(Cycle) - " +
                (checkDiffNumCycle(number) ? "Yes" : "No");
        Printer.printMsg(msg);
    }
}
