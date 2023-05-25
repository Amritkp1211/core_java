package CoreJavaCourse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOstream {
	 public static void main(String[] args) throws IOException {
		 
		 File f=new File("C:\\AMRIT\\amrit.txt");
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('A');
			fos.write('M');
			fos.write('R');
			fos.write('I');
			fos.write('T');
			fos.write('P');
			fos.close();
			System.out.println("=====done=====");
			
			FileInputStream fis = new FileInputStream(f);
        		byte  b []  = new byte[(int)f.length()];
			    fis.read(b);
			    for(byte x:b) {
				System.out.println((char)x);
				
			  }

	}
}	
