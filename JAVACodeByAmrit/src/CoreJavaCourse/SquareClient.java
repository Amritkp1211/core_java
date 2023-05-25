package CoreJavaCourse;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SquareClient {
	  private final static int BUFSIZE = 20;
	
	public static void main(String[] args) {
		try {
		String str=args[0];
	    int port=Integer.parseInt(args[1]);
	    double value=Double.valueOf(args[2]).doubleValue();
	      // Create socket
	      Socket s = new Socket("localhost",6666);

	      // Write value to server
	      OutputStream os = s.getOutputStream();
	      DataOutputStream dos = new DataOutputStream(os);
	      dos.writeDouble(value);

	      // Read result from server
	      InputStream is = s.getInputStream();
	      DataInputStream dis = new DataInputStream(is);
	      value = dis.readDouble();
	      
	      // Display result
	      System.out.println(value);

	      // Close socket
	      s.close();

			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
