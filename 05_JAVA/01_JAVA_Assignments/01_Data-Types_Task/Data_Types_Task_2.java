package Data_Types_Tasks;
import java.util.Scanner;


public class Data_Types_Task_2 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Floating Number : ");
		
		float input1 = input.nextFloat();
		
		System.out.printf("%.3f \n",input1);
		System.out.printf("%.2f \n",input1);
		System.out.printf("%.1f \n",input1);
		
	}
}


// Output : 

//Enter Floating Number : 10.5555
//10.556 
//10.56 
//10.6 


