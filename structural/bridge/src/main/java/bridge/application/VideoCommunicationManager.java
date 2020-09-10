package bridge.application;

import bridge.protocol.PackageManager;

public class VideoCommunicationManager extends MediumCommunicationManager {

  private PackageManager packageManager;

  public VideoCommunicationManager(PackageManager packageManager) {
    this.packageManager = packageManager;
  }

  @Override
  public void sendFile(byte[] file) {
    System.out.println("Video is being sent");
    packageManager.send(file);
  }

  @Override
  public byte[] receiveFile() {
    System.out.println("Video received");
    return packageManager.receive();
  }
}
