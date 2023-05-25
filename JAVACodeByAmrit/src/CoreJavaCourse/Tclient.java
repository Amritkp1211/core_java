package CoreJavaCourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tclient {
   public static void main(String[] args) throws  UnknownHostException,IOException {
	  Socket s=new Socket("localhost", 6666);
	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	  String str=br.readLine();
	  
	  System.out.println("Message : "+str  );
	  
}
}
