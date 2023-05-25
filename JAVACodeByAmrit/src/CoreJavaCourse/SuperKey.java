package CoreJavaCourse;

class Rajasthan{
	 int a,b;
	 static int count;
	 
	 static void add() {
		 int add;
		 Rajasthan r=new Rajasthan();
		 add=r.a+r.b;
		 System.out.println("addition: "+add);
		 System.out.println(count);
	 }
	 
	 public Rajasthan() {
		 a=5;
		 b=8;
		 System.out.println("This is Default SampleA");
	 }
	 
	 public Rajasthan(int a,int b) {
          a=a;
          b=b;
          System.out.println("This is parametrized constructor");
	 }
	 public void displayR() {
		 System.out.println(a);
		 System.out.println(b);
	 }
}

class Sirohi extends Rajasthan{
	int a,b;
	   
	static void sub() {
		int s;
		Sirohi si=new Sirohi();
		s=si.a+si.b;
		System.out.println("subtraction :"+s);
	}
	public Sirohi() {
		super();
		System.out.println(super.a);
		System.out.println(super.b);
		super.displayR();
		a=10;
		b=20;
	}
	public Sirohi(int a,int b) {
		super(5, 7);
		a=a;
		b=b;
		System.out.println("this is parameterized constructor");
	}
	 
	public void displayS() {
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class SuperKey {
     public static void main(String[] args) {
		Sirohi s=new Sirohi();
		  s.displayS();
		  Sirohi.add();
		  Sirohi.sub();
	}
	
}
