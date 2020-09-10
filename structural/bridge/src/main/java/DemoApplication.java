/*
decouple an abstraction from its implementation so that the two can vary independently *GOF

Bridge pattern allows us have flexible implementations.

In this example, Video and Text communication can be done via UDP or TCP protocol.
Video or Text communication implementer classes do not have to know details of UTP or TCP package managers so
changing the protocol is very easy.
*/

import bridge.application.MediumCommunicationManager;
import bridge.application.TextCommunicationManager;
import bridge.application.VideoCommunicationManager;
import bridge.protocol.PackageManager;
import bridge.protocol.TCPManager;
import bridge.protocol.UDPManager;

public class DemoApplication {
  public static void main(String[] args) {

    PackageManager tcpManager = new TCPManager();
    MediumCommunicationManager textCommunicationManager = new TextCommunicationManager(tcpManager);
    textCommunicationManager.sendFile(new byte[0]);
    textCommunicationManager.receiveFile();

    PackageManager udpManager = new UDPManager();
    MediumCommunicationManager videoCommunicationManager =
        new VideoCommunicationManager(udpManager);
    videoCommunicationManager.sendFile(new byte[0]);
    videoCommunicationManager.receiveFile();
  }
}
