package selection;

public class Selection {
  private int startIndex;
  private int endIndex;

  public Selection(int start) {
    startIndex = start;
  }

  public Selection(int start, int end) {
    startIndex = start;
    endIndex = end;
  }

  public int getStartIndex() {
    return startIndex;
  }

  public int getEndIndex() {
    return endIndex;
  }
}
