package behavior_state_pattern.code.media;

import behavior_state_pattern.code.media.ui.Player;
import behavior_state_pattern.code.media.ui.UI;

public class MediaClient {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
