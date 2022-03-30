package by.itstep.stpnbelko.homework.stage10.logic;

import by.itstep.stpnbelko.homework.stage10.control.MainTask05;
import by.itstep.stpnbelko.homework.stage10.data.Deposit;

public class MainTask05Solution {
    public static Deposit countDepositPercentage(double deposit, double depositPercentage) {

        int monthCount = 0;
        while (deposit <= MainTask05.CONTROL_CHECK_SUM) {
            deposit += (deposit / 100) * depositPercentage;
            monthCount++;
        }

        return new Deposit(monthCount, deposit);
    }
}

