import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSocketServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(20221);
        byte[] aByte = new byte[1024*10];
        DatagramPacket datagramPacket = new DatagramPacket(aByte, aByte.length);

        datagramSocket.receive(datagramPacket);
        String hostAddress = datagramPacket.getAddress().getHostAddress();
        byte[] data = datagramPacket.getData();
        System.out.print(new String(data,0,data.length,"UTF-8")+"-----"+hostAddress);
        datagramSocket.close();


    }
}
