
public class Pattern_11 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 1; i<= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= (i * 2)-1 ; pattern++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}

// Output : 

//        *
//       ***
//      *****
//     *******
//    *********
