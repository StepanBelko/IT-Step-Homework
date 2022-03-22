import java.util.Scanner;

public class AdditionalTask05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter natural number ");
        int number = scanner.nextInt();
        System.out.print("what number do you need to find? ");
        int digitToSearch = scanner.nextInt();

        System.out.println(AdditionalTask05Solution.searchCountDigit(number, digitToSearch));


    }

}

class AdditionalTask05Solution {
    public static int searchCountDigit(int number, int digitToSearch) {
        number = number > 0 ? number : -number;
        int counter = 0;
        while (number != 0) {
            if (number % 10 == digitToSearch) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
