package composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectManager extends Employee {
  protected List<Employee> subWorkers = new ArrayList<>();

  public ProjectManager(String name) {
    super(name);
  }

  @Override
  public void work() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(
        MessageFormat.format(
            "{0} is managing activities of {1}",
            getName(),
            String.join(
                " and ",
                this.subWorkers.stream().map(Employee::getName).collect(Collectors.toList()))));

    System.out.println(stringBuilder.toString());
  }

  public void addSubWorker(Employee employee) {
    this.subWorkers.add(employee);
  }

  public void removeSubWorker(Employee employee) {
    this.subWorkers.remove(employee);
  }
}
