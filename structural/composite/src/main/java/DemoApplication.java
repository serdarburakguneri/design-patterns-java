/*
The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
Implementing the composite pattern lets clients treat individual objects and compositions uniformly
 */

import composite.DevOpsEngineer;
import composite.Developer;
import composite.Employee;
import composite.ProjectManager;

public class DemoApplication {
  public static void main(String[] args) {

    Employee developer = new Developer("William");

    Employee devOps = new DevOpsEngineer("Thomas");

    ProjectManager projectManager = new ProjectManager("Frank");

    projectManager.addSubWorker(developer);
    projectManager.addSubWorker(devOps);

    developer.work();
    devOps.work();
    projectManager.work();

    projectManager.removeSubWorker(devOps);
    projectManager.work();
  }
}
