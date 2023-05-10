import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpSocketCilent {
    public static void main(String[] args) throws  Exception{

        Socket client = new Socket("192.168.0.108", 22234);
        OutputStream outputStream = client.getOutputStream();
         outputStream.write("aaaaa".getBytes());
         client.close();
    }
}
