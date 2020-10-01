/*
We encapsulate requests as object when we use Command pattern.

In my example;

Receiver Class is TextEditor because it is the class who really does the action when we execute a command.

Invoker Class is Application because it executes commands.

Client class is DemoApplication. Here we have main method and we run demo here.

Command Interface is EditorCommand. It forces all commands to override 'execute' method.

Copy, Delete, Paste and Undo commands are concrete command classes.

This is not a complete text editor project :) It demonstrates Command pattern with some basic commands.

*/

import application.Application;
import clipboard.Clipboard;
import command.*;
import editor.TextEditor;
import selection.Selection;

public class DemoApplication {
  public static void main(String[] args) {

    Application textApplication = new Application();

    TextEditor textEditor = new TextEditor();
    textEditor.showContent();

    // Copy a text to the clipboard
    Clipboard clipboard = Clipboard.getInstance();
    clipboard.setBufferedText("A text from a web page which was copied before.");

    // Paste the text of the clipboard to our text editor
    EditorCommand pasteCommand = new Paste(textEditor);
    textApplication.executeCommand(pasteCommand);

    textEditor.showContent();

    // Choose a desired text : A text from a $web page $which was copied before.
    textEditor.setSelection(new Selection(14, 23));

    // Copy selected text to the clipboard
    EditorCommand copyCommand = new Copy(textEditor);
    textApplication.executeCommand(copyCommand);

    // Select the second index of text: A $text from a web page which was copied before.
    textEditor.setSelection(new Selection(2));

    // Paste the text of the clipboard to the second index : A web page text from a web page which
    // was copied before.
    textApplication.executeCommand(pasteCommand);

    textEditor.showContent();

    // Choose a desired text : A web page text $from a web page $which was copied before.
    textEditor.setSelection(new Selection(16, 32));

    //Delete selected tex: A web page text which was copied before.
    EditorCommand deleteCommand = new Delete(textEditor);
    textApplication.executeCommand(deleteCommand);

    textEditor.showContent();

    // Choose a desired text : $A web $page text which was copied before.
    textEditor.setSelection(new Selection(0, 5));

    //Delete selected tex: text which was copied before.
    textApplication.executeCommand(deleteCommand);

    textEditor.showContent();

    //Undo last command (delete) : A web page text which was copied before.
    EditorCommand undo = new Undo(textEditor);
    textApplication.executeCommand(undo);

    textEditor.showContent();
  }
}
