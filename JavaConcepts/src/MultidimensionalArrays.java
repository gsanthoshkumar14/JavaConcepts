
public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		
		
		
		a[0][0] = 3;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		a[2][0] = 2;
		a[2][1] = 1;
		a[2][2] = 9;
		
		int smallest =a[0][0];
		int largest =a[0][0];
		int mincol=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(a[i][j]<smallest) {
					smallest = a[i][j];
					mincol=j;
				}
				//System.out.print(a[i][j] + "\t");
			}
			//System.out.println("");
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(a[i][j]>largest) {
					largest = a[i][j];
				}
				//System.out.print(a[i][j] + "\t");
			}
			//System.out.println("");
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		
	
		System.out.println(mincol);
		int i=0;
		int max = a[0][mincol];
		//System.out.println(max);
		while(i<3) {
			if(a[i][mincol]>max) {
			max = a[i][mincol];
			}
			i++;
		}
		
		System.out.println(max);
		
		
		
	}

}
