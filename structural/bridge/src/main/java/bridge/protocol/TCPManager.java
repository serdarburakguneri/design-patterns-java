package bridge.protocol;

public class TCPManager extends PackageManager {
  @Override
  public void send(byte[] data) {
    System.out.println("Package sent to target with TCP");
  }

  @Override
  public byte[] receive() {
    System.out.println("Package received with TCP");
    return new byte[0];
  }
}
