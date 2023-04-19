package abstractConcept;

public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirates ce = new ChildEmirates();
		
		ce.bodyColour();
		ce.engine();
		ce.safetyGuideLines();
		ParentAircraft pa = new ChildEmirates();
		
		pa.engine();
		pa.bodyColour();
		

	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("emirates colour");
		
	}
	
	public void emiratesComfort() {
		System.out.println("emirates comfort");
	}

}
