
public class Pattern_8 {

public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = rows; i >= 1; i--) {
			
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int pattern = i; pattern <= rows; pattern++) {
				System.out.print(pattern+" ");
				
			}
			System.out.println();
		}
	}

}

// Output : 

//     5 
//    4 5 
//   3 4 5 
//  2 3 4 5 
// 1 2 3 4 5 



  
    