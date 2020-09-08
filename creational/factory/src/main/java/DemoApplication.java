/*

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
