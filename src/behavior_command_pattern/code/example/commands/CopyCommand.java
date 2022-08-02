package behavior_command_pattern.code.example.commands;

import behavior_command_pattern.code.example.editor.Editor;

public class CopyCommand  extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
