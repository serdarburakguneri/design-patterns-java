package command;

import clipboard.Clipboard;
import editor.TextEditor;

import java.util.Objects;

public class Copy implements EditorCommand {

  private TextEditor textEditor;

  public Copy(TextEditor textEditor) {
    this.textEditor = textEditor;
  }

  @Override
  public void execute() {

    if (!Objects.isNull(textEditor.getSelectedText())) {
      Clipboard clipboard = Clipboard.getInstance();
      clipboard.setBufferedText(textEditor.getSelectedText());
    }
  }
}
