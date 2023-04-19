
public class ExceptionDemo {

	public int a = 5;
	
	int b = 3;
	
	int c = 1;
	
	//try {
		
	//}
		
		public void getData() {
			int d = 0;
			try {
				d = b/c;
				System.out.println(d);
			}
			catch(ArithmeticException e) {
				System.out.println("Math error");
			}
			catch(Exception e) {
				System.out.println("exception handled");
			}
			finally {
				System.out.println("in final block");
			}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo ed = new ExceptionDemo();
		ed.getData();

	}

}
