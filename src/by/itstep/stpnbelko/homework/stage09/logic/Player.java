package by.itstep.stpnbelko.homework.stage09.logic;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String playerName;
    List<String> playerCards = new ArrayList<>();

    public Player(int playerNum) {
        this.playerName = "Игрок " + playerNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<String> getPlayerCards() {
        return playerCards;
    }

}
