/*
Using a factory, same instances of an object is provided to the client which is useful for reducing memory usage.
 */

import flyweight.Text;
import flyweight.TextFactory;

public class DemoApplication {
  public static void main(String[] args) {

    Text text1 = TextFactory.valueOf("Hello World!");
    Text text2 = TextFactory.valueOf("Hello World!");
    Text text3 = TextFactory.valueOf("You are beautiful.");

    if (text1 == text2) {
      System.out.println("text1 and text2 instances are same.");
      System.out.println("HashCode of text1:  " + text1.hashCode());
      System.out.println("HashCode of text2:  " + text2.hashCode());
    }

    System.out.println("HashCode of text3:  " + text3.hashCode());
  }
}
