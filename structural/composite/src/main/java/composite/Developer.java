package composite;

import java.text.MessageFormat;

public class Developer extends Employee {
  public Developer(String name) {
    super(name);
  }

  @Override
  public void work() {
    System.out.println(MessageFormat.format("{0} is coding", getName()));
  }
}
