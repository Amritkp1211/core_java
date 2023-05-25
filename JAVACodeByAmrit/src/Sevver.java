import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sevver {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss=new ServerSocket(2222);
		   while(true) {
			   Socket s= ss.accept();
			   System.out.println("--------connection establish-------");
			  
			   PrintStream ps=new PrintStream(s.getOutputStream());
			       Scanner sc=new Scanner(System.in);
			       System.out.println("Enter message you want print: ");
			       String str=sc.nextLine();
			       ps.print(str);
			       s.close();
		   }
		   
		    
		    
		
	}

}
