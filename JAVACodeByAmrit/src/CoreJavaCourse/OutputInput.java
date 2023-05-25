package CoreJavaCourse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputInput {
   public static void main(String[] args) throws IOException {
	
	   File f=new File("C:\\\\AMRIT\\\\amirtkp.txt");
	     FileOutputStream fos=new FileOutputStream(f);
	       fos.write('N');
	       fos.write('i');
	       fos.write('t');
	       fos.write('i');
	       fos.write('n');
	       fos.close();
	       System.out.println("file written Sussceefully");
	       
	       System.out.println("-----------------------------");
	       
	       FileInputStream fis=new FileInputStream(f);
	       byte[] b=new byte[(int) f.length()];
	       fis.read(b);
	         for(byte s: b) {
	        	 System.out.println((char)s);
	         }
	   
}
}
