package chapter3;

class A{
	public static String a = "class Var";
	public String b ="instance Var";
}


public class Test {

	public static void main(String[] args) {
		
		System.out.println(A.a); // OK
	//	System.out.println(A.b); // NG
		
		A test1 = new A();
		A test2 = new A();
		
		System.out.println(test1.a);
		System.out.println(test1.b);
		
		System.out.println(test2.a);
		System.out.println(test2.b);
		
		test1.a = "change Var";
		test1.b = "charge Variable";
		
		System.out.println(test1.a);
		System.out.println(test1.b);
		
		System.out.println(test2.a);
		System.out.println(test2.b);		
		
	}
}
