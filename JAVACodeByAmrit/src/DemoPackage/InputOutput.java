package DemoPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
    
	 public static void main(String[] args) throws IOException {
		
		 File f=new File("c:\\AMRIT\\demo.txt");
		 FileOutputStream fos=new FileOutputStream(f);
		   String s="My name is amritkp";
		   byte[] b=new byte[s.length()];
		   fos.write(b);
		   fos.flush();
		   fos.close();
		   System.out.println("file written successfully");
           System.out.println("-------------------------------------");
           
           
           FileInputStream fis=new FileInputStream(f);
           int i;
           
           while((i=fis.read())!=-1) {
        	   System.out.println((char)i);
           }
             
           
            
          
           
           
          
           
		   
	}
}
