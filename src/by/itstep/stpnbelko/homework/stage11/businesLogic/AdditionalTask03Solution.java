package by.itstep.stpnbelko.homework.stage11.businesLogic;

public class AdditionalTask03Solution {
    public static int countHappyTicket(int digitCount) {
        if (digitCount <= 0)
            return -1;
        int ticketCounter = 0;
        int allTicketCount = 1;
        for (int i = 0; i < digitCount; i++) {
            allTicketCount *= 10;
        }
        for (int i = 0; i < allTicketCount; i++) {
            int number = i;

            int lastDigitSum = 0;
            for (int j = 0; j < digitCount / 2; j++) {
                lastDigitSum += number % 10;
                number /= 10;
            }

            if (digitCount % 2 != 0) {
                number /= 10;
            }

            int firstDigitSum = 0;
            for (int j = 0; j < digitCount / 2; j++) {
                firstDigitSum += number % 10;
                number /= 10;
            }
            if (firstDigitSum == lastDigitSum) {
                ticketCounter++;
            }
        }

        return ticketCounter;
    }
}
