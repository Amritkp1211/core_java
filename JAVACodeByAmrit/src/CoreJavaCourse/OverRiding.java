package CoreJavaCourse;

class A {
	 
	public void show() {
		int a=10,b=80;
		int c=a+b;
		
		System.out.println(c);
	}
}

class B extends A{
	  public B() {
		  super.show();
	  }
}
public class OverRiding {
  public static void main(String[] args) {
	B a=new B();
	
}
}
