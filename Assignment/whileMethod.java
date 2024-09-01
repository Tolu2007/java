//Using for whike to find the factorial of numbers
import java.util.Scanner;

public class whileMethod{
    public static void main(String[] args) {
        Scanner th_scanner;
        //Declaring num as the variable name for the inputted number
        int num;
        float factorial; 

        th_scanner = new Scanner(System.in);
        System.out.print("Kindly Input a number: ");
        num = th_scanner.nextInt();

        // Initialize the factorial variable to 1
        factorial = 1;

        // Initialize a counter variable to 1
        int i = 1;

        // Use a while loop to calculate the factorial
         while (i <= num) {
             factorial *= i;i++;
        
         }
         // Display the result
         System.out.println("The factorial of " + num + " is: " + factorial); 
         
         th_scanner.close();
    }
}