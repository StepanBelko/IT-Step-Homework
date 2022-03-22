package by.itstep.stpnbelko.homework.stage11.controller;

import static by.itstep.stpnbelko.homework.stage11.util.StringBuilder.buildMessage;
import static by.itstep.stpnbelko.homework.stage11.util.EnterToContinue.pressEnterToContinue;

import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask01Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.GeneralTask02Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask01Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask02Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask03Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask04Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.MainTask05Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask01Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask02Solution.*;
import static by.itstep.stpnbelko.homework.stage11.businesLogic.AdditionalTask03Solution.*;
import static by.itstep.stpnbelko.homework.stage11.view.Printer.printMsg;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("General Task 01. Count sum of digit\n Enter number N ");
        long longNumber = scanner.nextLong();
        String msg = String.format("Number = %d, sum of all digit = %d\n",
                longNumber, countDigitSum(longNumber));
        printMsg(msg);
        pressEnterToContinue();


        System.out.print("General Task 02. Found different digit\n Enter number N: ");
        longNumber = scanner.nextLong();
        msg = String.format("Number %d have %d different digit\n", longNumber, countDifferentDigit(longNumber));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nMain Task 01. Heads or tails?\n");
        int heads = countHead();
        msg = String.format("Number of throws = %d\nHeads = %d, tails = %d\n", NUMBER_OF_THROWS,
                heads, NUMBER_OF_THROWS - heads);
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nMain Task 02. Reverse number\n");
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        msg = String.format("Number = %d, reverseNumber = %d\n", number, writeReverseNumber(number));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nMain Task 03. Prime number\n");
        System.out.print("Input number: ");
        number = scanner.nextInt();
        msg = String.format("Number %d is prime? - %b\n", number, isPrime(number));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nMain Task 04. Find factorial\n");
        System.out.print("Input number: ");
        number = scanner.nextInt();
        msg = String.format("%d! = %d\n", number, findFactorial(number));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nMain Task 05. Prime dividers\n");
        System.out.print("Input number: ");
        number = scanner.nextInt();
        msg = String.format("Prime dividers %d is %s", number, findPrimeDividers(number));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nAdditional Task01. Greatest common divisor\n");
        System.out.print("Input number a: ");
        int a = scanner.nextInt();
        System.out.print("Input number b : ");
        int b = scanner.nextInt();
        msg = String.format("Greatest common divisor numbers %d and %d is %d",
                a, b, findGreatestCommonDivisor(a, b));
        printMsg(msg);
        msg = String.format("\nLeast common multiple numbers %d and %d is %d",
                a, b, findLeastCommonMultiple(a, b));
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nAdditional Task02. Armstrong number\nInput count of digit\n");
        int digitCount = scanner.nextInt();
        if (findArmstrongNumber(digitCount).isEmpty()) {
            msg = "There is not Armstrong numbers\n";
        } else {
            msg = buildMessage(findArmstrongNumber(digitCount));
        }
        printMsg(msg);
        pressEnterToContinue();

        System.out.print("\nAdditional Task03. Counting happy tickets\n");
        System.out.print("Input count of digit in bus ticket number: ");
        int ticketCount = scanner.nextInt();
        msg = String.format("Count of happy tickets: %d", countHappyTicket(ticketCount));
        printMsg(msg);
    }

}
