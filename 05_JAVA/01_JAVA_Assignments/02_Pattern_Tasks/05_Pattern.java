

public class Pattern_5 {
	
	public static void main(String[] args) {
		
		int alpha = 65;
		
		for(int i = alpha; i <= 69; i++ ) {
			
			for(int j = alpha; j <= i; j++) {
				
				System.out.print((char)i +" ");
			}
			
			System.out.println();
		}
	}

}


// Output : 

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 

