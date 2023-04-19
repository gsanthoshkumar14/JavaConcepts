package inheritanceConcepts;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		super();
		System.out.println("child constructor");
	}
	
	public String name = "child";
	
	public void audioSystem() {
		System.out.println("audio system implemented");
	}
	
	public void colour() {
		System.out.println(colour);
	}
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cc = new ChildClass();
		
		cc.colour();
		cc.engine();
		cc.brakes();
		cc.getName();
		cc.getData();
		

	}

}
