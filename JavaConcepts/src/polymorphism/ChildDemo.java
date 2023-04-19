package polymorphism;



public class ChildDemo extends ParentDemo{
	

	//function overriding
	public void engine() {
		System.out.println("child engine");
	}

	
	//function overloading
	public void getData() {
		System.out.println("zero args");
	}
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a,int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo cd = new ChildDemo();
		cd.getData();
		cd.getData(5);
		cd.getData("Java");
		cd.getData(5, 6);
		cd.engine();

	}

}
