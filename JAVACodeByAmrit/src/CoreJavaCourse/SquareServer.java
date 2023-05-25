package CoreJavaCourse;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SquareServer {
	  private final static int BUFSIZE = 20;
	  public static void main(String[] args) {
		  try {
		      int port = Integer.parseInt(args[0]);
		      ServerSocket ss = new ServerSocket(6666);
		      while(true) {		        
		        Socket s = ss.accept();
		        
		        InputStream is = s.getInputStream();
		        DataInputStream dis = new DataInputStream(is);
		        double value = dis.readDouble();
       
		        value *= value;
		 		        
		        OutputStream os = s.getOutputStream();
		        DataOutputStream dos = new DataOutputStream(os);
		        dos.writeDouble(value);
		        s.close();
	}
		  
	} catch (Exception e) {
		e.printStackTrace();
		}
	  }
}
