/*

Mediator centralises the communication of different objects which causes loose coupling.

In this example, communication logic is handled at mediator and users do not directly call each other.

*/

public class DemoApplication {
  public static void main(String[] args) {

    Mediator mediator = new Mediator();

    User captainAmerica = new User(mediator, "captain america");
    User thor = new User(mediator, "thor");
    User loki = new User(mediator, "loki");
    User ironMan = new User(mediator, "iron man");

    UserAccessHandler accessHandler = new UserAccessHandler();
    accessHandler.blockUser(loki);
    mediator.setAccessHandler(accessHandler);

    System.out.println("***");
    captainAmerica.sendMessage("I need some help here!");
    System.out.println("***");
    thor.sendMessage("My hammer is on the way!");
    System.out.println("***");
  }
}
