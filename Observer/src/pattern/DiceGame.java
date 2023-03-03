package pattern;

import java.util.ArrayList;

public abstract class DiceGame {
    protected ArrayList<Player> playerList = new ArrayList<>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public abstract void play();
}
