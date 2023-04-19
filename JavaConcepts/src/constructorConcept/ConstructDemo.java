package constructorConcept;

public class ConstructDemo {
	
	public ConstructDemo(int a) {
		System.out.println(a + " parameterized constructor");
	}
	
	public ConstructDemo() {
		System.out.println("in default constructor");
	}
	
	public void getData() {
		System.out.println("in method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructDemo cd1 = new ConstructDemo();
		ConstructDemo cd = new ConstructDemo(5);
		cd.getData();

	}

}
