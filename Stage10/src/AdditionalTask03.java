import java.util.Scanner;

//Написать программу, которая подсчитывает
//количество только чётных (или нечётных) цифр заданного натурального числа.
public class AdditionalTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println(AdditionalTask03Solution.findEven(number));
        System.out.println(AdditionalTask03Solution.findOdd(number));
    }
}

class AdditionalTask03Solution {
    public static int findEven(int number) {
        int countEven = 0;
        while (number != 0) {
            if (number % 2 == 0)
                countEven++;
            number /= 10;
        }
        return countEven;
    }

    public static int findOdd(int number) {
        int countOdd = 0;
        while (number != 0) {
            if (number % 2 != 0)
                countOdd++;
            number /= 10;
        }
        return countOdd;
    }
}