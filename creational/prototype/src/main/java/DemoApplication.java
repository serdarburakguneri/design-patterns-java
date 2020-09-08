/*
Prototype pattern is used for lightweight instance creation.
It can improve the performance if you often create heavy objects.
In this example, we can assume that "medium" objects are hard to create
*/

import java.text.MessageFormat;

public class DemoApplication {
  public static void main(String[] args) throws CloneNotSupportedException {
    MediumRegistry registry = new MediumRegistry();

    Book gameOfThrones = (Book) registry.createMedium(MediumType.BOOK);
    gameOfThrones.setAuthor("George R.R. Martin");
    gameOfThrones.setPrice(8.99);
    gameOfThrones.setName("Game of Thrones");

    Book aClashOfKings = (Book) registry.createMedium(MediumType.BOOK);
    aClashOfKings.setAuthor("George R.R. Martin");
    aClashOfKings.setPrice(9.99);
    aClashOfKings.setName("A Clash of Kings");

    Album pride = (Album) registry.createMedium(MediumType.ALBUM);
    pride.setSinger("White Lion");
    pride.setName("Pride");
    pride.setPrice(9.99);

    System.out.println(
        MessageFormat.format(
            "{0}, which is written by {1}, is {2} $",
            gameOfThrones.getName(), gameOfThrones.getAuthor(), gameOfThrones.getPrice()));

    System.out.println(
        MessageFormat.format(
            "{0}, which is written by {1}, is {2} $",
            aClashOfKings.getName(), aClashOfKings.getAuthor(), aClashOfKings.getPrice()));

    System.out.println(
        MessageFormat.format(
            "{0} album of {1} is {2} $", pride.getName(), pride.getSinger(), pride.getPrice()));
  }
}
