
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=0;i<4;i++) {
			
			
			for(int j=1;j<=4-i;j++) {
				
				System.out.print(k + "\t");
				k++;
			}
			System.out.println("");
		}
		
		System.out.println("**********************************************");
		
		int a=1;
		
		for(int b=1;b<=4;b++) {
			for(int c=0;c<b;c++) {
				System.out.print(a + "\t");
				a++;
			}
			System.out.println("");
		}
		
		System.out.println("**********************************************");
		
		for(int d=1;d<=4;d++) {
			for(int e=1;e<=d;e++) {
				System.out.print(e + "\t");
			}
			System.out.println("");
		}
		
		

	}

}
