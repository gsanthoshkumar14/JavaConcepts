package oops;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic ct = new AustralianTraffic();
		AustralianTraffic at = new AustralianTraffic();
		ContinentalTraffic cto = new AustralianTraffic();
		
		
		ct.redStop();
		ct.greenGo();
		ct.yellowAlert();
		System.out.println(ct.a);
		at.cyclingBay();
		cto.trainSignal();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Australian green");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Australian red");
	}

	@Override
	public void yellowAlert() {
		// TODO Auto-generated method stub
		System.out.println("Australian yellow");
	}
	
	public void cyclingBay() {
		System.out.println("Australian cycling");
	}

	@Override
	public void trainSignal() {
		// TODO Auto-generated method stub
		System.out.println("Continetal Traffic signal");
		
	}

}
