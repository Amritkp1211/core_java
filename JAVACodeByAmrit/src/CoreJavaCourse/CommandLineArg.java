package CoreJavaCourse;

public class CommandLineArg {
  public static void main(String[] args) {
	  try {
		int a=0;
		int sum=0;
		float avg=0;
		  
		for(int i=0;i<args.length;i++) {
			a=Integer.parseInt(args[i]);
			sum=sum+a;
			avg=(float)sum/args.length;
			
		}
		System.out.println("Average is: "+avg);
	} catch (NumberFormatException e)
	  { 
		e.printStackTrace();
	}catch (ArithmeticException e){ 
		e.printStackTrace();
	}

}
}
