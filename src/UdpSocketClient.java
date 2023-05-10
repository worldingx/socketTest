import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UdpSocketClient {
     public static void main(String[] args) throws IOException {
         DatagramSocket DSocket = new DatagramSocket();
         String message = "好";
         InetAddress localhost = InetAddress.getLocalHost();
         int port = 20221;
         DatagramPacket datagramPacket =
                 new DatagramPacket(message.getBytes(), message.length(),localhost,port);
         System.out.print(new String(message.getBytes()));
         DSocket.send(datagramPacket);
         DSocket.close();

         System.out.print("aaa");
         System.out.print("mastertest");
         System.out.print("hotfix tets");
         System.out.print("push tets");

     }
}
