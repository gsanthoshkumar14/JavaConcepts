
public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();
		test2();
		division();
	}
	
	public static void test1() {
		try {
			System.out.println("inside test1");
			throw new RuntimeException("test");
		}
		
		catch(Exception e) {
			System.out.println("inside catch");
		}
		
		finally {
			System.out.println("inside test1 finally");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		
		finally {
			System.out.println("inside test2 finally");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("inside division try");
			int k = 1/0;
		}
		
		catch(NullPointerException e) {//ArithmeticException 
			System.out.println("inside div catch");
		}
		
		finally {
			System.out.println("div finally with exception");
		}
	}

}
