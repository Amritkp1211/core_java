package CoreJavaCourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
  public static void main(String[] args) throws IOException {
	
	  ServerSocket ss=new ServerSocket(6666);
	    Socket s=ss.accept();
	    System.out.println("connection establish");
	    
	    InputStreamReader isr=new InputStreamReader(s.getInputStream());
	    BufferedReader br=new BufferedReader(isr);
	    
	    String str=br.readLine();
	    System.out.println("Client: "+str);  
	    
	    PrintWriter pr=new PrintWriter(s.getOutputStream());
	      pr.print("yes");
	      pr.flush();
}
}
