package DemoPackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Collections {
  public static void main(String[] args) {
	
	  HashMap<String,String> hm=new HashMap<String, String>();
	     	hm.put("1", "Amrit kp");
	     	hm.put("3", "nitin");
	     	hm.put("yb", "YB dedh");
	     	hm.put("dinu" , "dinu prajapat");
	     	System.out.println(hm.hashCode());
	     	
	     	for(Map.Entry e :hm.entrySet()) {
	     		System.out.println( e.getKey()+"  :  "+e.getValue());
	     	}
	     	
	   TreeMap<String, String> tm=new TreeMap<String, String>(hm);
	     
	    	  System.out.println(""+tm);
	      
	      System.out.println(tm.ceilingEntry("1"));
	      
	      
	      Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
	             ht.put("Amrit",1);
	             ht.put("Amrit",1);
	             ht.put("Amrit",14);
	             ht.put("yb",15);
	             ht.put("Aniytin",10);
	             ht.put("Amrit",1);
	             
	             
	             System.out.println(ht);
	  
}
}
