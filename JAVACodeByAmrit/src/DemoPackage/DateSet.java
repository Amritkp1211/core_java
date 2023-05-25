package DemoPackage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateSet {
   
	public static void main(String[] args) {
		 DateFormat df=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		 java.util.Date d=new java.util.Date();
		 System.out.println(df.format(d));
	}
}
