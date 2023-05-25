package CoreJavaCourse;

import java.io.*;
import java.net.*;

public class Socketclient {
  public static void main(String[] args) {
        
	  try {
		  Socket s=new Socket("localhost",6666);
		  DataOutputStream dis=new DataOutputStream(s.getOutputStream());
		  dis.writeUTF("hello Amrit");
		  dis.flush();
		  dis.close();
		  s.close();
		  
		} catch (Exception e) {
			e.printStackTrace();
		
		}
  }
}
