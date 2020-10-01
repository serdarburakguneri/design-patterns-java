package command;

import editor.TextEditor;

public class Delete implements EditorCommand {

  private TextEditor textEditor;

  public Delete(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public void execute() {
    textEditor.deleteText();
  }
}
