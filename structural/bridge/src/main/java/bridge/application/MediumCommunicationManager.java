package bridge.application;

public abstract class MediumCommunicationManager {
  public abstract void sendFile(byte[] file);

  public abstract byte[] receiveFile();
}
