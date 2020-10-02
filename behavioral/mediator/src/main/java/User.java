import java.text.MessageFormat;

public class User {
  private String nickName;
  private Mediator mediator;

  public User(Mediator mediator, String nickName) {
    this.mediator = mediator;
    this.nickName = nickName;
  }

  public void receiveMessage(User sender, String message) {
    System.out.println(
        MessageFormat.format(
            "{0} Received Message from {1}: {2}", getNickName(), sender.getNickName(), message));
  }

  public void sendMessage(String message) {
    this.mediator.notifyOthers(this, message);
  }

  public String getNickName() {
    return nickName;
  }
}
