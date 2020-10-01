package command;

import editor.TextEditor;

public class Undo implements EditorCommand {

  private TextEditor textEditor;

  public Undo(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public void execute() {
    textEditor.rollBack();
  }
}
