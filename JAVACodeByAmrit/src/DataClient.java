import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DataClient {
  public static void main(String[] args) throws IOException {
	
	  DatagramSocket ds=new DatagramSocket();
	  System.out.println("client started");
	      String s="Tectona software solution";
	      byte[] b=s.getBytes();
	      InetAddress ia=InetAddress.getByName("localhost");
	      DatagramPacket dp=new DatagramPacket(b, b.length, ia, 5555);
	      ds.send(dp);
	      System.out.println("message sent successfully");
	  
}
}
