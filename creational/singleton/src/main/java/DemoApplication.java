/*
 Singleton Pattern is useful when we should have only 1 instance of an object.
 Imagine that we have a database resource with certain connection capacity and
 ConnectionPoolManager class manages the connections. Having a singleton ConnectionPoolManager
 instance might be a good idea to control resources for all client codes.
 */

public class DemoApplication {
  public static void main(String[] args) {

    ConnectionPoolManager connectionPoolManager = ConnectionPoolManager.getInstance();


    for (int i = 0; i < 5; i++) {
      connectionPoolManager.openConnection();
    }

    connectionPoolManager.releaseAllConnections();

    for (int i = 0; i < 6; i++) {
      connectionPoolManager.openConnection();
    }
  }
}
