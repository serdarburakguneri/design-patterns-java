package decorator.dependecy;

import decorator.ProjectGenerator;

public class SpringReactiveWebDependencyDecorator extends DependencyDecorator {

  public SpringReactiveWebDependencyDecorator(ProjectGenerator projectGenerator) {
    super(projectGenerator);
  }

  @Override
  public void generate() {
    projectGenerator.generate();
    addDependency();
  }

  private void addDependency() {
    System.out.println("Spring Reactive Web dependency is added");
  }
}
