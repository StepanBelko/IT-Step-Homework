package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask01Solution.isAllNumEven;
import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask02Solution.isAllNumOdd;

//Разработайте программу, которая проверяет, что все цифры, которые входят в
//заданное натуральное число, являются чётными.
public class AdditionalTask01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int number = scanner.nextInt();

        String msg = String.format("All numbers are even =  %s\n",
                isAllNumEven(number) ? "Yes" : "No");
        Printer.printMsg(msg);

        msg = String.format("All numbers are odd =  %s\n",
                isAllNumOdd(number) ? "Yes" : "No");
        Printer.printMsg(msg);
    }
}

