package by.itstep.stpnbelko.homework.stage09.logic;

import static by.itstep.stpnbelko.homework.stage09.control.AdditionalTask.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;


public class AdditionalTaskSolution {

    public static String findNextDayGregorianClass(int year, int month, int dayOfMonth) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM, EEEE, y год");
        LocalDateTime localDateTime = LocalDateTime.of(year, month, dayOfMonth, 0, 0);

        GregorianCalendar calendar = new GregorianCalendar(localDateTime.getYear(),
                localDateTime.getMonthValue() - 1, localDateTime.getDayOfMonth());
        String msg = String.format("Random day is %s\n", dateFormat.format(calendar.getTime()));

        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
        msg += String.format("Next day is %s", dateFormat.format(calendar.getTime()));
        return msg;
    }

    public static String findNextDayHashMap(int year, int month, int dayOfMonth) {

        String msg = String.format("Random date is %02d.%02d.%d\n", dayOfMonth, month, year);

        if (month == yearMap.size() && dayOfMonth == yearMap.get(month)) {
            year++;
            month = 1;
            dayOfMonth = 1;
        } else if (dayOfMonth == yearMap.get(month)) {
            month++;
            dayOfMonth = 1;
        } else {
            dayOfMonth++;
        }
        msg += String.format("    New date is %02d.%02d.%d\n", dayOfMonth, month, year);
        return msg;
    }

    public static String findNextDayCycle(int year, int month, int dayOfMonth) {

        int daysInMonth = findDayInMonthCycle(year, month);

        String msg = String.format("Current date is %02d.%02d.%d\n", dayOfMonth, month, year);

        if (month == 12 && dayOfMonth == daysInMonth) {
            year++;
            dayOfMonth = 1;
            month = 1;
        } else if (dayOfMonth == daysInMonth) {
            dayOfMonth = 1;
            month++;
        } else {
            dayOfMonth++;
        }
        msg += String.format("    New date is %02d.%02d.%d\n", dayOfMonth, month, year);
        return msg;
    }

    ///Вспомогательные методы:

    public static int findDayInMonthCycle(int year, int month) {
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
        }
        return numDays;
    }

}
