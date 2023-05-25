package CoreJavaCourse;

public class chapter5 {
  
	private void dispaly() {
		System.out.println("this is private method");
	}
	
	public void shpow() {
		dispaly();
		s();
		System.out.println("this is public method");
	}
	static void s() {
		System.out.println("this is static method");
	}
	  public static void main(String[] args) {
		  chapter5 a=new chapter5();
		  a.shpow();
		   s();
	}
}
