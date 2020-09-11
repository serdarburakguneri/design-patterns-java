package decorator.dependecy;

import decorator.ProjectGenerator;

public class SpringSecurityDependencyDecorator extends DependencyDecorator {

  public SpringSecurityDependencyDecorator(ProjectGenerator projectGenerator) {
    super(projectGenerator);
  }

  @Override
  public void generate() {
    projectGenerator.generate();
    addDependency();
  }

  private void addDependency() {
    System.out.println("Spring Security dependency is added");
  }
}
