import java.util.HashMap;
import java.util.Map;

public class MediumRegistry {

  private Map<MediumType, Medium> defaultMedia = new HashMap<>();

  public MediumRegistry() {
    Book book = new Book();
    book.setAuthor("Default Author");
    book.setName("Default Book");
    book.setPrice(0);
    defaultMedia.put(MediumType.BOOK, book);

    Album album = new Album();
    album.setSinger("Default Singer");
    album.setName("Default Album");
    album.setPrice(0);
    defaultMedia.put(MediumType.ALBUM, album);
  }

  public Medium createMedium(MediumType type) throws CloneNotSupportedException {
    return (Medium) (defaultMedia.get(type)).clone();
  }
}
