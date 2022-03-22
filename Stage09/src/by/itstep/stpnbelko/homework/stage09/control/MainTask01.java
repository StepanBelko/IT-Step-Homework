package by.itstep.stpnbelko.homework.stage09.control;

import by.itstep.stpnbelko.homework.stage09.view.Printer;

import static by.itstep.stpnbelko.homework.stage09.logic.DiceClass.*;


import java.util.Scanner;

public class MainTask01 {
// Напишите программу, которая бы эмулировала игру
//«Dice» (игра в кости). Суть игры заключается в броске
//двух шестигранных кубиков (костей) и подсчёта общей
//суммы очков, которые выпали на первой и второй костей.

    public static void main(String[] args) {

        int randomNumber1 = countRandomNumber();
        int randomNumber2 = countRandomNumber();

        String msg = String.format("Number 1 = %1$d\nNumber 2 = %2$d\n%1$d + %2$d = %3$d",
                randomNumber1, randomNumber2, randomNumber1 + randomNumber2);

        Printer.printMsg(msg);
    }
}