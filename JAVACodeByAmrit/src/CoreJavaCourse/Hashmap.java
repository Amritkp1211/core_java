package CoreJavaCourse;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("amrit", "prjpt");
		hm.put("nitin", "prjpt");
		hm.put("Yb", "meghwal");
		hm.put("yuvraj", "singh");
      	
		
		for(Map.Entry e: hm.entrySet()) {
			System.out.println( e.getKey()+"    :     "+e.getValue());
		}
	}
}
