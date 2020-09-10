package bridge.application;

import bridge.protocol.PackageManager;

public class TextCommunicationManager extends MediumCommunicationManager {
  private PackageManager packageManager;

  public TextCommunicationManager(PackageManager packageManager) {
    this.packageManager = packageManager;
  }

  @Override
  public void sendFile(byte[] file) {
    System.out.println("Text is being sent");
    packageManager.send(file);
  }

  @Override
  public byte[] receiveFile() {
    System.out.println("Text received");
    return packageManager.receive();
  }
}
