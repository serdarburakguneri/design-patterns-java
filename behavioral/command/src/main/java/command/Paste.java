package command;

import clipboard.Clipboard;
import editor.TextEditor;

public class Paste implements EditorCommand {

  private TextEditor textEditor;

  public Paste(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public void execute() {
    Clipboard clipboard = Clipboard.getInstance();
    textEditor.insertText(clipboard.getBufferedText());
  }
}
