import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DataServer {
	
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(5555);
		System.out.println("server started");
		byte[] b=new byte[1000];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		ds.receive(dp);
		String str=new String(dp.getData());
		System.out.println("message received : "+str);
	}

}
