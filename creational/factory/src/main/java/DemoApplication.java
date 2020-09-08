/*
Factory patterns is useful for creating subclasses of an abstract class
(or an interface)

Client code should not care about the instance which factory created.
*/

public class DemoApplication {
  public static void main(String[] args) throws CloneNotSupportedException {
    String document = "Student list of 1-A class";
    DocumentPrinterFactory.getPrinter(DocumentPrinterType.PDF_PRINTER).print(document);
    DocumentPrinterFactory.getPrinter(DocumentPrinterType.PNG_PRINTER).print(document);
    DocumentPrinterFactory.getPrinter(DocumentPrinterType.WORD_PRINTER).print(document);
    DocumentPrinterFactory.getPrinter(DocumentPrinterType.EXCEL_PRINTER).print(document);
  }
}
