import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocketServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(22221);
        Socket s = server.accept();
        String hostAddress = s.getInetAddress().getHostAddress();
        InputStream inputStream = s.getInputStream();
        byte[] a = new byte[1024];
        int lem = inputStream.read(a);
        System.out.print(new String(a,0,lem));
        s.close();

    }
}
