package CoreJavaCourse;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tserver {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);
		while(true) {

			Socket s=ss.accept();
			System.out.println("Connection Establish");
			
			PrintStream pw=new PrintStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the message to be print: ");
			String str=sc.nextLine();
			pw.print(str);
			  s.close();
		}
			 
	
		
	}
}
