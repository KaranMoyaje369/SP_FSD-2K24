
public class Pattern_13 {

	public static void main(String[] args) {
		
		int alpha = 65;
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= i; pattern++) {
				
				System.out.print((char)(alpha + i -1)+" ");
			}
			
			System.out.println();
		}

	}

}


// Output : 


//     A 
//    B B 
//   C C C 
//  D D D D 
// E E E E E 