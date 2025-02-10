import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = getAnIntFromTheUser(scanner, "Enter first number: ");
        int num2 = getAnIntFromTheUser(scanner, "Enter second number: ");
        
        System.out.println("Sum: " + sumTwoInts(num1, num2));
        compareTwoInts(num1, num2);
        
        scanner.close();
    }
    
    public static int getAnIntFromTheUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
    
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
