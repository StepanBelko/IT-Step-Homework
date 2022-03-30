package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage10.logic.MainTask03Solution.*;

public class MainTask03 {
    //    Разработайте программу, которая проверяет, что цифры заданного числа образуют
//    возрастающую (убывающую) последовательность (к примеру, число 1357 удовлетворяет
//    условию, т.к. его цифры соответствуют следующему неравенству: 1 < 3 < 5 < 7, т.е.
//    идут в порядке возрастания; число 98765 также удовлетворяет условию, т.к. его цифры
//    соответствуют следующему неравенству 9 > 8 > 7 > 6 > 5; а вот числа 192837, 777, 19283746
//    – не удовлетворяют условию).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        String msg = "Ascending sequence? - " +
                (isAscendingSequence(number) ? "Yes" : "No");
        Printer.printMsg(msg);

        msg = "Descending sequence? - " +
                (isDescendingSequence(number) ? "Yes" : "No");
        Printer.printMsg(msg);

    }

}

