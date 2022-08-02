package behavior_command_pattern.code.example;

import behavior_command_pattern.code.example.editor.Editor;

public class CommandClient {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }

}
