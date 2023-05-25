package DemoPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DClient {
   public static void main(String[] args) throws IOException {
	 DatagramSocket ds=new DatagramSocket();
	 String s="Neeraj chopra is india's shining star";
	   byte[] b=s.getBytes();
	   InetAddress ia=InetAddress.getByName("localhost");
	   DatagramPacket dp=new DatagramPacket(b, b.length, ia, 3434);
	     ds.send(dp);
	     System.out.println("message sent successfully");
	     ds.close();
}
}
