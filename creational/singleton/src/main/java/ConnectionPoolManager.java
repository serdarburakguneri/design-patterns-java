import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolManager {

  private final int MAX_POOL_SIZE = 5;

  // memory will be preferred instead of cpu cache during read - write operations.
  private static volatile ConnectionPoolManager instance = null;

  // having a private constructor disables client codes creating new instances
  private ConnectionPoolManager() {}

  // null check helps us provide the instance with lazy loading
  public static ConnectionPoolManager getInstance() {

    // synchronized is needed for 'safe' multi threaded applications.
    // otherwise we may create the instance for multiple times
    // when 2 or more thread try to execute getInstance() method at the same time
    if (instance == null) {
      synchronized (ConnectionPoolManager.class) {
        if (instance == null) {
          instance = new ConnectionPoolManager();
        }
      }
    }

    return instance;
  }

  // a connection pool demonstration
  private List<Connection> connectionPool = new ArrayList<Connection>();

  public Connection openConnection() {

    if (connectionPool.size() >= MAX_POOL_SIZE) {
      throw new RuntimeException("Connection pool is full. A new connection can not be created.");
    }

    Connection connection = new Connection(connectionPool.size() + 1);
    connectionPool.add(connection);
    return connection;
  }

  public void releaseAllConnections() {
    connectionPool.forEach(c -> c.releaseConnection());
    connectionPool.clear();
  }
}
