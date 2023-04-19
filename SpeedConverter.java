
public class SpeedConverter {
	
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}
		
		long milesPerHour = Math.round(kilometersPerHour/1.609);
		return milesPerHour;
	}
	
	//public static long to
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long milesPerHour = SpeedConverter.toMilesPerHour(25.6);
		System.out.println(milesPerHour);
	}

}
