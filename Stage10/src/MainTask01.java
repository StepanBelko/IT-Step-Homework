import java.util.Scanner;

//Разработайте программу, которая проверяет, что все цифры заданного натурального числа одинаковы.
public class MainTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number ");
        int number = scanner.nextInt();

        if (MainTask01Solution.checkNumbers(number)) {
            System.out.println("all numbers are the same");
        } else {
            System.out.println("all numbers are not the same");
        }
    }

}

class MainTask01Solution {
    public static boolean checkNumbers(int number) {
        if (number <= 0) {
            System.out.println("invalid number");
            return false;
        }
        while (number / 10 != 0) {
            int lastNum = number % 10;
            number /= 10;
            if (number % 10 != lastNum) {
                return false;
            }
        }
        return true;

    }
}
