package by.itstep.stpnbelko.homework.stage10.control;

import by.itstep.stpnbelko.homework.stage10.view.Printer;

import static by.itstep.stpnbelko.homework.stage10.logic.AdditionalTask04Solution.findMaxDigit;

//Разработайте программу, которая с использованием эффективного алгоритма
//находит максимальную цифру заданного натурального числа.
//К примеру, в числе 18 273 645 максимальная цифра восемь, а в числе 777 – семь.
public class AdditionalTask04 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1_000_000_000);

        String msg = String.format("Number = %d\nMax digit is %d\n",number, findMaxDigit(number));
        Printer.printMsg(msg);
        
    }
}

