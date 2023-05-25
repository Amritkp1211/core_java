package CoreJavaCourse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	 public static void main(String[] args) throws IOException {
		File f=new File("c:\\AMRIT\\filewwirter.txt");
		  FileWriter fw=new FileWriter(f);
		  fw.write("Amrit\n");
		  fw.write("nitin\n");
		  fw.write("yb\n");
		  fw.write("yogesh\n");
		  fw.close();
		  System.out.println("----------file written successfully---------");
       
		  FileReader fr=new FileReader(f);
		  
		  BufferedReader br=new BufferedReader(fr);
		  String str="";
		  
		  while(true) {
			  str=br.readLine();
			  if(str==null) {
				  break;
			  }
			  System.out.println(str);
		  }
		  fr.close();
	}

}
