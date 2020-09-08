import java.text.MessageFormat;

public class PDFPrinter extends DocumentPrinter {
  @Override
  public void print(String document) {
    System.out.println(MessageFormat.format("Printed as PDF document: {0}", document));
  }
}
