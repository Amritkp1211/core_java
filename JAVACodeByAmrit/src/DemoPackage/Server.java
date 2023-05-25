package DemoPackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
   
	public static void main(String[] args) throws IOException {
		 ServerSocket ss=new ServerSocket(1234);
		 Socket s=ss.accept();
		 
		 System.out.println("connection establish");
		 
		 PrintStream pw=new PrintStream(s.getOutputStream());
		 Scanner  sc=new Scanner(System.in);
		 System.out.println("Enter message to be print");
		 String str=sc.nextLine();
		 pw.print(str);
		 pw.close();
		 
	}
}
