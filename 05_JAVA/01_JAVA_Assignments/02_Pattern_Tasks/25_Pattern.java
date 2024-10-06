

public class Pattern_25 {

	
	public static void main(String[] args) {

		
		int alpha = 65;
        int rows =5;
        
        for(int i =1; i<=rows; i++) {
       	 
       	 for(int j = 1; j<=i; j++) {
       		 System.out.print((char)(alpha+j-1)+" ");
       	 }
       	 
       	 System.out.println();
        }
        
        for(int i =rows; i>=1; i--) {
       	 
       	 for(int j = 1; j<i; j++) {
       		 System.out.print((char)(alpha+j-1)+" ");
       	 }
       	 
       	 System.out.println();
        }

	}

}


// Output :

// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
