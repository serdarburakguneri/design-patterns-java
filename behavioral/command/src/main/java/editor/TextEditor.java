package editor;

import selection.Selection;

import java.util.Objects;
import java.util.Stack;

public class TextEditor {
  private String content = "";
  private Selection selection;
  private Stack<String> history = new Stack<>();

  public Selection getSelection() {
    return selection;
  }

  public void setSelection(Selection selection) {
    this.selection = selection;
  }

  public void insertText(String text) {
    backUp();
    if (Objects.isNull(selection)) {
      this.content += text;
    } else {
      content = new StringBuilder(content).insert(selection.getStartIndex(), text).toString();
    }
  }

  public void deleteText() {
    if (!Objects.isNull(selection)) {
      backUp();
      content =
          new StringBuilder(content)
              .replace(selection.getStartIndex(), selection.getEndIndex(), "")
              .toString();
    }
  }

  public String getSelectedText() {
    if (!Objects.isNull(selection)) {
      return new StringBuilder(content)
          .substring(selection.getStartIndex(), selection.getEndIndex());
    }
    return null;
  }

  public void rollBack() {
    content = history.pop();
  }

  private void backUp() {
    history.push(content);
  }

  public void showContent() {
    System.out.println("***********TEXT EDITOR*************");
    System.out.println(content);
    System.out.println("***********TEXT EDITOR*************");
  }
}
