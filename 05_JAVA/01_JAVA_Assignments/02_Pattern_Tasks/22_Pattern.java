

public class Pattern_22 {

	public static void main(String[] args) {
		
		int rows =5;
		
		for(int i =1; i<=rows;i++) {
			
			for(int j=rows; j>i; j--) {
				System.out.print(" ");
			}
			
			int x=1;
			
			for(int p=1; p<=i; p++) {
				
				System.out.print(x+" ");
				x = x * (i-p) / p;
			}
			
			System.out.println();
		}
	}

}

//Output :

//      1 
//     1 1 
//    1 2 1 
//   1 3 3 1 
//  1 4 6 4 1  


