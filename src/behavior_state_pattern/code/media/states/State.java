package behavior_state_pattern.code.media.states;

import behavior_state_pattern.code.media.ui.Player;

public abstract class State {

    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
