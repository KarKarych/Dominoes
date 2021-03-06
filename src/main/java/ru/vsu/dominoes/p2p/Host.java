package ru.vsu.dominoes.p2p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Host {
  private ServerSocket socket;

  public Host(String ip, int port) {
    try {
      this.socket = new ServerSocket(port, 8, InetAddress.getByName(ip));
    } catch (IOException ioException) {
      System.out.println("This address is not available for connection");
    }
  }

  public ServerSocket getSocket() {
    return socket;
  }
}
