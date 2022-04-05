package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask05Solution.searchCountDigit;

public class AdditionalTask05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter natural number ");
        int number = scanner.nextInt();
        System.out.print("what number do you need to find? ");
        int digitToSearch = scanner.nextInt();

        String msg = String.format("The number %d occurs %d times",
                digitToSearch, searchCountDigit(number, digitToSearch));
        Printer.printMsg(msg);


    }

}
