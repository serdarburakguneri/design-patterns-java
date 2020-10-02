import java.util.ArrayList;
import java.util.List;

public class Mediator {

  private List<User> users = new ArrayList<>();
  private UserAccessHandler accessHandler;

  public void registerUser(User user) {
    users.add(user);
  }

  public void setAccessHandler(UserAccessHandler userAccessHandler) {
    this.accessHandler = userAccessHandler;
  }

  public void notifyOthers(User sender, String message) {

    users.forEach(
        user -> {
          if (user != sender && accessHandler.checkAccess(user)) {
            user.receiveMessage(sender, message);
          }
        });
  }
}
