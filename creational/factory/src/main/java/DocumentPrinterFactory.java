import java.text.MessageFormat;

public class DocumentPrinterFactory {

  public static DocumentPrinter getPrinter(DocumentPrinterType type) {

    if (DocumentPrinterType.PNG_PRINTER.equals(type)) {
      return new PNGPrinter();
    } else if (DocumentPrinterType.PDF_PRINTER.equals(type)) {
      return new PDFPrinter();
    } else if (DocumentPrinterType.WORD_PRINTER.equals(type)) {
      return new WordPrinter();
    } else {
      throw new RuntimeException(MessageFormat.format("{0} is not supported!", type));
    }
  }
}
