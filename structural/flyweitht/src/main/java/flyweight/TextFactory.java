package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextFactory {

  private static Map<String, Text> texts = new HashMap<>();

  public static Text valueOf(String content) {
    return texts.computeIfAbsent(content, newContent -> new TextImpl(content));
  }
}
