

public class Pattern_6 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print("  ");
			}
			
			for(int pattern = 1; pattern <= i; pattern++ ) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
			
		}
	
}


// Output : 

//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * *

