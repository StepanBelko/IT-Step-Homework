package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.Random;

public class CakeSimulator {
    public static final int NUMBERS_OF_SIMULATION = 7;

    public static final String FIRST_SURPRISE = "Free beer";
    public static final String SECOND_SURPRISE = "Everything is free for you";
    public static final String THIRD_SURPRISE = "Free drink for you";
    public static final String FOURTH_SURPRISE = "You have already passed the exam";
    public static final String FIFTH_SURPRISE = "Coupon for a free car wash";
    public static final String SIXTH_SURPRISE = "Two movie tickets";
    public static final String SEVENTH_SURPRISE = "One more cake for you";

    public static String takeCake() {
        Random random = new Random();
        int number = random.nextInt(NUMBERS_OF_SIMULATION);
        String surprise;

        surprise = switch (number) {
            case 1 -> FIRST_SURPRISE;
            case 2 -> SECOND_SURPRISE;
            case 3 -> THIRD_SURPRISE;
            case 4 -> FOURTH_SURPRISE;
            case 5 -> FIFTH_SURPRISE;
            case 6 -> SIXTH_SURPRISE;
            default -> SEVENTH_SURPRISE;
        };
        return surprise;
    }
}
