package behavior_memento_pattern.code.chess;

public class ChessMementoClient {

    public static void main(String[] args) {
        new ChessMementoClient().replayGame();
    }
    public void replayGame() {
        GameOriginator originator = new GameOriginator();
        GameCareTaker careTaker = new GameCareTaker();
        //玩游戏
        originator.playGame();
        //保存进度
        careTaker.saveMemento(originator.saveProcess());
        //退出游戏
        originator.exitGame();

        //重新打开游戏，恢复进度
        originator.restoreProcess(careTaker.getMemento(0));
        originator.playGame();
    }
}
