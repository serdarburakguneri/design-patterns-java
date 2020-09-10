package bridge.protocol;

public abstract class PackageManager {
  public abstract void send(byte[] data);

  public abstract byte[] receive();
}
