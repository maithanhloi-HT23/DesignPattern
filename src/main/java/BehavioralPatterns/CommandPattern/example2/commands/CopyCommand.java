package BehavioralPatterns.CommandPattern.example2.commands;

import BehavioralPatterns.CommandPattern.example2.editor.Editor;

public class CopyCommand extends Command{

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
