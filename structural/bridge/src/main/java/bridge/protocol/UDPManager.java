package bridge.protocol;

public class UDPManager extends PackageManager {
  @Override
  public void send(byte[] data) {
    System.out.println("Package sent to target with UDP");
  }

  @Override
  public byte[] receive() {
    System.out.println("Package received with UDP");
    return new byte[0];
  }
}
