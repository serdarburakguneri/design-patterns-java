import java.util.ArrayList;
import java.util.List;

public class UserAccessHandler {
  private List<User> blackList = new ArrayList<>();

  public void blockUser(User user) {
    blackList.add(user);
  }

  public boolean checkAccess(User user) {
    return !blackList.contains(user);
  }
}
