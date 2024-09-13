
public class Pattern_2 {

	public static void main(String[] args) {
		
		int alpha = 65;
		
		for(int i = alpha; i <= 69; i++) {
			
			for(int j = alpha; j <= i; j++) {
				System.out.print((char)(j)+ " ");
			}
			
			System.out.println();
		} 
		
	}
}


// Output : 

//
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 

