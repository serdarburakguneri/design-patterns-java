package composite;

public abstract class Employee {
  protected String name;

  public Employee(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void work();
}
