package decorator.dependecy;

import decorator.ProjectGenerator;

public abstract class DependencyDecorator implements ProjectGenerator {
  protected ProjectGenerator projectGenerator;

  public DependencyDecorator(ProjectGenerator projectGenerator) {
    this.projectGenerator = projectGenerator;
  }
}
