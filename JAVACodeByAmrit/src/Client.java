import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
   public static void main(String[] args) throws IOException, IOException {
	 Socket s=new Socket("localhost", 2222);
	  System.out.println("-----Client Started-----");
	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	     String str=br.readLine();
	     System.out.println("message received : " +str);
	     s.close();
	  
}
}
