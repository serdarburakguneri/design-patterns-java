package decorator.dependecy;

import decorator.ProjectGenerator;

public class SpringDataDependencyDecorator extends DependencyDecorator {

  public SpringDataDependencyDecorator(ProjectGenerator projectGenerator) {
    super(projectGenerator);
  }

  @Override
  public void generate() {
    projectGenerator.generate();
    addDependency();
  }

  private void addDependency() {
    System.out.println("Spring Data dependency is added");
  }
}
