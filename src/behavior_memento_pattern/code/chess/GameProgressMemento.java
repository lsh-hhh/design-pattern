package behavior_memento_pattern.code.chess;

public class GameProgressMemento {

    private int score;

    public GameProgressMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
