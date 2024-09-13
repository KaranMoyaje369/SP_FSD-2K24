
public class Pattern_12 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= i; pattern++) {
				 System.out.print(i+" ");
			}
			
			System.out.println();
		}

	}

}


// Output : 

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

