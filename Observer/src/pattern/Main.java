package pattern;

public class Main {
    public static void main(String[] args) {
        FairDiceGame fairDiceGame = new FairDiceGame();

        fairDiceGame.addPlayer(new OddBettingPlayer("홀수맨"));
        fairDiceGame.addPlayer(new EvenBettingPlayer("짝수맨"));

        fairDiceGame.play();
    }
}