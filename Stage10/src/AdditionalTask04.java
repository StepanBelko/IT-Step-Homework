//Разработайте программу, которая с использованием эффективного алгоритма
//находит максимальную цифру заданного натурального числа.
//К примеру, в числе 18 273 645 максимальная цифра восемь, а в числе 777 – семь.
public class AdditionalTask04 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1_000_000_000);
        System.out.println("Number = " + number);
        System.out.println("Max digit is " + AdditionalTask04Solution.findMaxDigit(number));
    }
}

class AdditionalTask04Solution {
    public static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number != 0) {
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
            if (maxDigit == 9)
                return maxDigit;
            number /= 10;
        }
        return maxDigit;
    }
}
