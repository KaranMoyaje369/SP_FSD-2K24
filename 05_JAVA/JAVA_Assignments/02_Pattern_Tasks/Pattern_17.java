
public class Pattern_17 {

	public static void main(String[] args) {
		
		int rows = 5;
		int n = 1;
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++ ) {
				System.out.print(n +" ");
				n++;
			}
			
			System.out.println();
		}

	}

}
