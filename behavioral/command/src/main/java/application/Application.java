package application;

import command.EditorCommand;

import java.text.MessageFormat;

public class Application {

  public void executeCommand(EditorCommand editorCommand) {
    editorCommand.execute();
    logCommand(editorCommand);
  }

  private void logCommand(EditorCommand editorCommand) {
    System.out.println();
    System.out.println(MessageFormat.format("Log: {0} executed!", editorCommand.getClass()));
    System.out.println();
  }
}
