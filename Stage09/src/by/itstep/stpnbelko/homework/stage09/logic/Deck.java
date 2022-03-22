package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.ArrayList;

public class Deck {
    private final ArrayList<String> PokerDeck = new ArrayList<>();
    private static final String[] SUITS = {"Пик", "Бубен", "Черв", "Треф"};
    private static final String[] RANKS = {"6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

    public ArrayList<String> getPokerDeck() {
        return PokerDeck;
    }

    public int getPokerDeckSize() {
        return PokerDeck.size();
    }

    {
        for (String rank : RANKS) {
            for (String suit : SUITS) {
                PokerDeck.add(rank + " " + suit);
            }
        }
    }
}
