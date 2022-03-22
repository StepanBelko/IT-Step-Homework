package by.itstep.stpnbelko.homework.stage09.control;

import by.itstep.stpnbelko.homework.stage09.view.Printer;

import static by.itstep.stpnbelko.homework.stage09.logic.DiceClass.*;

public class MainTask01 {
// Напишите программу, которая бы эмулировала игру
//«Dice» (игра в кости). Суть игры заключается в броске
//двух шестигранных кубиков (костей) и подсчёта общей
//суммы очков, которые выпали на первой и второй костей.

    public static void main(String[] args) {

        String msg = String.format("Your score is %d", countSumTwoRandomNumbers());

        Printer.printMsg(msg);
    }
}