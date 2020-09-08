import java.text.MessageFormat;

public class PNGPrinter extends DocumentPrinter {
  @Override
  public void print(String document) {
    System.out.println(MessageFormat.format("Printed as PNG document: {0}", document));
  }
}
