package composite;

import java.text.MessageFormat;

public class DevOpsEngineer extends Employee {
  public DevOpsEngineer(String name) {
    super(name);
  }

  @Override
  public void work() {
    System.out.println(MessageFormat.format("{0} is taking care of CI/CD", getName()));
  }
}
