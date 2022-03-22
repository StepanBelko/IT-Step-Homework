import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Random;

public class AdditionalTaskSolution {
    static Random random = new Random();
    static int year = random.nextInt(9999) + 1;
    static int month = random.nextInt(12) + 1;

    final static HashMap<Integer, Integer> yearMap = new HashMap<>();

    public static void findNextDayGregorianClass() {

        fillYearMap(year);

        int dayOfMonth = random.nextInt(yearMap.get(month)) + 1;

        System.out.println("Метод с GregorianCalendar и LocalDateTime");
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM, EEEE, y год");
        LocalDateTime localDateTime = LocalDateTime.of(year, month, dayOfMonth,0,0);


        GregorianCalendar calendar = new GregorianCalendar(localDateTime.getYear(), localDateTime.getMonthValue() - 1, localDateTime.getDayOfMonth());
        System.out.printf("Current day is %s\n", dateFormat.format(calendar.getTime()));

        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
        System.out.printf("Next day is %s", dateFormat.format(calendar.getTime()));
    }

    public static void findNextDayHashMap() {

        fillYearMap(year);
        
        int dayOfMonth = random.nextInt(yearMap.get(month)) + 1;

        System.out.print("\nМетод с HashMap\n");
        String msg;

            System.out.printf("Current date is %02d.%02d.%d\n", dayOfMonth, month, year);

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
            System.out.printf("    New date is %02d.%02d.%d\n", dayOfMonth, month, year);
    }

    public static void findNextDayCycle() {
        System.out.println("Метод с циклами");
        int numDays = findDayInMonthCycle(year,month);
        String msg = "";

        int dayOfMonth = random.nextInt(findDayInMonthCycle(year, month)) +1;

        System.out.printf("Current date is %02d.%02d.%d\n", dayOfMonth, month, year);

        if (month == 12 && dayOfMonth == numDays) {
            year++;
            dayOfMonth = 1;
            month = 1;
        } else if (dayOfMonth == numDays) {
            dayOfMonth = 1;
            month++;
        } else {
            dayOfMonth++;
        }
        System.out.printf("    New date is %02d.%02d.%d\n", dayOfMonth, month, year);
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
