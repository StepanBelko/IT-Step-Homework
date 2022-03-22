//Начальный вклад в банке равен 1000 руб. При ежемесячной капитализации через каждый месяц
//размер вклада увеличивается на P процентов от имеющейся суммы (P – вещественное число,
//которое должно удовлетворять неравенству 0 < P < 25). По данному P определить,
//через сколько месяцев размер вклада превысит 2000 руб., и вывести найденное количество
//месяцев K (целое число) и итоговый размер вклада S (вещественное число).
public class MainTask05 {
    static double depositSize = 1000;
    static double depositPercentage = Math.random() * 25 + 1;
    static final double CONTROL_CHECK_SUM = 2000;

    public static void main(String[] args) {

        Deposit deposit = MainTask05Solution.countDepositPercentage(depositSize, depositPercentage);

        System.out.printf("Deposit percentage = %.2f\n", depositPercentage);
        System.out.printf("Deposit size after %d month = %.2f",
                deposit.monthCount(), deposit.depositSize());
    }
}

class MainTask05Solution {
    public static Deposit countDepositPercentage(double deposit, double depositPercentage) {

        int monthCount = 0;
        while (deposit <= MainTask05.CONTROL_CHECK_SUM) {
            deposit += (deposit / 100) * depositPercentage;
            monthCount++;
        }

        return new Deposit(monthCount, deposit);
    }

}

record Deposit(int monthCount, double depositSize) {
}

