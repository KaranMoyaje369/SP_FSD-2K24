

public class Pattern_23 {
	
public static void main(String[] args) {
		
		int alpha =65;
		int rows =5;
		
		for(int i =1; i<=rows;i++) {
			
			for(int j=rows; j>i; j--) {
				System.out.print(" ");
			}
			
			int x=1;
			
			for(int p=1; p<=i; p++) {
				
				System.out.print((char)(alpha-1+x)+" ");
				x = x * (i-p) / p;
			}
			
			System.out.println();
		}
	}

}

//Output :

//     A 
//    A A 
//   A B A 
//  A C C A 
// A D F D A 
