import java.util.Scanner;

public class MainTask03 {
    //    Разработайте программу, которая проверяет, что цифры заданного числао бразуют
//    возрастающую (убывающую) последовательность (к примеру, число 1357 удовлетворяет
//    условию, т.к. его цифры соответствуют следующему неравенству: 1 < 3 < 5 < 7, т.е.
//    идут в порядке возрастания; число 98765 также удовлетворяет условию, т.к. его цифры
//    соответствуют следующему неравенству 9 > 8 > 7 > 6 > 5; а вот числа 192837, 777, 19283746
//    – не удовлетворяют условию).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println(MainTask03Solution.isAscendingSequence(number));
        System.out.println(MainTask03Solution.isDescendingSequence(number));

    }

}

class MainTask03Solution {
    public static boolean isAscendingSequence(int number) {
        if (number == 0)
            return false;
        while (number / 10 != 0) {
            if (number % 10 > (number / 10) % 10) {
                number /= 10;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescendingSequence(int number) {
        if (number == 0)
            return false;
        while (number / 10 != 0) {
            if (number % 10 < (number / 10) % 10) {
                number /= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}
