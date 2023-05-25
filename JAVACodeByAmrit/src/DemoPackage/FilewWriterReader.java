package DemoPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewWriterReader {
    public static void main(String[] args) throws IOException {
		
    	File f=new File("c:\\AMRIT\\io.txt");
    	
    	FileWriter fw=new FileWriter(f);
    	fw.write("my name is amrit");
    	System.out.println("file written successfully");
    	fw.flush();
    	fw.close();
    	
    	
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
    	System.out.println("file readed successfully");
	}
}
