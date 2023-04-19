
public class LargestSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {4,-10,0,56,-90};
		
		int large = num[0];
		int small = num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>large) {
				large = num[i];
			}
			else if(num[i]<small) {
				small = num[i];
			}
		}
		
		System.out.println(large);
		System.out.println(small);
	}

}
