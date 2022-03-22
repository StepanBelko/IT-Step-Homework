import java.util.Scanner;

//Разработайте программу, которая проверяет, что все цифры, которые входят в
//заданное натуральное число, являются чётными.
public class AdditionalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int number = scanner.nextInt();

        System.out.printf("All numbers are even =  %s\n", AdditionalTask01Solution.isAllNumEven(number));
        System.out.printf("All numbers are odd =  %s\n", AdditionalTask02Solution.isAllNumOdd(number));

    }
}

class AdditionalTask01Solution {
    public static boolean isAllNumEven(int number) {
        boolean isEven = true;
        while (number != 0) {
            if (number % 2 != 0) {
                isEven = false;
                break;
            }
            number /= 10;
        }
        return isEven;
    }
}

class AdditionalTask02Solution {
    public static boolean isAllNumOdd(int number) {
        boolean isOdd = true;
        while (number != 0) {
            if (number % 2 == 0) {
                isOdd = false;
                break;
            }
            number /= 10;
        }
        return isOdd;
    }
}
