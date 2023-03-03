package noPattern;

public class Main {
    public static void main(String[] args) {
        FairDiceGame fairDiceGame = new FairDiceGame();

        fairDiceGame.addPlayer(new Player("홀수맨", PlayerType.ODD));
        fairDiceGame.addPlayer(new Player("짝수맨", PlayerType.EVEN));

        fairDiceGame.play();
    }
}

/*
1. 게임(관심대상)을 확장하려면, 해당 게임의 클래스의 동작(play())과 그 동작에 따른 Player의 행동을 추가로 코딩해주어야 함.
2. 플레이어(관찰자)를 확장하려면, PlayerType을 추가하고, 그에 맞는 관심대상마다의 메서드를 수정해주어야 함.
 */