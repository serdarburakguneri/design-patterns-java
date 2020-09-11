package decorator.dependecy;

import decorator.ProjectGenerator;

public class SpringWebDependencyDecorator extends DependencyDecorator {

  public SpringWebDependencyDecorator(ProjectGenerator projectGenerator) {
    super(projectGenerator);
  }

  @Override
  public void generate() {
    projectGenerator.generate();
    addDependency();
  }

  private void addDependency() {
    System.out.println("Spring Web dependency is added");
  }
}
