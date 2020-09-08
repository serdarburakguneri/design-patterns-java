import java.text.MessageFormat;

public class WordPrinter extends DocumentPrinter {
  @Override
  public void print(String document) {
    System.out.println(MessageFormat.format("Printed as Word document: {0}", document));
  }
}
