
//Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9

public class Task_16 {

	public static void main(String[] args) {
        
        
        int sum = 0;      
        int count = 0;    

        System.out.println("Numbers between 100 and 200 divisible by 9:");

        
        for (int i = 100; i <= 200; i++) {
           
            if (i % 9 == 0) {
                System.out.println(i);  
                sum += i;               
                count++;               
            }
        }

        // Display the results
        System.out.println("Total numbers divisible by 9: " + count);
        System.out.println("Sum of these numbers: " + sum);
    }

}

// Output :

// Numbers between 100 and 200 divisible by 9:
// 108
// 117
// 126
// 135
// 144
// 153
// 162
// 171
// 180
// 189
// 198
// Total numbers divisible by 9: 11
// Sum of these numbers: 1683 




