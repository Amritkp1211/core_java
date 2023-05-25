package CoreJavaCourse;

public class Operator {

	public static void main(String[] args) {
		/*
		 * Logical Operator
		 * boolean A=true; boolean B=false;
		 * 
		 * System.out.println("-------&& and ||  logical operator--------");
		 * System.out.println("A && B"+(A && B));// &&- both condition should be true
		 * System.out.println("A || B "+(A || B));// || -either of the one should be
		 * true
		 */	
	     
		
		/*
		 * # Unary Operator
		 *  int i=5; i=-i;
		 *  System.out.println("Value of I is : "+i);
		 * i++; 
		 * System.out.println("Value of I after Increment: "+i); 
		 * i--;
		 * System.out.println("Value of I after decrement: "+i);
		 */
	     
		
		/*
		 * #TERNARY_OPERATOR 
		 * int i=10, j=5;
		 * 
		 * System.out.println("Ternary Operator: "+(i>j?i:j));
		 */
		  
		/*
		 * //Bitwise Operator
		 * 
		 * char c = 'A';
		 *  byte b = 100; 
		 *  short s = 100;
		 * \ int i = -100; 
		 * long lo = 100;
		 * System.out.println("c & 0xf :: "+(c & 0xf));
		 *  System.out.println("b | 1"+(b |
		 * 1));
		 *  System.out.println("s ^ 1"+(s ^ 1));
		 *   System.out.println("~i :: "+(~i));
		 * System.out.println("lo | 1 :: "+(lo | 1)); 
		 * System.out.println("i >> 2 :: "+(i
		 * >> 2)); 
		 * System.out.println("s >>> 2 :: "+(s >>> 2));
		 * 
		 * System.out.println("i << 2 :: "+(i << 2)); 
		 * System.out.println("i << 2 :: "+(i
		 * << 2));
		 */
	   
		
	//#Assignment Operator Operators ::	+=,-=,*=,/=,%=,<<=,>>=,&=,^=,|=
	   int a=10,b=7;
	   System.out.println("A/=B :"+(a/=b));
	   System.out.println("A<<=B :"+(a<<=b));
	   System.out.println("A<<=B :"+(a>>=b));
	   System.out.println("A&=B :"+(a&=b));
	   System.out.println("A^=B :"+(a^=b));
	   System.out.println("A|=B :"+(a|=b));
	}
}
