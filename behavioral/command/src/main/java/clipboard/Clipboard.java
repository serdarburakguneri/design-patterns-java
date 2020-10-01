package clipboard;

/*
 Imagine that this is the clipboard of our OS.
 */
public class Clipboard {

  private static volatile Clipboard instance = null;

  private String bufferedText;

  private Clipboard() {}

  public static Clipboard getInstance() {

    if (instance == null) {
      synchronized (Clipboard.class) {
        if (instance == null) {
          instance = new Clipboard();
        }
      }
    }

    return instance;
  }

  public String getBufferedText() {
    return bufferedText;
  }

  public void setBufferedText(String bufferedText) {
    this.bufferedText = bufferedText;
  }
}
