
public class Pattern_9 {

	public static void main(String[] args) {
		
		int alpha = 65;
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= i; pattern ++ ) {
				
				System.out.print((char) (alpha +  pattern - 1) + " ");
			}
			
			
			System.out.println();
		}

	}

}


//output :

//     A 
//    A B 
//   A B C 
//  A B C D 
// A B C D E 


