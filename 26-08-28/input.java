import java.util.Scanner;
public class input{
     public static void main(String[] args){
      Scanner th_scanner;
      String name;
      int age;
	
   th_scanner= new Scanner(System.in);
   System.out.print("Kindly Enter your name: ");
   name = th_scanner.nextLine();
   System.out.println("Welcome "+ name);
    System.out.print("\n Kindly Enter your age: ");
    age= th_scanner.nextInt();
   
System.out.println("You are "+ age +" yr(s) old.As inputted above.");
    if(age<0){
       System.out.println("Invalid Age");
   }
   else if(age<18){
       System.out.println("You are a child");
   }

   else{
       System.out.println("You are Legal");     	
	}
   th_scanner.close();
 }
}