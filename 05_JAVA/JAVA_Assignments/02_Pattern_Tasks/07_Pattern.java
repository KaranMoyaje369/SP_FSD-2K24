
public class Pattern_7 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int pattern = 1; pattern <= i; pattern++) {
				System.out.print(pattern+" ");
				
			}
			System.out.println();
		}
	}
}


// Output :

//    1
//   1 2
//  1 2 3
// 1 2 3 4
//1 2 3 4 5


