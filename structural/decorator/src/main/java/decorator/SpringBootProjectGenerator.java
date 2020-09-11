package decorator;

public class SpringBootProjectGenerator implements ProjectGenerator {
  @Override
  public void generate() {
    System.out.println("Spring Boot project is created.");
  }
}
