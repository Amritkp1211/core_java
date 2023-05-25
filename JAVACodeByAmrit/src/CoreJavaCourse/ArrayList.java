package CoreJavaCourse;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
   public static void main(String[] args) {
	
	   List<String> al=new java.util.ArrayList<String>();
	      al.add("Amrit");
	      al.add("nitin");
	      al.add("dedh");
	      al.add("vagad");
			/*//
			 * For Each 
			 * for(String s: al) { System.out.println(s); }
			 */
	      
			/*//Iterator
			 * Iterator itr=al.iterator(); while(itr.hasNext()) { String s=(String)
			 * itr.next(); System.out.println(s); }
			 */
	         
			/*LIST ITERATOR
			 * ListIterator<String> li=al.listIterator(al.size()); while(li.hasPrevious()) {
			 * String p=li.previous(); System.out.println(p); }
			 */
	      
			/*Lambda Expression For each
			 * al.forEach(e->{ System.out.println(e); });
			 */
}
}
