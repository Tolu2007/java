import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner th_scanner;
        String name;
        int age, yearOfbirth, currentYear;

        th_scanner = new Scanner(System.in);
        System.out.print("Kindly Enter your name: ");
        name = th_scanner.nextLine();
        System.out.println("Welcome " + name);
        System.out.print("\n Kindly Enter your age: ");
        age = th_scanner.nextInt();
        System.out.print("\n Kindly Enter the current Year: ");
        currentYear = th_scanner.nextInt();

        yearOfbirth = currentYear - age;

        System.out.println("You were born in " + yearOfbirth + " as calculated above");
        th_scanner.close();
    }
}