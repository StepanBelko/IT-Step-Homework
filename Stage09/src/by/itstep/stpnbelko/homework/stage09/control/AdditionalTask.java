package by.itstep.stpnbelko.homework.stage09.control;

import by.itstep.stpnbelko.homework.stage09.view.Printer;

import java.util.HashMap;
import java.util.Random;

import static by.itstep.stpnbelko.homework.stage09.logic.AdditionalTaskSolution.*;

public class AdditionalTask {
    static Random random = new Random();
    static int year = random.nextInt(9999) + 1;
    static int month = random.nextInt(12) + 1;

    public final static HashMap<Integer, Integer> yearMap = new HashMap<>();

    static {
        fillYearMap(year);
    }

    static int dayOfMonth = random.nextInt(yearMap.get(month)) + 1;


//    Заданы три целых числа, которые задают некоторую дату.
//    Числа можно задавать самостоятельно или с помощью
//    генератора псевдослучайных значений.
//    Определить дату следующего дня. Не рекомендуется использовать
//    типы стандартной библиотеки языка для работы
//    с датой и временем (или можно использовать, но как второй вариант реализации).

    public static void main(String[] args) {

        System.out.println("Метод с GregorianCalendar и LocalDateTime");
        String msg = findNextDayGregorianClass(year, month, dayOfMonth);
        Printer.printMsg(msg);

        System.out.print("\nМетод с HashMap\n");
        msg = findNextDayHashMap(year, month, dayOfMonth);
        Printer.printMsg(msg);

        System.out.println("Метод с циклами");
        msg = findNextDayCycle(year, month, dayOfMonth);
        Printer.printMsg(msg);
    }

    private static void fillYearMap(int year) {
        yearMap.put(1, 31);
        if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0 && year / 400 != 0) ||
                (year % 4 == 0 && year % 100 != 0 && year % 400 != 0)) {
            yearMap.put(2, 29);
        } else {
            yearMap.put(2, 28);
        }
        yearMap.put(3, 31);
        yearMap.put(4, 30);
        yearMap.put(5, 31);
        yearMap.put(6, 30);
        yearMap.put(7, 31);
        yearMap.put(8, 31);
        yearMap.put(9, 30);
        yearMap.put(10, 31);
        yearMap.put(11, 30);
        yearMap.put(12, 31);
    }
}
