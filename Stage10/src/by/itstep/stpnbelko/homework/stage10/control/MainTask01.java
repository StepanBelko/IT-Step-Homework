package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import static by.itstep.stpnbelko.homework.stage10.logic.MainTask01Solution.*;

import java.util.Scanner;

//Разработайте программу, которая проверяет, что все цифры заданного натурального числа одинаковы.
public class MainTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number ");
        int number = scanner.nextInt();

        String msg = checkNumbers(number) ?
                "all numbers are the same" : "all numbers are not the same";
        Printer.printMsg(msg);

    }
}

