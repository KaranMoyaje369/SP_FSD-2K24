import java.util.Scanner;

public class Task_8 {
	

	public static void main(String[] args) {

        System.out.println("Quadratic Equation is ax^2 + bx + c .............");
        System.out.println();
        
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Coefficient a : ");
		double a = input.nextDouble();
		
		System.out.print("Enter Coefficient b : ");
		double b = input.nextDouble();
		
		System.out.print("Enter Coefficient c : ");
		double c = input.nextDouble();
		
		double discrimint = b * b - 4 * a *c;
		
		if(a == 0) {
			System.out.println("This is Not Quadratic Equation...");
		} else {
			
			if(discrimint > 0) {
				double root1 = (-b + Math.sqrt(discrimint)) / (2 * a);
				double root2 = (-b - Math.sqrt(discrimint)) / (2 * a);
				
				System.out.println("The Roots are Real and Distinct.");
				System.out.println("Root 1 : " +root1);
				System.out.println("Root 2 : " +root2);
				
			} else if (discrimint == 0) {
				
				double root = -b / (2 * a);
				System.out.println("The Roots are real and Equal.");
				System.out.println("Root : " +root);
			} else {
				
				double realPart = -b / (2 * a);
				double imaginaryPart = Math.sqrt(-discrimint) / (2 * a);
				System.out.println("The Roots are Complex and Imaginary.");
				System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
				
			}
			
         
            
		}
	}

}

// Output :


// Quadratic Equation is ax^2 + bx + c .............
//
// Enter Coefficient a : 4
// Enter Coefficient b : 10
// Enter Coefficient c : 4
// The Roots are Real and Distinct.
// Root 1 : -0.5
// Root 2 : -2.0


