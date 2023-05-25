package CoreJavaCourse;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Dclient {
     public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		System.out.println("Client Started");
		String s="hey // i am client";
		byte b[]=s.getBytes();
		InetAddress ia=InetAddress.getByName("localhost");
		 DatagramPacket dp=new DatagramPacket(b, b.length, ia, 1406);
		 ds.send(dp);
		 System.out.println("Packet sent-----");
		
				}
}
