package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.ArrayList;
import java.util.Random;

public class PokerClass {
    //формируем колоду
    // 9 карт по 4 масти каждого достоинства
    private final static ArrayList<String> deck = new ArrayList<>();
    private final static String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
    private final static String[] ranks = {"6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    private final static int CARD_IN_THE_DECK = suits.length * ranks.length;

    private final static int CARD_FOR_EACH_PLAYER = 2;
    private final static int CARD_ON_THE_TABLE = 5;

    private static ArrayList<Player> PlayerList = new ArrayList<>();
    private static String[] cardsOnTheTable = new String[CARD_ON_THE_TABLE];

    static Random random = new Random();

    public static ArrayList<Player> getPlayerList() {
        return PlayerList;
    }

    public static String[] getCardsOnTheTable() {
        return cardsOnTheTable;
    }

    public static String startGame(int numberOfPlayers) {
        createDeck();

        if ((numberOfPlayers * CARD_FOR_EACH_PLAYER + CARD_ON_THE_TABLE) > CARD_IN_THE_DECK) {
            return "Слишком много игроков";
        } else if (numberOfPlayers <= 0) {
            return "Игроков должно быть больше 0";
        } else {
            putTheCardsOnTheTable();
            cardDistribution(numberOfPlayers);
        }
        return "Игра окончена";
    }

    //заполняем колоду
    private static void createDeck() {
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(rank + " " + suit);
            }
        }
    }

    // вытаскиваем 5 карт на стол
    private static void putTheCardsOnTheTable() {
        int randomCard;
        for (int i = 0; i < CARD_ON_THE_TABLE; i++) {
            randomCard = random.nextInt(deck.size());
            cardsOnTheTable[i] = deck.get(randomCard);
            deck.remove(randomCard);
        }
    }

    // раздаём игрокам
    private static void cardDistribution(int playersCount) {
        for (int i = 1; playersCount > 0; playersCount--, i++) {
            Player player = new Player(i);
            for (int j = 0; j < CARD_FOR_EACH_PLAYER; j++) {
                int randomCard = random.nextInt(deck.size());
                player.playerCards.add(deck.get(randomCard));
                deck.remove(randomCard);
            }
            PlayerList.add(player);
        }
    }

}
