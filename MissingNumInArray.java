
public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,7,8};
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		int expSum = 0;
		
		for(int i=1;i<=8;i++) {
			expSum = expSum+i;
		}
		
		System.out.println(expSum-sum);
		

	}

}
