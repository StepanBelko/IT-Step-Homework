package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private final static int CARD_FOR_EACH_PLAYER = 2;
    private final static int CARD_ON_THE_TABLE = 5;

    private final static ArrayList<Player> PlayerList = new ArrayList<>();
    private final static String[] cardsOnTheTable = new String[CARD_ON_THE_TABLE];

    static Random random = new Random();

    public static ArrayList<Player> getPlayerList() {
        return PlayerList;
    }

    public static String[] getCardsOnTheTable() {
        return cardsOnTheTable;
    }


    public static void startGame(int numberOfPlayers) {
        Deck deck = new Deck(); // создали колоду

        if ((numberOfPlayers * CARD_FOR_EACH_PLAYER + CARD_ON_THE_TABLE) > deck.getPokerDeckSize()) {
            throw new RuntimeException("Слишком много игроков");
        } else if (numberOfPlayers <= 0) {
            throw new RuntimeException("Игроков должно быть больше 0");
        } else {
            putTheCardsOnTheTable(deck);             // раздали карты на стол
            cardDistribution(numberOfPlayers, deck); // раздали карты игрокам
        }
    }

    // вытаскиваем 5 карт на стол
    private static void putTheCardsOnTheTable(Deck deck) {
        int randomCard;
        for (int i = 0; i < CARD_ON_THE_TABLE; i++) {
            randomCard = random.nextInt(deck.getPokerDeckSize());
            cardsOnTheTable[i] = deck.getPokerDeck().get(randomCard);
            deck.getPokerDeck().remove(randomCard);
        }
    }

    // раздаём игрокам
    private static void cardDistribution(int playersCount, Deck deck) {
        for (int i = 1; playersCount > 0; playersCount--, i++) {
            Player player = new Player(i);
            for (int j = 0; j < CARD_FOR_EACH_PLAYER; j++) {
                int randomCard = random.nextInt(deck.getPokerDeckSize());
                player.playerCards.add(deck.getPokerDeck().get(randomCard));
                deck.getPokerDeck().remove(randomCard);
            }
            PlayerList.add(player);
        }

    }

}
