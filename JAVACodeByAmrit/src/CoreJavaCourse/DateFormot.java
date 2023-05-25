package CoreJavaCourse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormot {
  public static void main(String[] args) {
	
	  DateFormat df=new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	    Date d=new Date();
	    System.out.println("Date :"+df.format(d));
  
	    Calendar c=Calendar.getInstance();
	    System.out.println(df.format(c.getTime()));
	    System.out.println("-------------");
     System.out.println(c);
  }
}
