

public class Pattern_26 {

public static void main(String[] args) {

		
		int alpha = 65;
        int rows =5;
        
        for(int i =1; i<=rows; i++) {
       	 
       	 for(int j = 1; j<=i; j++) {
       		 System.out.print("*  ");
       	 }
       	 
       	 System.out.println();
        }
        
        for(int i =rows; i>=1; i--) {
       	 
       	 for(int j = 1; j<i; j++) {
       		 System.out.print("* ");
       	 }
       	 
       	 System.out.println();
        }

	}

}


//Output : 

// *  
// *  *  
// *  *  *  
// *  *  *  *  
// *  *  *  *  *  
// * * * * 
// * * * 
// * * 
// * 
