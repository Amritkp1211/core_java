package DemoPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
   
	public static void main(String[] args) throws IOException, IOException {
		
		Socket s=new Socket("localhost",1234);
		System.out.println("------Client---");
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		   String str=br.readLine();
		  System.out.println("Message is: "+str);		 
	}
}
