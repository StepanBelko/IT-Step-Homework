package by.itstep.stpnbelko.homework.stage09.control;

import by.itstep.stpnbelko.homework.stage09.logic.Player;
import by.itstep.stpnbelko.homework.stage09.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.stpnbelko.homework.stage09.logic.PokerClass.*;

//Необходимо написать программу «Simple Poker» (разновидность TEXAS
//HOLD’EM POKER), которая бы генерировала две карты для каждого игрока 
//(количество игроков выбирается самостоятельно, но не больше соответствующего лимита игры) 
//и пять карт на стол. Карты не должны дублироваться.
public class MainTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder msg = new StringBuilder();

        System.out.println("Сколько игроков участвует в игре?");
        int players = scanner.nextInt();

        // Старт игры, создание колоды, сдача карт на стол и игрокам
        startGame(players);

        // Карты на столе:
        msg.append("На столе: \n").append(Arrays.toString(getCardsOnTheTable())).append("\n\n");

        //получение списка всех игроков и их карт.
        for (Player element : getPlayerList()) {
            msg.append(element.getPlayerName()).append(" карты:\n");
            msg.append(element.getPlayerCards()).append("\n\n");
        }

        Printer.printMsg(msg.toString());
    }
}
