package noPattern;

import java.util.ArrayList;
import java.util.Random;

public class FairDiceGame {
    private Random random = new Random();

    protected ArrayList<Player> playerList = new ArrayList<>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void play() {
        int diceNumber = random.nextInt(6) + 1;
        System.out.println("주사위 눈은~~~ 바로~~~~ " + diceNumber);

        for (Player player : playerList) {
            if(player.getPlayerType().equals(PlayerType.ODD) &&
                diceNumber % 2 == 1) {
                System.out.println(player.getName() + "이(가) 이겼습니다.");
            } else if(player.getPlayerType().equals(PlayerType.EVEN) &&
                diceNumber % 2 == 0) {
                System.out.println(player.getName() + "이(가) 이겼습니다.");
            }
        }
    }
}
