import java.text.MessageFormat;

public class Connection {
  private int id;

  public Connection(int id) {
    setId(id);
    System.out.println(MessageFormat.format("A connection with id : {0} is created", getId()));
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void releaseConnection() {
    System.out.println(MessageFormat.format("Connection with id : {0} is released", getId()));
  }
}
