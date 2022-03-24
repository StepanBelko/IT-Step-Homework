import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Массив по дефолту заполнен рандомными оценками (A = 10, B = 9, C = 8 и т.д. )

        //метод позволяет поставить отметку по заданному номеру
        HugeMarkList.setMark(2_545_345_234L, "A");

        //или получить отметку по номеру
        System.out.println("Отметку под каким номером вы хотите посмотреть?");
        long number = scanner.nextLong();
        System.out.printf("Отметка под номером %d - %s\n", number, HugeMarkList.getMark(number));

        //при необходимости можно допилить поиск по оценке
        HugeMarkList.findMark("C");

        //в общем много чего можно доделать, но идея, думаю, ясна -
        // - запихнуть в ячейку массива не одну оценку,
        // а, в данном случае сто тысяч.
    }
}
class HugeMarkList {
    static private final int ELEMENTS_IN_CELL = 100_000;
    static String[] arrayOfMarks = new String[1_000_000]; // массив на 10 000 000 000 оценок

    static {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ELEMENTS_IN_CELL; i++) {
            stringBuilder.append((char) (random.nextInt(10) + 65));
        }
        String string = stringBuilder.toString();    // строка на 10_000 рандомных оценок
        Arrays.fill(arrayOfMarks, string); //   заполняем массив нашей строкой
    }


    public static void findMark(String findMark) {
        for (long i = 1; i < ((long) ELEMENTS_IN_CELL * arrayOfMarks.length); i++) {
            if (getMark(i).equals(findMark)) {
                System.out.println("Yes!");
                break;
            }
        }
    }

    public static void setMark(long markLongIndex, String mark) {
        markLongIndex -= 1;
        String string = arrayOfMarks[(int) ((markLongIndex) / ELEMENTS_IN_CELL)];
        string = string.substring(0, (int) ((markLongIndex) % ELEMENTS_IN_CELL))
                + mark + string.substring((int) ((markLongIndex + 1) % ELEMENTS_IN_CELL));
        arrayOfMarks[(int) ((markLongIndex) / ELEMENTS_IN_CELL)] = string;
    }

    public static String getMark(long markLongIndex) {
        markLongIndex -= 1;
        String markString = arrayOfMarks[(int) (markLongIndex / ELEMENTS_IN_CELL)];
        return (markString.substring((int) (markLongIndex % ELEMENTS_IN_CELL),
                (int) (markLongIndex % ELEMENTS_IN_CELL) + 1));
    }
}

