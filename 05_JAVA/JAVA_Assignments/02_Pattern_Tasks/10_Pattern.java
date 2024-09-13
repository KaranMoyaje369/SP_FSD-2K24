
public class Pattern_10 {

	public static void main(String[] args) {
		
		int alpha = 69;
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= i; pattern ++) {
				
				System.out.print((char) ( alpha + pattern - i) + " ");
			}
			
			System.out.println();
		}

	}

}


// Output : 

//     E 
//    D E 
//   C D E 
//  B C D E 
// A B C D E
