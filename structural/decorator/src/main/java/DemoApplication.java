/*

Decorator pattern enhances an interface of an object.

In this example, SpringBootProjectGenerator creates a template spring boot project.
Dependency decorators add desired dependencies to the template project.

*/

import decorator.SpringBootProjectGenerator;
import decorator.dependecy.SpringDataDependencyDecorator;
import decorator.dependecy.SpringReactiveWebDependencyDecorator;
import decorator.dependecy.SpringSecurityDependencyDecorator;
import decorator.dependecy.SpringWebDependencyDecorator;

public class DemoApplication {
  public static void main(String[] args) {

    System.out.println("Creating first template project...");

    new SpringWebDependencyDecorator(
            new SpringSecurityDependencyDecorator(new SpringBootProjectGenerator()))
        .generate();

    System.out.println("Creating second template project...");

    new SpringReactiveWebDependencyDecorator(
            new SpringSecurityDependencyDecorator(
                new SpringDataDependencyDecorator(new SpringBootProjectGenerator())))
        .generate();
  }
}
