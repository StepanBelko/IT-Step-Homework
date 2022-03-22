package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.ArrayList;

public class Player {
    String playerName;
    ArrayList<String> playerCards = new ArrayList<>();

    public Player(int playerNum) {
        this.playerName = "Игрок " + playerNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<String> getPlayerCards() {
        return playerCards;
    }

}
